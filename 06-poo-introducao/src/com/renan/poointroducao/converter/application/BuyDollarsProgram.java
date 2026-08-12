package com.renan.poointroducao.converter.application;

import java.util.Locale;
import java.util.Scanner;
import com.renan.poointroducao.converter.util.CurrencyConverter;

public class BuyDollarsProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double amountToBuy = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(amountToBuy, dollarPrice));
		
		sc.close();
	}

}
