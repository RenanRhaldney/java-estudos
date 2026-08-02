package aplication;

public class MatrizOverview {

	public static void main(String[] args) {
		int[][] matriz = {
			    {1, 2, 3},
			    {4, -5, 6},
			    {7, 8, 9}
			};

			imprimirMatriz(matriz);

			imprimirDiagonalPrincipal(matriz);

			System.out.println(contarNegativos(matriz));

			System.out.println(somarElementos(matriz));

			localizarValor(matriz, 6);

			imprimirVizinhos(matriz, 1, 2);

	}
	
	//FUNÇÕES
	
	/**
     * Retorna a quantidade de linhas da matriz.
     */
    public static int quantidadeLinhas(int[][] matriz) {
        return matriz.length;
    }

    /**
     * Retorna a quantidade de colunas da matriz.
     */
    public static int quantidadeColunas(int[][] matriz) {
        return matriz[0].length;
    }

    /**
     * Imprime todos os elementos da matriz.
     */
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Imprime a diagonal principal.
     */
    public static void imprimirDiagonalPrincipal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }

    /**
     * Conta quantos números negativos existem na matriz.
     */
    public static int contarNegativos(int[][] matriz) {
        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    contador++;
                }
            }
        }

        return contador;
    }

    /**
     * Verifica se um valor existe na matriz.
     */
    public static boolean contem(int[][] matriz, int valor) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == valor) {
                    return true;
                }

            }
        }

        return false;
    }

    /**
     * Exibe a posição de um valor na matriz.
     */
    public static void localizarValor(int[][] matriz, int valor) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == valor) {
                    System.out.println("Posição: (" + i + ", " + j + ")");
                }

            }
        }
    }

    /**
     * Exibe os vizinhos de um elemento.
     */
    public static void imprimirVizinhos(int[][] matriz, int linha, int coluna) {

        if (coluna > 0)
            System.out.println("Esquerda: " + matriz[linha][coluna - 1]);

        if (linha > 0)
            System.out.println("Acima: " + matriz[linha - 1][coluna]);

        if (coluna < matriz[linha].length - 1)
            System.out.println("Direita: " + matriz[linha][coluna + 1]);

        if (linha < matriz.length - 1)
            System.out.println("Abaixo: " + matriz[linha + 1][coluna]);
    }

    /**
     * Soma todos os elementos da matriz.
     */
    public static int somarElementos(int[][] matriz) {

        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }

        return soma;
    }
}

