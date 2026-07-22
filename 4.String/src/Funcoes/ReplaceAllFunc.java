package Funcoes;

public class ReplaceAllFunc {

    public static void main(String[] args) {
        
        String texto = "abc123";
        
        // replaceAll(String regex, String replacement)
        // Substitui todas as ocorrências que casam com a expressão regular
        // Parâmetros: expressão regular (String), substituto (String)
        String resultado = texto.replaceAll("[0-9]", "*");
        
        System.out.println("Original: " + texto);
        System.out.println("Resultado: " + resultado);
    }
}