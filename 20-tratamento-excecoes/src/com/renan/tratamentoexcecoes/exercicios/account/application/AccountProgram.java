package com.renan.tratamentoexcecoes.exercicios.account.application;

import java.util.Locale;
import java.util.Scanner;

import com.renan.tratamentoexcecoes.exercicios.account.model.entities.Account;
import com.renan.tratamentoexcecoes.exercicios.account.model.exception.DomainException;

public class AccountProgram {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();

		System.out.print("Holder: ");
		String holder = sc.nextLine();

		sc.nextLine();
		System.out.print("Inicital balance: ");
		double balance = sc.nextDouble();

		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);

		System.out.println("");
		System.out.print("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		try {
			account.withdraw(withdraw);
			System.out.printf("New balance: %.2f", account.getBalance());

		} catch (DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	}

}
