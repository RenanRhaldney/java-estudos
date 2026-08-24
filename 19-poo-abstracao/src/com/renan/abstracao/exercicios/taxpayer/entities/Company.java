package com.renan.abstracao.exercicios.taxpayer.entities;

public class Company extends Taxpayer {
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double calculateIncomeTax() {

		return numberOfEmployees > 10
				? getAnnualIncome() * 0.14
				: getAnnualIncome() * 0.16;
	}
}
