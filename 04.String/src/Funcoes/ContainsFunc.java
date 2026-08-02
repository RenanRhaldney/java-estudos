
package Funcoes;

public class ContainsFunc {

    public static void main(String[] args) {
        
        String texto = "Curso de Java";
        
        // contains(String str)
        // Verifica se a string contém a sequência especificada
        // Parâmetro: substring a ser buscada (String)
        boolean contem = texto.contains("Java");
        
        System.out.println("Texto: " + texto);
        System.out.println("Contém 'Java'? " + contem);
    }
}