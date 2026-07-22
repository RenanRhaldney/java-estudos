package Conteudo;
import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {

		// Variável
		int number = 32;
		double pi = 3.141592;
		String nome = "Maria";
		byte idade = 77;
		double renda = 4000.0;

		// println pula linha
		System.out.println("Bom dia");
		System.out.println(number);
		System.out.println(pi);
		// %.2f é utilizado para limitar a quantidade de numeros que vão ser exibidos
		// após a virgula ou ponto e o %n é utilizado para quebrar pinha "pular linha"
		System.out.printf("%.2f%n", pi);
		System.out.printf("%.4f%n", pi);
		// Configuração de localidade, alterar de virgula para ponto valores com
		// decimais, baseado no local passado no parametro
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", pi);
		// Concatenação
		System.out.println("O valor de PI é " + pi);
		// Concatenação com %f
		System.out.printf("Resultado = %.2f metros%n", pi);

		System.out.printf("%s tem %d anos e possui uma renda de R$ %.2f", nome, idade, renda);

	}
}