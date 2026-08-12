package com.renan.string.funcoes;

public class SubstringFunc1 {

    public static void main(String[] args) {
        
        String texto = "Programação";
        
        // substring(int beginIndex)
        // Retorna a substring a partir do índice informado até o final
        // Parâmetro: índice inicial (int)
        String resultado = texto.substring(5);
        
        System.out.println("Original: " + texto);
        System.out.println("Substring a partir do índice 5: " + resultado);
    }
}