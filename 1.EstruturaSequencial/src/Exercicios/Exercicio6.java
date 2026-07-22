package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		// mostre:
		//	a) a área do triângulo retângulo que tem A por base e C por altura.
		//	b) a área do círculo de raio C. (pi = 3.14159)
		//	c) a área do trapézio que tem A e B por bases e C por altura.
		//	d) a área do quadrado que tem lado B.
		//	e) a área do retângulo que tem lados A e B.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triagulo, circulo, trapezio, quadrado, retangulo;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triagulo = A * C / 2;
		circulo = C * C * 3.14159;
		trapezio = (A + B) * C / 2;
		quadrado = B * B;
		retangulo = A * B;
		System.out.printf("TRIANGULO: %.3f\n"
				+ "CIRCULO: %.3f\n"
				+ "TRAPEZIO: %.3f\n"
				+ "QUADRADO: %.3f\n"
				+ "RETANGULO: %.3f\n", triagulo, circulo, trapezio, quadrado, retangulo );
		
		sc.close();

	}

}
