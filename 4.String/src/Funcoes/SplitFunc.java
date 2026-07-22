package Funcoes;

public class SplitFunc {

    public static void main(String[] args) {
        
        String texto = "um,dois,tres";
        
        // split(String regex)
        // Divide a string com base no separador especificado
        // Parâmetro: expressão regular usada como separador (String)
        String[] partes = texto.split(",");
        
        for (String parte : partes) {
            System.out.println("Parte: " + parte);
        }
    }
}