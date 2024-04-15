package controller;

import br.edu.fateczl.filaobj.Fila;
import model.Cliente;

public class Lista02Ex02Controller {

	public Lista02Ex02Controller() {
		super();
	}

	public void caixa(Fila fila) throws Exception {
		
		while (!fila.isEmpty()) {
			Cliente cliente = (Cliente) fila.remove();

			// Calcular valor da compra (quantidade * valor)
			float valorCompra = cliente.getQuantidadePecas() * cliente.getValorPecas();

			valorCompra = Math.round(valorCompra * 100) / 100f; 	//formatar valor para 2 casas decimais
			
			// Exibir nome do cliente e valor da compra
			System.out.println(cliente.getNome()+"	Valor da Compra: R$ "+valorCompra);
		}
	}
}
