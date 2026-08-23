package com.renan.abstracao.conteudo.entities;

import com.renan.abstracao.conteudo.entities.enums.Color;

/*
 * Outra implementação concreta de Shape.
 *
 * A classe Triangle também precisa implementar area(),
 * pois esse método foi definido como abstrato em Shape.
 */
public class Triangle extends Shape {

    private Double base;
    private Double height;

    public Triangle() {
        super();
    }

    public Triangle(Color color, Double base, Double height) {
        super(color);

        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    /*
     * Implementação específica da área de um triângulo.
     */
    @Override
    public Double area() {
        return base * height / 2.0;
    }
}