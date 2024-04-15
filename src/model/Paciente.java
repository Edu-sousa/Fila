package model;

import javax.swing.JOptionPane;

import br.edu.fateczl.filaobj.Fila;
import controller.Lista01Ex05Controller;

public class Paciente {

	String nome;
	int numero;
	
	public Paciente(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
}

