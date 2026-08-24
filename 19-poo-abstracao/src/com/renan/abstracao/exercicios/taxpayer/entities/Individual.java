package com.renan.abstracao.exercicios.taxpayer.entities;

public class Individual extends Taxpayer{
	private Double healthExpenses;

	public Individual() {
		super();
	}
	
	public Individual(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

	@Override
	public Double calculateIncomeTax() {
		
		double tax = getAnnualIncome() < 20000.00 
				? getAnnualIncome() * 0.15 
				: getAnnualIncome() * 0.25 ;
		
		return tax - healthExpenses *0.50;
	}
	
}
