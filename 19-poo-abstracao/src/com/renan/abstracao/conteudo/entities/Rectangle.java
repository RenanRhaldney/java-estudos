package com.renan.abstracao.conteudo.entities;

import com.renan.abstracao.conteudo.entities.enums.Color;

/*
 * Rectangle é outra classe concreta que herda de Shape.
 *
 * Ela possui sua própria implementação do método area().
 */
public class Rectangle extends Shape {

    private Double width;
    private Double height;

    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);

        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    /*
     * Implementação específica da área de um retângulo.
     */
    @Override
    public Double area() {
        return width * height;
    }
}