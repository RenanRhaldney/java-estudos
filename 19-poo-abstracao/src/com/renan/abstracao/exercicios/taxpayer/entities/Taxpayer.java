package com.renan.abstracao.exercicios.taxpayer.entities;

public abstract class Taxpayer {
	private String name;
	private Double annualIncome;

	public Taxpayer() {
	}

	public Taxpayer(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public abstract Double calculateIncomeTax();
	
	public String printTax() {
		return String.format("%s: $ %.2f", getName(), calculateIncomeTax());
	}
}
