package Funcoes;

public class StartsWithFunc {

    public static void main(String[] args) {
        
        String texto = "Java é legal";
        
        // startsWith(String prefixo)
        // Verifica se a string começa com o prefixo especificado
        // Parâmetro: prefixo (String)
        boolean comecaCom = texto.startsWith("Java");
        
        System.out.println("Texto: " + texto);
        System.out.println("Começa com 'Java'? " + comecaCom);
    }
}