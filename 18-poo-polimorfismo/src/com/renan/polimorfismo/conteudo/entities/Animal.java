package com.renan.polimorfismo.conteudo.entities;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal making a sound...");
    }

    public void showInfo() {
        System.out.println("Animal: " + name);
    }
}
