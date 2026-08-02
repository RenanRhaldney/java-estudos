package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, tempoJogado;
		
		System.out.println("Qual horário que você iniciou o jogo?");
		horaInicial = sc.nextInt();
		
		System.out.println("Agora informe a hora que você saiu do jogo.");
		horaFinal = sc.nextInt();
		
		tempoJogado = horaFinal - horaInicial;
		
		if (tempoJogado < 0) {
			tempoJogado += 24;
		}
		else {
			tempoJogado = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempoJogado);
		
		
		sc.close();

	}

}
