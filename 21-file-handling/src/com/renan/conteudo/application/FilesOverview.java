package com.renan.conteudo.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesOverview {

    public static void main(String[] args) {

        // Caminho do arquivo que será utilizado nos experimentos.
        // O projeto deve ser executado a partir da raiz do projeto.
        Path path = Paths.get("files/input.txt");

        // ==========================================================
        // 1. INFORMAÇÕES SOBRE O ARQUIVO
        // ==========================================================

        printTitle("INFORMAÇÕES SOBRE O ARQUIVO");

        // Verifica se o arquivo existe.
        System.out.println("Arquivo existe? " + Files.exists(path));

        // Retorna o caminho absoluto do arquivo.
        System.out.println("Caminho absoluto: " + path.toAbsolutePath());

        // Retorna o nome do arquivo.
        System.out.println("Nome do arquivo: " + path.getFileName());

        // Retorna o diretório pai do arquivo.
        System.out.println("Diretório pai: " + path.getParent());

        // Verifica se o caminho representa um arquivo regular.
        System.out.println("É um arquivo? " + Files.isRegularFile(path));

        // Verifica se o arquivo pode ser lido.
        System.out.println("Pode ser lido? " + Files.isReadable(path));

        // Verifica se o arquivo pode ser escrito.
        System.out.println("Pode ser escrito? " + Files.isWritable(path));

        // Retorna o tamanho do arquivo em bytes.
        try {
            System.out.println("Tamanho: " + Files.size(path) + " bytes");
        } catch (IOException e) {
            System.out.println("Erro ao obter tamanho do arquivo: " + e.getMessage());
        }


        // ==========================================================
        // 2. LER O ARQUIVO COMPLETO
        // ==========================================================

        printTitle("LER ARQUIVO COMPLETO");

        try {

            /*
             * readString() lê todo o conteúdo do arquivo
             * e retorna uma String.
             *
             * Disponível a partir do Java 11.
             */
            String content = Files.readString(path);

            System.out.println(content);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }


        // ==========================================================
        // 3. LER TODAS AS LINHAS
        // ==========================================================

        printTitle("LER TODAS AS LINHAS");

        try {

            /*
             * readAllLines() lê todas as linhas do arquivo
             * e retorna uma List<String>.
             */
            List<String> lines = Files.readAllLines(path);

            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler as linhas: " + e.getMessage());
        }


        // ==========================================================
        // 4. LER LINHA POR LINHA COM BUFFEREDREADER
        // ==========================================================

        printTitle("LER LINHA POR LINHA - BUFFEREDREADER");

        /*
         * BufferedReader permite realizar a leitura
         * do arquivo linha por linha.
         *
         * O try-with-resources fecha automaticamente
         * o BufferedReader ao final da execução.
         */
        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }


        // ==========================================================
        // 5. CONTAR QUANTIDADE DE LINHAS
        // ==========================================================

        printTitle("CONTAR QUANTIDADE DE LINHAS");

        try {

            List<String> lines = Files.readAllLines(path);

            System.out.println("Quantidade de linhas: " + lines.size());

        } catch (IOException e) {
            System.out.println("Erro ao contar linhas: " + e.getMessage());
        }


        // ==========================================================
        // 6. PROCURAR UMA PALAVRA
        // ==========================================================

        printTitle("PROCURAR UMA PALAVRA");

        String word = "Java";

        try {

            String content = Files.readString(path);

            /*
             * contains() verifica se determinado texto
             * está presente dentro da String.
             */
            if (content.contains(word)) {
                System.out.println("A palavra '" + word + "' foi encontrada.");
            } else {
                System.out.println("A palavra '" + word + "' não foi encontrada.");
            }

        } catch (IOException e) {
            System.out.println("Erro ao pesquisar: " + e.getMessage());
        }


        // ==========================================================
        // 7. CONTAR OCORRÊNCIAS DE UMA PALAVRA
        // ==========================================================

        printTitle("CONTAR OCORRÊNCIAS DE UMA PALAVRA");

        String search = "Java";

        try {

            String content = Files.readString(path);

            int count = 0;
            int index = 0;

            /*
             * indexOf() procura a próxima ocorrência
             * da palavra dentro do texto.
             */
            while ((index = content.indexOf(search, index)) != -1) {

                count++;

                // Avança o índice para continuar a busca.
                index += search.length();
            }

            System.out.println(
                    "A palavra '" + search + "' aparece "
                    + count + " vez(es)."
            );

        } catch (IOException e) {
            System.out.println("Erro ao pesquisar: " + e.getMessage());
        }


        // ==========================================================
        // 8. ESCREVER NO FINAL DO ARQUIVO
        // ==========================================================

        printTitle("ADICIONAR CONTEÚDO AO FINAL DO ARQUIVO");

        /*
         * Este exemplo está comentado para não modificar
         * o input.txt toda vez que o programa for executado.
         *
         * StandardOpenOption.APPEND faz com que o conteúdo
         * seja adicionado ao final do arquivo.
         */

        /*
        try (BufferedWriter bw = Files.newBufferedWriter(
                path,
                StandardOpenOption.APPEND)) {

            bw.newLine();
            bw.write("Nova linha adicionada pelo Java.");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
        */


        // ==========================================================
        // 9. SOBRESCREVER O CONTEÚDO DO ARQUIVO
        // ==========================================================

        printTitle("SOBRESCREVER ARQUIVO");

        /*
         * CUIDADO!
         *
         * O método writeString(), por padrão, substitui
         * o conteúdo existente do arquivo.
         *
         * Por isso este exemplo está comentado.
         */

        /*
        try {

            Files.writeString(
                    path,
                    "Novo conteúdo do arquivo."
            );

            System.out.println("Arquivo sobrescrito com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
        */


        // ==========================================================
        // 10. ESCREVER COM BUFFEREDWRITER
        // ==========================================================

        printTitle("ESCREVER COM BUFFEREDWRITER");

        /*
         * BufferedWriter é utilizado para escrever
         * dados de maneira eficiente em um arquivo.
         *
         * Também está comentado para não modificar
         * o arquivo original.
         */

        /*
        try (BufferedWriter bw = Files.newBufferedWriter(
                Paths.get("files/output.txt"))) {

            bw.write("Primeira linha.");
            bw.newLine();

            bw.write("Segunda linha.");
            bw.newLine();

            bw.write("Terceira linha.");

            System.out.println("Arquivo criado com sucesso.");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
        */


        // ==========================================================
        // 11. CRIAR DIRETÓRIO
        // ==========================================================

        printTitle("CRIAR DIRETÓRIO");

        Path directory = Paths.get("files/test");

        try {

            /*
             * createDirectories() cria o diretório informado.
             *
             * Se os diretórios pais não existirem,
             * eles também serão criados.
             */
            Files.createDirectories(directory);

            System.out.println(
                    "Diretório criado/verificado: "
                    + directory.toAbsolutePath()
            );

        } catch (IOException e) {
            System.out.println("Erro ao criar diretório: " + e.getMessage());
        }


        // ==========================================================
        // 12. CRIAR UM NOVO ARQUIVO
        // ==========================================================

        printTitle("CRIAR NOVO ARQUIVO");

        Path newFile = Paths.get("files/test/novo-arquivo.txt");

        try {

            /*
             * createFile() cria um novo arquivo vazio.
             *
             * Caso o arquivo já exista, será lançada
             * uma exceção.
             */
            if (!Files.exists(newFile)) {

                Files.createFile(newFile);

                System.out.println("Arquivo criado com sucesso.");

            } else {

                System.out.println("O arquivo já existe.");
            }

        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }


    // ==============================================================
    // MÉTODO AUXILIAR PARA SEPARAR OS EXPERIMENTOS
    // ==============================================================

    /*
     * Este método é utilizado apenas para deixar
     * o resultado do console mais organizado.
     *
     * Exemplo:
     *
     * ==================================================
     * LER ARQUIVO COMPLETO
     * ==================================================
     */
    private static void printTitle(String title) {

        System.out.println();
        System.out.println("==================================================");
        System.out.println(title);
        System.out.println("==================================================");
    }
}