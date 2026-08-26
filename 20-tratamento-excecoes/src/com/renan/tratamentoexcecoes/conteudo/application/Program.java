package com.renan.tratamentoexcecoes.conteudo.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.renan.tratamentoexcecoes.conteudo.exceptions.DomainException;

public class Program {

    public static void main(String[] args) {

        /*
         * ============================================================
         * TRATAMENTO DE EXCEÇÕES EM JAVA
         * ============================================================
         *
         * Exceção é um evento que ocorre durante a execução do programa
         * e interrompe o fluxo normal da aplicação.
         *
         * Exemplos:
         *
         * - divisão por zero
         * - acesso a uma posição inexistente de um array
         * - conversão inválida de dados
         * - arquivo inexistente
         * - regra de negócio inválida
         *
         * O Java fornece mecanismos para tratar essas situações através
         * das palavras-chave:
         *
         * try
         * catch
         * finally
         * throw
         * throws
         */

        // ============================================================
        // 1. TRY-CATCH
        // ============================================================

        System.out.println("=== TRY-CATCH ===");

        try {

            int resultado = 10 / 0;

            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {

            System.out.println("Erro: divisão por zero.");

        }

        /*
         * O código dentro do try é executado normalmente.
         *
         * Caso uma exceção aconteça, o Java procura um catch
         * compatível com o tipo da exceção.
         *
         * ArithmeticException é lançada quando ocorre uma operação
         * aritmética inválida, como uma divisão inteira por zero.
         */


        // ============================================================
        // 2. ACESSANDO A MENSAGEM DA EXCEÇÃO
        // ============================================================

        System.out.println("\n=== MENSAGEM DA EXCEÇÃO ===");

        try {

            int[] numbers = { 10, 20, 30 };

            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Mensagem: " + e.getMessage());

        }

        /*
         * getMessage()
         *
         * Retorna uma mensagem relacionada à exceção.
         */


        // ============================================================
        // 3. STACK TRACE
        // ============================================================

        System.out.println("\n=== STACK TRACE ===");

        try {

            int[] numbers = { 10, 20, 30 };

            System.out.println(numbers[10]);

        } catch (ArrayIndexOutOfBoundsException e) {

            /*
             * printStackTrace() imprime informações sobre a exceção,
             * incluindo o local onde ela ocorreu.
             *
             * É muito utilizado durante o desenvolvimento e debugging.
             */

            e.printStackTrace();
        }


        // ============================================================
        // 4. MÚLTIPLOS CATCH
        // ============================================================

        System.out.println("\n=== MÚLTIPLOS CATCH ===");

        try {

            Scanner sc = new Scanner(System.in);

            System.out.print("Digite um número inteiro: ");

            int number = sc.nextInt();

            System.out.println("Número informado: " + number);

            sc.close();

        } catch (InputMismatchException e) {

            System.out.println("Erro: o valor informado não é um número inteiro.");

        } catch (Exception e) {

            /*
             * Exception é uma classe mais genérica.
             *
             * Deve aparecer depois das exceções específicas.
             */

            System.out.println("Ocorreu um erro inesperado.");

        }


        // ============================================================
        // 5. BLOCO FINALLY
        // ============================================================

        System.out.println("\n=== FINALLY ===");

        try {

            System.out.println("Executando operação...");

        } catch (Exception e) {

            System.out.println("Tratando exceção.");

        } finally {

            /*
             * O bloco finally é executado independentemente de ocorrer
             * ou não uma exceção.
             *
             * É normalmente utilizado para liberar recursos ou executar
             * alguma operação que deve acontecer ao final do processo.
             */

            System.out.println("Bloco finally executado.");

        }


        // ============================================================
        // 6. EXCEÇÃO PERSONALIZADA
        // ============================================================

        System.out.println("\n=== EXCEÇÃO PERSONALIZADA ===");

        try {

            int age = 15;

            if (age < 18) {

                /*
                 * throw é utilizado para lançar explicitamente uma
                 * exceção.
                 */

                throw new DomainException(
                    "A idade deve ser maior ou igual a 18 anos."
                );
            }

            System.out.println("Acesso permitido.");

        } catch (DomainException e) {

            System.out.println("Erro de regra de negócio: "
                    + e.getMessage());

        }


        // ============================================================
        // 7. EXCEÇÃO PERSONALIZADA COM REGRA DE NEGÓCIO
        // ============================================================

        System.out.println("\n=== EXEMPLO DE REGRA DE NEGÓCIO ===");

        try {

            double balance = 100.00;
            double withdraw = 150.00;

            if (withdraw > balance) {

                throw new DomainException(
                    "Saldo insuficiente para realizar o saque."
                );
            }

            balance -= withdraw;

            System.out.println("Novo saldo: " + balance);

        } catch (DomainException e) {

            System.out.println(e.getMessage());

        }


        // ============================================================
        // RESUMO
        // ============================================================

        /*
         * ============================================================
         * RESUMO DAS PRINCIPAIS PALAVRAS-CHAVE
         * ============================================================
         *
         * try
         * ------------------------------------------------------------
         * Contém o código que pode gerar uma exceção.
         *
         *
         * catch
         * ------------------------------------------------------------
         * Captura e trata uma exceção.
         *
         *
         * finally
         * ------------------------------------------------------------
         * Executa após o try/catch, independentemente de ocorrer
         * exceção ou não.
         *
         *
         * throw
         * ------------------------------------------------------------
         * Lança explicitamente uma exceção.
         *
         *
         * throws
         * ------------------------------------------------------------
         * Declara que um método pode lançar determinada exceção.
         *
         *
         * getMessage()
         * ------------------------------------------------------------
         * Obtém a mensagem da exceção.
         *
         *
         * printStackTrace()
         * ------------------------------------------------------------
         * Exibe o stack trace da exceção.
         *
         *
         * Exceção personalizada
         * ------------------------------------------------------------
         * Permite criar exceções específicas para representar regras
         * e situações próprias da aplicação.
         */
    }
}