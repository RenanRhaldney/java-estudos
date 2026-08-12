package com.renan.poointroducao.employee.application;

import java.util.Locale;
import java.util.Scanner;

import com.renan.poointroducao.employee.entities.Employee;

public class EmployeeProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee.toString());
		
		System.out.print("Which percentage to increase salary? ");
		
		employee.IncreaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + employee.toString());
		
		sc.close();
	}

}
