package com.renan.string.funcoes;

public class ToUpperCaseFunc {

    public static void main(String[] args) {
        
        String textoOriginal = "exemplo de texto com minúsculas";
        
        // toUpperCase()
        // Converte todos os caracteres da string para maiúsculo
        // Não recebe parâmetros
        String textoMaiusculo = textoOriginal.toUpperCase();
        
        System.out.println("Original: -" + textoOriginal + "-");
        System.out.println("Maiúsculo: -" + textoMaiusculo + "-");
    }
}