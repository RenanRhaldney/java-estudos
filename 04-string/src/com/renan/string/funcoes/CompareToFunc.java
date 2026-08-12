package com.renan.string.funcoes;

public class CompareToFunc {

    public static void main(String[] args) {
        
        String a = "banana";
        String b = "abacaxi";
        
        // compareTo(String outro)
        // Compara duas strings lexicograficamente (ordem alfabética)
        // Parâmetro: string a ser comparada (String)
        int resultado = a.compareTo(b);
        
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("Resultado da comparação: " + resultado);
    }
}