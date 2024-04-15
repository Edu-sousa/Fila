package view;


import br.edu.fateczl.filaobj.Fila;
import controller.Lista02Ex02Controller;
import model.Cliente;

public class Lista02Ex02 {

	public static void main(String[] args) throws Exception {

		Lista02Ex02Controller supermercado = new Lista02Ex02Controller();
		Fila fila = new Fila();

		for (int i = 1; i <= 20; i++) {

			String nome = "Cliente " + i;
			int qtdPecas = (int) ((Math.random() * 31) + 20);
			float valorPecas = (float) ((Math.random() * 96.00) + 5.00);

			Cliente cliente = new Cliente(nome, qtdPecas, valorPecas);
			
			fila.insert(cliente);
		}
		supermercado.caixa(fila);
	}
}
