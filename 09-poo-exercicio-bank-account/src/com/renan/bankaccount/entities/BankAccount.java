package com.renan.bankaccount.entities;

public class BankAccount {
	
	private int numero;
	private String titular;
	private double balance;
	private double taxaSaque = 5;
	
	public BankAccount(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public BankAccount(int numero, String titular, double initialDeposit) {
		this.numero = numero;
		this.titular = titular;
		deposito(initialDeposit);
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.balance;
	}

	public void deposito(double valor) {
		this.balance += valor;
	}
	
	public void saque(double valor) {
		this.balance -= (valor + this.taxaSaque);
	}
	
	public String toString() {
		return "Account " + this.numero
				+ ", Holder: " + this.titular 
				+ ", Balance: $ " + String.format("%.2f", this.balance); 
	}
}
