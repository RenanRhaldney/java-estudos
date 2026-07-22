package aplication;

import entities.Pessoa;

public class PessoaProgram {

	public static void main(String[] args) {
        // Usando diferentes construtores
        Pessoa p1 = new Pessoa(); // Construtor padrão
        Pessoa p2 = new Pessoa("João", 25); // Construtor com 2 parâmetros
        Pessoa p3 = new Pessoa("Maria", 30, "maria@email.com"); // Construtor completo
        Pessoa p4 = new Pessoa("Pedro"); // Construtor com apenas nome
        
        System.out.println("\nInformações dos objetos criados:");
        p1.exibirInfo();
        p2.exibirInfo();
        p3.exibirInfo();
        p4.exibirInfo();
    }

}
