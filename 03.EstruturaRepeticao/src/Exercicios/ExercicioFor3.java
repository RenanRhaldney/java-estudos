package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
		
		/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
		de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
		peso 5*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("infomme a quantidade de repetições");
		int qtdRepeticao = sc.nextInt();
		int peso1 = 2, peso2 = 3, peso3 = 5;
		
		for (int i = 0; i < qtdRepeticao; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			
			double mediaPonderada = ((valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)) / (peso1 + peso2 + peso3);

			System.out.printf("Media ponderada = %.1f%n",mediaPonderada);
		}
		
		sc.close();

	}

}
