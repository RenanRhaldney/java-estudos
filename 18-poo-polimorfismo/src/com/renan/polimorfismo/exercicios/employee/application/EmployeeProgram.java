package com.renan.polimorfismo.exercicios.employee.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.renan.polimorfismo.exercicios.employee.entities.Employee;
import com.renan.polimorfismo.exercicios.employee.entities.OutsorcedEmployee;

public class EmployeeProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee> employees = new ArrayList<>();

		System.out.print("Enter the number of employees: ");
		int quantityEmployee = sc.nextInt();

		for (int i = 1; i <= quantityEmployee; i++) {

			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("name: ");
			String name = sc.nextLine();

			System.out.print("hours: ");
			int hours = sc.nextInt();

			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();

			if (outsourced == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				employees.add(new OutsorcedEmployee(name, hours, valueHour, additionalCharge));
			} else {
				employees.add(new Employee(name, hours, valueHour));
			}
		}

		System.out.println("\n" + "PAYMENTS:");
		for (Employee e : employees) {
			System.out.printf("%s - $ %.2f%n", e.getName(), e.payment());
		}

		sc.close();
	}
}
