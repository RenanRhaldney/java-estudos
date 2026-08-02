package Funcoes;

public class EndsWithFunc {

    public static void main(String[] args) {
        
        String texto = "arquivo.txt";
        
        // endsWith(String sufixo)
        // Verifica se a string termina com o sufixo especificado
        // Parâmetro: sufixo (String)
        boolean terminaCom = texto.endsWith(".txt");
        
        System.out.println("Texto: " + texto);
        System.out.println("Termina com '.txt'? " + terminaCom);
    }
}