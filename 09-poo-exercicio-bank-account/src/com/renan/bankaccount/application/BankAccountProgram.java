package com.renan.bankaccount.application;

import java.util.Locale;
import java.util.Scanner;

import com.renan.bankaccount.entities.BankAccount;

public class BankAccountProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankAccount bankAccount = null;
		
		System.out.print("Enter account number: ");
		int accountNumer = sc.nextInt();
		sc.nextLine(); // limpa o buffer
		
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char hasInitialDeposit = sc.next().charAt(0);
		
		double initialDeposit;
		
		switch (hasInitialDeposit) {
			case 'y': {
				System.out.print("Enter initial deposit value: ");
				initialDeposit = sc.nextDouble();
				bankAccount = new BankAccount(accountNumer, holder, initialDeposit);
				break;
			}
			case 'n': {
				bankAccount = new BankAccount(accountNumer, holder);
				break;
			}
		default:
			System.out.println("Dado inválido.");
		}
		
		System.out.println(); // aqui pula uma linha
		System.out.println("Account data:");
		System.out.println(bankAccount);
		
		System.out.println(); // aqui pula uma linha
		System.out.print("Enter a deposit value: ");
		bankAccount.deposito(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(bankAccount);
		
		System.out.println(); // aqui pula uma linha
		System.out.print("Enter a withdraw value: ");
		bankAccount.saque(sc.nextDouble());
		
		System.out.println("Update account data:");
		System.out.println(bankAccount);
		
		sc.close();
	}

}
