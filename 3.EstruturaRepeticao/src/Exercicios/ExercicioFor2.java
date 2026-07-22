package Exercicios;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo).
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de repetições.");
		int qdtEntrada = sc.nextInt();
		int dentroDoIntervalo = 0;
		int foraDoIntervalo = 0;
				
		for(int i = 0; i < qdtEntrada; i++) {
			
			System.out.println("Informe um numero.");
			int entrada = sc.nextInt();
			if(entrada >= 10 && entrada <= 20) {
				dentroDoIntervalo += 1;
			}
			else {
				foraDoIntervalo += 1;
			}
		}
		
		System.out.printf("%d in\n %d out\n", dentroDoIntervalo, foraDoIntervalo);
		
		sc.close();

	}

}
