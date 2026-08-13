package com.renan.composicao.worker.application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import com.renan.composicao.worker.entities.Department;
import com.renan.composicao.worker.entities.HourContract;
import com.renan.composicao.worker.entities.Worker;
import com.renan.composicao.worker.entities.enums.WorkerLevel;

public class WorketProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatterMonthYear = DateTimeFormatter.ofPattern("MM/yyyy");

		System.out.print("Enter department's name: ");
		String departmenName = sc.nextLine();
		System.out.println("Enter worker data:");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmenName));

		System.out.print("How many contracts to this worker? ");
		int numberOfContracts = sc.nextInt();

		for (int i = 0; i < numberOfContracts; i++) {
			System.out.println("Enter contract #" + (i + 1) + " data:");

			System.out.print("Date (DD/MM/YYYY): ");
			sc.nextLine();
			String dateString = sc.nextLine();
			LocalDate date = LocalDate.parse(dateString, formatter);

			System.out.print("Value per hour: ");
			double valueHour = sc.nextDouble();

			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();

			HourContract contract = new HourContract(date, valueHour, hours);

			worker.addContract(contract);

		}
		
		System.out.println("");
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		sc.nextLine();
		String mesAnoString = sc.nextLine();
		YearMonth date = YearMonth.parse(mesAnoString, formatterMonthYear);
		int month = date.getMonthValue();
		int year = date.getYear();
		double income = worker.income(year, month);

		System.out.println("Name: " + worker.getNome());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.printf("Income for %s: %.2f", mesAnoString, income);
		sc.close();
	}
}
