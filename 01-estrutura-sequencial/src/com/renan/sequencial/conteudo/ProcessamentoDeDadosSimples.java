package com.renan.sequencial.conteudo;

public class ProcessamentoDeDadosSimples {

	public static void main(String[] args) {
		//Exemplo 1
		int number_1, number_2;
		number_1 = 5;
		number_2 = 2 * number_1;

		System.out.println(number_1);
		System.out.println(number_2);
		
		//Exemplo 2
		int valor_1;
		double valor_2;
		valor_1 = 5;
		valor_2 = 2 * valor_1;
		System.out.println(valor_1);
		System.out.println(valor_2);
		
		//Exemplo 3
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		//Exemplo 4
		int x, y;
		double resultado;
		x = 5;
		y = 2;
		resultado = x / y;
		System.out.println(resultado);
	}

}
