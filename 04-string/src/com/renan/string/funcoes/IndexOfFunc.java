package com.renan.string.funcoes;

public class IndexOfFunc {

    public static void main(String[] args) {
        
        String texto = "Java é legal";
        
        // indexOf(String str)
        // Retorna o índice da primeira ocorrência da string passada
        // Parâmetro: string a ser buscada (String)
        int posicao = texto.indexOf("legal");
        
        System.out.println("Texto: " + texto);
        System.out.println("Posição da palavra 'legal': " + posicao);
    }
}