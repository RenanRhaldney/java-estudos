package com.renan.conteudo.accountbank.application;

import com.renan.conteudo.accountbank.entities.Account;
import com.renan.conteudo.accountbank.entities.BusinessAccount;
import com.renan.conteudo.accountbank.entities.SavingsAccount;

public class AccountBankProgram {

    public static void main(String[] args) {

        /*
         * ==========================================================
         * 1. HERANÇA
         * ==========================================================
         *
         * BusinessAccount herda de Account.
         *
         * Portanto, BusinessAccount possui:
         *
         * - number
         * - holder
         * - balance
         * - deposit()
         * - withdraw()
         * - printStatement()
         *
         * Além dos seus próprios recursos:
         *
         * - loanLimit
         * - loan()
         */

        BusinessAccount businessAccount =
                new BusinessAccount(
                        1001,
                        "Empresa ABC",
                        1000.0,
                        5000.0);

        businessAccount.deposit(500.0);

        businessAccount.loan(1000.0);

        System.out.println("Business Account:");
        businessAccount.printStatement();


        /*
         * ==========================================================
         * 2. OUTRA CLASSE FILHA
         * ==========================================================
         */

        SavingsAccount savingsAccount =
                new SavingsAccount(
                        2001,
                        "Joao",
                        1000.0,
                        0.01);

        savingsAccount.updateBalance();

        System.out.println();
        System.out.println("Savings Account:");
        savingsAccount.printStatement();


        /*
         * ==========================================================
         * 3. POLIMORFISMO
         * ==========================================================
         *
         * Uma referência do tipo Account pode apontar para
         * um objeto BusinessAccount.
         *
         * Isso é possível porque:
         *
         * BusinessAccount É UMA Account.
         */

        Account account1 = new BusinessAccount(
                3001,
                "Empresa XYZ",
                2000.0,
                5000.0);

        Account account2 = new SavingsAccount(
                3002,
                "Maria",
                2000.0,
                0.01);


        /*
         * Embora as referências sejam do tipo Account,
         * os objetos reais são:
         *
         * BusinessAccount
         * SavingsAccount
         *
         * Isso é POLIMORFISMO.
         */

        account1.withdraw(100.0);
        account2.withdraw(100.0);

        System.out.println();
        System.out.println("Polimorfismo:");

        System.out.println(
                "BusinessAccount balance: "
                + account1.getBalance());

        System.out.println(
                "SavingsAccount balance: "
                + account2.getBalance());


        /*
         * ==========================================================
         * 4. @Override + POLIMORFISMO
         * ==========================================================
         *
         * Este é um dos pontos mais importantes.
         *
         * account1 é declarado como Account:
         *
         * Account account1
         *
         * Porém o objeto é BusinessAccount:
         *
         * new BusinessAccount(...)
         *
         * Quando chamamos:
         *
         * account1.withdraw()
         *
         * Java executa o withdraw() da BusinessAccount.
         *
         * Isso acontece porque BusinessAccount sobrescreveu
         * o método utilizando @Override.
         */

        Account account3 = new BusinessAccount(
                4001,
                "Empresa DEF",
                1000.0,
                5000.0);

        account3.withdraw(100.0);

        System.out.println();
        System.out.println(
                "Saldo após saque: "
                + account3.getBalance());


        /*
         * ==========================================================
         * 5. UPCASTING
         * ==========================================================
         *
         * Transformar uma referência de uma classe filha
         * em uma referência da classe pai.
         *
         * Exemplo:
         *
         * BusinessAccount -> Account
         */

        BusinessAccount business =
                new BusinessAccount(
                        5001,
                        "Empresa",
                        1000.0,
                        5000.0);

        Account account = business;


        /*
         * Agora account conhece somente o que Account oferece.
         *
         * Podemos chamar:
         *
         * account.deposit()
         * account.withdraw()
         * account.printStatement()
         *
         * Mas não podemos diretamente chamar:
         *
         * account.loan()
         *
         * porque loan() pertence à BusinessAccount.
         */


        /*
         * ==========================================================
         * 6. DOWNCASTING
         * ==========================================================
         *
         * Podemos voltar uma referência Account para
         * BusinessAccount.
         *
         * Porém devemos tomar cuidado.
         */

        BusinessAccount businessAgain =
                (BusinessAccount) account;

        businessAgain.loan(500.0);


        /*
         * ==========================================================
         * 7. INSTANCEOF
         * ==========================================================
         *
         * Antes de fazer um downcasting, podemos verificar
         * o tipo real do objeto.
         */

        if (account instanceof BusinessAccount) {

            BusinessAccount businessAccount2 =
                    (BusinessAccount) account;

            businessAccount2.loan(500.0);
        }


        /*
         * ==========================================================
         * 8. POLIMORFISMO COM ARRAY
         * ==========================================================
         *
         * Uma lista/array de Account pode armazenar
         * diferentes subclasses.
         */

        Account[] accounts = {

                new Account(
                        6001,
                        "Cliente comum",
                        1000.0),

                new BusinessAccount(
                        6002,
                        "Empresa",
                        2000.0,
                        5000.0),

                new SavingsAccount(
                        6003,
                        "Maria",
                        3000.0,
                        0.01)
        };


        /*
         * Todos os objetos podem ser tratados como Account.
         */

        System.out.println();
        System.out.println("Todas as contas:");

        for (Account acc : accounts) {

            acc.printStatement();

            System.out.println();
        }


        /*
         * ==========================================================
         * RESUMO
         * ==========================================================
         *
         * HERANÇA:
         *
         * BusinessAccount extends Account
         *
         *
         * SOBRESCRITA:
         *
         * @Override
         * public void withdraw(...)
         *
         *
         * SUPER:
         *
         * super(...)
         *
         *
         * POLIMORFISMO:
         *
         * Account account = new BusinessAccount();
         *
         *
         * UPCASTING:
         *
         * BusinessAccount -> Account
         *
         *
         * DOWNCASTING:
         *
         * Account -> BusinessAccount
         *
         *
         * INSTANCEOF:
         *
         * Verifica o tipo real do objeto.
         */
    }
}