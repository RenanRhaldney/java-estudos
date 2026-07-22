package Funcoes;

public class SubstringFunc2 {

    public static void main(String[] args) {
        
        String texto = "Programação";
        
        // substring(int beginIndex, int endIndex)
        // Retorna a substring do índice inicial até o índice final (exclusivo)
        // Parâmetros: índice inicial (int), índice final exclusivo (int)
        String resultado = texto.substring(0, 5);
        
        System.out.println("Original: " + texto);
        System.out.println("Substring do índice 0 até 4: " + resultado);
    }
}