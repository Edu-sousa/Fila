package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Paciente;

public class Lista01Ex05Controller {

	static int atendimentoPreferencial = 0;

	public void chamarProximo(Fila fila, Fila filaPreferencial) throws Exception {
		
		// Fazer 3 chamadas prioritárias para 1 da fila não prioritária
		if (!filaPreferencial.isEmpty() && atendimentoPreferencial < 3) { 

			System.out.println("Atendimento prioritário: " + filaPreferencial.remove());
			atendimentoPreferencial++;
		} else if (!fila.isEmpty()) { // Se não houver prioritários, já se deve chamar dos não prioritários
			System.out.println("Atendimento regular: " + fila.remove());
			atendimentoPreferencial = 0;
		} else {
			System.out.println("Não há ninguém na fila para ser chamado.");
		}
	}
}