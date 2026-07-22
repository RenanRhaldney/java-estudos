package Funcoes;

public class EqualsFunc {

    public static void main(String[] args) {
        
        String a = "Java";
        String b = "Java";
        
        // equals(String outro)
        // Compara se duas strings são exatamente iguais (case sensitive)
        // Parâmetro: string a ser comparada (String)
        boolean igual = a.equals(b);
        
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("São iguais? " + igual);
    }
}