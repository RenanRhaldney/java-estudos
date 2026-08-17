package com.renan.conteudo.accountbank.entities;

/**
 * Conta bancária empresarial.
 *
 * BusinessAccount é uma especialização de Account.
 *
 * Portanto:
 *
 * BusinessAccount IS-A Account
 *
 * Ou seja:
 *
 * BusinessAccount É UMA Account.
 */
public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        /*
         * super() chama o construtor da classe pai.
         *
         * Neste caso:
         *
         * Account()
         */
        super();
    }

    public BusinessAccount(
            Integer number,
            String holder,
            Double balance,
            Double loanLimit) {

        /*
         * super(...) chama o construtor da classe pai
         * e inicializa os atributos herdados.
         *
         * Evitamos duplicar:
         *
         * this.number = number;
         * this.holder = holder;
         * this.balance = balance;
         */
        super(number, holder, balance);

        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    /**
     * Operação específica da BusinessAccount.
     *
     * Uma Account comum não possui essa operação.
     */
    public void loan(Double amount) {

        if (amount > 0 && amount <= loanLimit) {

            /*
             * balance é protected na classe Account.
             *
             * Por isso a classe filha consegue acessá-lo diretamente.
             */
            balance += amount - 10.0;
        }
    }

    /**
     * Sobrescrita do método withdraw() da classe Account.
     *
     * BusinessAccount possui uma regra diferente:
     * é cobrada uma taxa de 2.00 pelo saque.
     */
    @Override
    public void withdraw(Double valueWithdraw) {

        if (valueWithdraw > 0 && valueWithdraw <= balance) {
            balance -= valueWithdraw + 2.0;
        }
    }
}