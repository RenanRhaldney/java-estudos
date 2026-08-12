package com.renan.string.funcoes;

public class ReplaceFunc {

    public static void main(String[] args) {
        
        String texto = "maçã verde";
        
        // replace(String alvo, String substituto)
        // Substitui uma substring por outra
        // Parâmetros: texto a ser substituído (String), novo texto (String)
        String resultado = texto.replace("verde", "vermelha");
        
        System.out.println("Original: " + texto);
        System.out.println("Substituído: " + resultado);
    }
}