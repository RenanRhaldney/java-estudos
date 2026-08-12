package com.renan.vetores.conteudo.entities;

public class Product {
	
	private String nome;
	private double valor;
	
	public Product(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
