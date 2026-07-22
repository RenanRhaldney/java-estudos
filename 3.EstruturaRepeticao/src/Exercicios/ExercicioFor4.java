package Exercicios;


import java.util.Scanner;

public class ExercicioFor4 {

	public static void main(String[] args) {
		/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
		segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

		Scanner sc = new Scanner(System.in);
		
		int qtdRepeticao = sc.nextInt();
		
		for (int i = 0; i < qtdRepeticao; i++) {
			
			int numerador = sc.nextInt();
			int denominador = sc.nextInt();
			
			if (denominador == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) numerador / denominador;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
	}

}
