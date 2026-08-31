package com.renan.tratamentoexcecoes.exercicios.account.model.entities;

import com.renan.tratamentoexcecoes.exercicios.account.model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void deposit(double value) {
		balance += value;
	}
	
	public void withdraw(double value) throws DomainException {
		if (value > getWithdrawLimit()) {
			throw new DomainException("The amount exceeds withdraw limit");
		}
		if (value > getBalance()) {
			throw new DomainException("Not enough balance");
		}
		balance -= value;
	}
}
