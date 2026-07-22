package entities;

public class Student {
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	public double media;
	
	public void CalcNotafinal() {
		media = nota1 + nota2 + nota3;
	}

	public String toString () {
		CalcNotafinal();
		if (media >= 60) {
			return "FINAL GRADE = " +
					String.format("%.2f", media) +
					"\nPASS";
		}
		else {
			return "FINAL GRADE = " +
					String.format("%.2f", media) +
					"\nFAILED\n" +
					"MISSING " + String.format("%.2f", 60 - media) +
					" POINTS";
					
		}
	
	}
}
