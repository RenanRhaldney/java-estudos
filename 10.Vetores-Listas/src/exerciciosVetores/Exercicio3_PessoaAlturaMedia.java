package exerciciosVetores;

import java.util.Locale;
import java.util.Scanner;
import exerciciosEntities.Exercicio3_Pessoa;

public class Exercicio3_PessoaAlturaMedia {

	public static void main(String[] args) {

//		Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//		tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//		bem como os nomes dessas pessoas caso houver.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double soma = 0.0, media, porcentagem;
		int qtdPessoasMenorIdade = 0;

		System.out.print("Quantas pessoas serao digitadas?");
		int qtdPessoas = sc.nextInt();

		Exercicio3_Pessoa[] vetor = new Exercicio3_Pessoa[qtdPessoas];

		for (int i = 0; i < vetor.length; i++) {
			
			//Criando o objeto para cada posição dentro do vetor.
			vetor[i] = new Exercicio3_Pessoa();
			
			// Entrada de dados
			System.out.printf("Dados da %d a pessoa:\n", i+1);
			
			System.out.print("Nome: ");
			sc.nextLine(); // limpa o ENTER pendente
			vetor[i].setNome(sc.nextLine());

			System.out.print("Idade: ");
			vetor[i].setIdade(sc.nextInt());

			System.out.print("Altura: ");
			vetor[i].setAltura(sc.nextDouble());

			// Soma as alturas das pessoas
			soma += vetor[i].getAltura();
			
			//Quantidade de pessoas que são de menor de idade
			if (vetor[i].getIdade() < 16) {
				qtdPessoasMenorIdade++;
			}
		}
		
		//Porcentagem de pessoas que sao menor de idade
		porcentagem = (double)qtdPessoasMenorIdade / vetor.length * 100;

		// Media das alturas
		media = soma / vetor.length;
		System.out.printf("\nAltura média: %.2f%n", media);

		
		System.out.printf("Pessoas coom menos de 16 anos: %.1f%%%n", porcentagem);
		
		//Imprime o nome das pessoas menor de idade
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}

		sc.close();

	}
}
