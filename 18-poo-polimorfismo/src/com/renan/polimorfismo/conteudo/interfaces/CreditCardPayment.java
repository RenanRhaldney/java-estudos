package com.renan.polimorfismo.conteudo.interfaces;

public class CreditCardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Payment of $" + amount + " made by credit card."
        );
    }
}
