package com.renan.string.funcoes;

public class LastIndexOfFunc {

    public static void main(String[] args) {
        
        String texto = "banana";
        
        // lastIndexOf(String str)
        // Retorna a posição da última ocorrência da string passada
        // Parâmetro: string a ser buscada (String)
        int posicao = texto.lastIndexOf("a");
        
        System.out.println("Texto: " + texto);
        System.out.println("Última posição da letra 'a': " + posicao);
    }
}