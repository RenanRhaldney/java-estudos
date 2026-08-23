package com.renan.abstracao.conteudo.entities;

import com.renan.abstracao.conteudo.entities.enums.Color;

/*
 * Circle é uma classe concreta que herda de Shape.
 *
 * Como Shape possui o método abstrato area(),
 * Circle obrigatoriamente precisa implementar esse método.
 */
public class Circle extends Shape {

    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        /*
         * super(color) chama o construtor da classe pai (Shape)
         * e inicializa o atributo color.
         */
        super(color);

        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /*
     * Implementação do método abstrato definido em Shape.
     *
     * @Override informa ao compilador que estamos sobrescrevendo
     * um método existente na classe pai.
     */
    @Override
    public Double area() {
        return Math.PI * radius * radius;
    }

    /*
     * Circle também pode utilizar o método concreto description()
     * herdado de Shape.
     */
}