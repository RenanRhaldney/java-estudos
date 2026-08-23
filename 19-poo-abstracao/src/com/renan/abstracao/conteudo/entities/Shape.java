package com.renan.abstracao.conteudo.entities;

import com.renan.abstracao.conteudo.entities.enums.Color;

/*
 * ================================================================
 * ABSTRAÇÃO
 * ================================================================
 *
 * Abstração consiste em representar uma ideia ou comportamento
 * de forma genérica, escondendo detalhes específicos da implementação.
 *
 * Neste exemplo:
 *
 * Shape
 *   |
 *   +-- Circle
 *   |
 *   +-- Rectangle
 *   |
 *   +-- Triangle
 *
 * Shape define aquilo que todas as formas possuem em comum:
 *
 * - uma cor;
 * - um cálculo de área.
 *
 * Porém, Shape não sabe COMO cada forma calcula sua área.
 *
 * Essa responsabilidade é delegada para as subclasses:
 *
 * Circle     -> calcula área do círculo
 * Rectangle  -> calcula área do retângulo
 * Triangle   -> calcula área do triângulo
 *
 * Dessa forma, Shape define o "o quê" e as subclasses definem
 * o "como".
 * ================================================================
 */
public abstract class Shape {

    private Color color;

    public Shape() {
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /*
     * MÉTODO ABSTRATO
     *
     * A classe Shape sabe que toda forma deve possuir um cálculo
     * de área, mas não sabe como esse cálculo será realizado.
     *
     * Cada classe filha deverá fornecer sua própria implementação.
     */
    public abstract Double area();

    /*
     * MÉTODO CONCRETO
     *
     * Uma classe abstrata também pode possuir métodos concretos.
     * As subclasses herdam esse comportamento.
     */
    public String description() {
        return "This is a " + color + " shape.";
    }
}