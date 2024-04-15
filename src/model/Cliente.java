package model;

public class Cliente {

	String nome;
	int quantidadePecas;
	float valorPecas;

	public Cliente(String nome, int quantidadePecas, float valorPecas) {
		super();
		this.nome = nome;
		this.quantidadePecas = quantidadePecas;
		this.valorPecas = valorPecas;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidadePecas() {
		return quantidadePecas;
	}

	public float getValorPecas() {
		return valorPecas;
	}
	
}
