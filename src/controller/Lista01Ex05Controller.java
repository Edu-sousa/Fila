package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Paciente;

public class Lista01Ex05Controller {

	static int atendimentoPreferencial = 0;

	public void chamarProximo(Fila fila, Fila filaPreferencial) throws Exception {
		
		// Fazer 3 chamadas priorit�rias para 1 da fila n�o priorit�ria
		if (!filaPreferencial.isEmpty() && atendimentoPreferencial < 3) { 

			System.out.println("Atendimento priorit�rio: " + filaPreferencial.remove());
			atendimentoPreferencial++;
		} else if (!fila.isEmpty()) { // Se n�o houver priorit�rios, j� se deve chamar dos n�o priorit�rios
			System.out.println("Atendimento regular: " + fila.remove());
			atendimentoPreferencial = 0;
		} else {
			System.out.println("N�o h� ningu�m na fila para ser chamado.");
		}
	}
}