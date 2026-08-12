package com.renan.string.funcoes;

public class MatchesFunc {

    public static void main(String[] args) {
        
        String texto = "12345";
        
        // matches(String regex)
        // Verifica se a string inteira casa com a expressão regular
        // Parâmetro: expressão regular (String)
        boolean valido = texto.matches("\\d+");
        
        System.out.println("Texto: " + texto);
        System.out.println("Contém apenas dígitos? " + valido);
    }
}