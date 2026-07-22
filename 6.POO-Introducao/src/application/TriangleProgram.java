package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class TriangleProgram {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Criando novas instancias do Objeto Triangle
		//As variaveis x e y, vao está na stack com o endereço que referencia o objeto na memoria heap
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//Modo de como calculava a area antes de ter o metodo de calculo na class Triagle
//		double p = (x.a + x.b + x.c) / 2.0;
//		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
//		
//		p = (y.a + y.b + y.c) / 2.0;
//		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		double areaX = x.area();
		double areaY = y.area(); 
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		sc.close();
	}

}
