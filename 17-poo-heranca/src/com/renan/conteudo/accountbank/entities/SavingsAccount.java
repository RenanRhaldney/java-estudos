package com.renan.conteudo.accountbank.entities;

/**
 * Conta poupança.
 *
 * Também é uma Account.
 *
 * Portanto:
 *
 * SavingsAccount IS-A Account
 */
public class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(
            Integer number,
            String holder,
            Double balance,
            Double interestRate) {

        super(number, holder, balance);

        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Operação específica da conta poupança.
     */
    public void updateBalance() {

        balance += balance * interestRate;
    }

    /**
     * Sobrescrevendo withdraw().
     *
     * Neste exemplo, a SavingsAccount não possui
     * taxa adicional de saque.
     */
    @Override
    public void withdraw(Double valueWithdraw) {

        if (valueWithdraw > 0 && valueWithdraw <= balance) {
            balance -= valueWithdraw;
        }
    }
}