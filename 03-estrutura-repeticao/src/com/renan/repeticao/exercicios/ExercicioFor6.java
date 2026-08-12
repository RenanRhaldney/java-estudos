package com.renan.repeticao.exercicios;

import java.util.Scanner;

public class ExercicioFor6 {

	public static void main(String[] args) {
		//Ler um número inteiro N e calcular todos os seus divisores.
		Scanner sc = new Scanner(System.in);
		
		int qtdRepeticao = sc.nextInt();
		
		for (int i = 1; i <= qtdRepeticao; i ++) {
			if (qtdRepeticao % i == 0) {
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
