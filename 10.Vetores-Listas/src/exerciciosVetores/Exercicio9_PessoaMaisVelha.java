package exerciciosVetores;

import java.util.Scanner;

public class Exercicio9_PessoaMaisVelha {

	public static void main(String[] args) {

//		Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//		devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//		da pessoa mais velha. 

		Scanner sc = new Scanner(System.in);
		
		int maiorIdade, posicaoMaiorIdade = 0;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		//Cria os arrays de nome e idade
		String[] vetorNome = new String[n];
		int[] vetorIdade = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Dados da %d pessoa:", i + 1);
			System.out.print("\nNome: ");
			sc.nextLine();
			vetorNome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			vetorIdade[i] = sc.nextInt();
		}
		
		maiorIdade = vetorIdade[0];
		
		//logica para descobrir a maior idade do array e a posição
		for (int i = 0; i < n; i++) {
			if (maiorIdade < vetorIdade[i]) {
				maiorIdade = vetorIdade[i];
				posicaoMaiorIdade = i;
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + vetorNome[posicaoMaiorIdade]);
		
		sc.close();
	}
}
