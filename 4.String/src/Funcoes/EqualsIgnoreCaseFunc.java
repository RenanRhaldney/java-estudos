package Funcoes;

public class EqualsIgnoreCaseFunc {

    public static void main(String[] args) {
        
        String a = "Java";
        String b = "java";
        
        // equalsIgnoreCase(String outro)
        // Compara strings ignorando diferença entre maiúsculas e minúsculas
        // Parâmetro: string a ser comparada (String)
        boolean igual = a.equalsIgnoreCase(b);
        
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("São iguais ignorando case? " + igual);
    }
}