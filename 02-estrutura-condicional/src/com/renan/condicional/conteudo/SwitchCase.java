package com.renan.condicional.conteudo;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int dia = sc.nextInt();
		String diaDaSemana;

		switch (dia) {
		case 1:
			diaDaSemana = "domingo";
			break;
		case 2:
			diaDaSemana = "segunda";
			break;
		case 3:
			diaDaSemana = "terça";
			break;
		case 4:
			diaDaSemana = "quarta";
			break;
		case 5:
			diaDaSemana = "quinta";
			break;
		case 6:
			diaDaSemana = "sexta";
			break;
		case 7:
			diaDaSemana = "sabado";
			break;
		default:
			diaDaSemana = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + diaDaSemana);

		sc.close();
	}

}
