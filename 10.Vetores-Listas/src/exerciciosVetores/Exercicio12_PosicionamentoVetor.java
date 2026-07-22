package exerciciosVetores;

import java.util.Iterator;
import java.util.Scanner;

import exerciciosEntities.Exercicio12_Estudante;
import exerciciosEntities.Exercicio3_Pessoa;

public class Exercicio12_PosicionamentoVetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroQuarto = 0;
		
		Exercicio12_Estudante[] quarto = new Exercicio12_Estudante[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int qtdQuatosAlugados = sc.nextInt();
		

		
		for(int i = 0; i < qtdQuatosAlugados; i++) {
			System.out.printf("Aluguel #%d: \n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Numero do quarto: ");
			numeroQuarto = sc.nextInt() - 1;
			
			quarto[numeroQuarto] = new Exercicio12_Estudante(nome, email);
		}
		
		for(int i = 0;i < quarto.length; i++) {
			if (quarto[i] != null) {
				System.out.printf("%d: %s", i+1, quarto[i].toString());
			}
		}
		
		sc.close();
	}

}
