package Funcoes;

public class IsEmptyFunc {

    public static void main(String[] args) {
        
        String texto = "";
        
        // isEmpty()
        // Verifica se a string está vazia
        // Não recebe parâmetros
        boolean vazio = texto.isEmpty();
        
        System.out.println("Texto: '" + texto + "'");
        System.out.println("Está vazio? " + vazio);
    }
}