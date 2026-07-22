package Conteudo;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade;
		String nome, cidade, cep;

		System.out.println("Informe sua idade:");
		idade = sc.nextInt();
		sc.nextLine();

		System.out.println("Qual é seu nome?");
		nome = sc.nextLine();

		System.out.println("Qual a cidade que você mora?");
		cidade = sc.nextLine();

		System.out.println("Digite seu cep");
		cep = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(idade);
		System.out.println(nome);
		System.out.println(cidade);
		System.out.println(cep);

		sc.close();
	}

}
