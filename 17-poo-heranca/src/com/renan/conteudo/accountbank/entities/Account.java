package com.renan.conteudo.accountbank.entities;

/**
 * Classe base que representa uma conta bancária.
 *
 * Esta classe será utilizada como classe pai pelas subclasses:
 *
 *     Account
 *       ├── BusinessAccount
 *       └── SavingsAccount
 *
 * O objetivo deste projeto é demonstrar conceitos de HERANÇA
 * e POLIMORFISMO em Java.
 */
public class Account {

    private Integer number;
    private String holder;

    /*
     * protected permite que as subclasses tenham acesso diretamente
     * ao atributo.
     *
     * Porém, no desenvolvimento profissional, normalmente devemos
     * preferir private + getters/setters ou métodos específicos,
     * pois isso mantém um encapsulamento melhor.
     */
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    /**
     * Realiza um depósito na conta.
     */
    public void deposit(Double valueDeposit) {

        if (valueDeposit > 0) {
            balance += valueDeposit;
        }
    }

    /**
     * Realiza um saque.
     *
     * Este método poderá ser sobrescrito pelas subclasses
     * caso elas tenham regras diferentes.
     */
    public void withdraw(Double valueWithdraw) {

        if (valueWithdraw > 0 && valueWithdraw <= balance) {
            balance -= valueWithdraw;
        }
    }

    /**
     * Exibe informações básicas da conta.
     */
    public void printStatement() {

        System.out.println("Account: " + number);
        System.out.println("Holder: " + holder);
        System.out.println("Balance: " + String.format("%.2f", balance));
    }
}