package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;
import controller.Lista01Ex05Controller;
import model.Paciente;

public class Lista01Ex05 {

	public static void main(String[] args) throws Exception {
		Lista01Ex05Controller atendimento = new Lista01Ex05Controller();
		Fila fila = new Fila();
		Fila filaPreferencial = new Fila();

		int num = 1;
		int senha = 1, senhaPreferencial = 1;

		while (num != 0) {

			num = Integer.parseInt(JOptionPane.showInputDialog(
					"\tEscolha \n1- Inserir nova senha \n2- Inserir nova senha prioritaria \n3- Chamar Paciente \n0- Sair"));

			switch (num) {
			case 1:
				// inserir nova senha na fila
				fila.insert(senha);
				senha++;
				break;
			case 2:
				// inserir nova senha na fila prioritaria
				filaPreferencial.insert(senhaPreferencial);
				senhaPreferencial++;
				break;
			case 3:
				// chamar senha para atendimento
				atendimento.chamarProximo(fila, filaPreferencial);
				break;
			case 0:
				num = 0;
				break;
			}
		}
	}
}
