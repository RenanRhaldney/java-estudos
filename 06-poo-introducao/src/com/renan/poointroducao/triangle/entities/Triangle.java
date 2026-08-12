//Pacote da classe
package com.renan.poointroducao.triangle.entities;

//Prefixo public indica que a classe, atributo ou metodo podem ser usador em outros arquivos "classes"
//Triagle nome da classe
public class Triangle {
	
	//Atributos da classe
	public double a;
	public double b;
	public double c;
	
	//"double" tipo do dado que retorna ao chamar o metodo, caso o metodo nao retorne nada, se utiliza void
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
		 
	}

}
