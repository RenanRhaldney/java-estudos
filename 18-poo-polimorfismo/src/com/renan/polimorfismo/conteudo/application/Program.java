package com.renan.polimorfismo.conteudo.application;

import com.renan.polimorfismo.conteudo.entities.Animal;
import com.renan.polimorfismo.conteudo.entities.Cat;
import com.renan.polimorfismo.conteudo.entities.Circle;
import com.renan.polimorfismo.conteudo.entities.Dog;
import com.renan.polimorfismo.conteudo.entities.Rectangle;
import com.renan.polimorfismo.conteudo.entities.Shape;
import com.renan.polimorfismo.conteudo.interfaces.CreditCardPayment;
import com.renan.polimorfismo.conteudo.interfaces.Payment;
import com.renan.polimorfismo.conteudo.interfaces.PixPayment;

public class Program {

    public static void main(String[] args) {

        // ==========================================
        // POLIMORFISMO COM HERANÇA
        // ==========================================

        Animal animal1 = new Dog("Rex");
        Animal animal2 = new Cat("Mia");

        animal1.makeSound();
        animal2.makeSound();


        // ==========================================
        // POLIMORFISMO COM ARRAY
        // ==========================================

        Animal[] animals = {
            new Dog("Thor"),
            new Cat("Luna"),
            new Dog("Max")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }


        // ==========================================
        // POLIMORFISMO COM CLASSE ABSTRATA
        // ==========================================

        Shape shape1 = new Circle(3.0);
        Shape shape2 = new Rectangle(4.0, 5.0);

        System.out.println("Circle area: " + shape1.area());
        System.out.println("Rectangle area: " + shape2.area());


        // ==========================================
        // POLIMORFISMO COM INTERFACE
        // ==========================================

        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PixPayment();

        payment1.pay(100.00);
        payment2.pay(200.00);
    }
}
