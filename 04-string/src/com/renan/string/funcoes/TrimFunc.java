package com.renan.string.funcoes;

public class TrimFunc {

    public static void main(String[] args) {
        
        String textoOriginal = "   Exemplo com espaços   ";
        
        // trim()
        // Remove espaços em branco do início e do fim da string
        // Não recebe parâmetros
        String textoSemEspacos = textoOriginal.trim();
        
        System.out.println("Original: -" + textoOriginal + "-");
        System.out.println("Sem espaços: -" + textoSemEspacos + "-");
    }
}