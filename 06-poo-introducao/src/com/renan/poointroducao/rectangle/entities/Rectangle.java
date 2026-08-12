package com.renan.poointroducao.rectangle.entities;

public class Rectangle {
	
	public double width;
	public double height;

	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return 2 * (width + height);
	}
	
	public double Diagonal() {
		return Math.sqrt(width * 2 + height * 2);
	}
	
	public String toString() {
		return "AREA = " + 
				String.format("%.2f", Area()) + "\n" +
				"PERIMETER = " + String.format("%.2f", Perimeter()) + "\n" +
				"DIAGONAL = " + String.format("%.2f", Diagonal());
	}
}
