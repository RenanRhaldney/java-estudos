package com.renan.polimorfismo.conteudo.interfaces;

public class PixPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println(
            "Payment of $" + amount + " made by PIX."
        );
    }
}
