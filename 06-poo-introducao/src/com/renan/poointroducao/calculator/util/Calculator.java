package com.renan.poointroducao.calculator.util;

public class Calculator {
	
	//Atributos e métodos estáticos pertencem à classe, e não às suas instâncias. Por isso, 
	//podem ser acessados diretamente pelo nome da classe, sem a necessidade de instanciá-la.
	public static final double PI = 3.141516;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
	}

}
