package Funcoes;

public class ToLowerCaseFunc {

    public static void main(String[] args) {
        
        String textoOriginal = "Exemplo de Texto com MAIÚSCULAS";
        
        // toLowerCase()
        // Converte todos os caracteres da string para minúsculo
        // Não recebe parâmetros
        String textoMinusculo = textoOriginal.toLowerCase();
        
        System.out.println("Original: -" + textoOriginal + "-");
        System.out.println("Minúsculo: -" + textoMinusculo + "-");
    }
}