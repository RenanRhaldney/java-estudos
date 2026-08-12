package com.renan.string.funcoes;

public class CharAtFunc {

    public static void main(String[] args) {
        
        String texto = "Java";
        
        // charAt(int index)
        // Retorna o caractere na posição especificada
        // Parâmetro: índice do caractere (int)
        char letra = texto.charAt(1);
        
        System.out.println("Texto: " + texto);
        System.out.println("Caractere na posição 1: " + letra);
    }
}