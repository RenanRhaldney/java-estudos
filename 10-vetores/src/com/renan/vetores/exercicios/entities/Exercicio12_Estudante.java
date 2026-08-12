package com.renan.vetores.exercicios.entities;

public class Exercicio12_Estudante {
	
	private String nome;
	private String email;
	
	public Exercicio12_Estudante (String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return nome + ", " + email ;
	}
	

}
