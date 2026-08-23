package com.renan.abstracao.conteudo.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.renan.abstracao.conteudo.entities.Circle;
import com.renan.abstracao.conteudo.entities.Rectangle;
import com.renan.abstracao.conteudo.entities.Shape;
import com.renan.abstracao.conteudo.entities.Triangle;
import com.renan.abstracao.conteudo.entities.enums.Color;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
         * ============================================================
         * 1. REFERÊNCIA DO TIPO ABSTRATO
         * ============================================================
         *
         * Uma variável do tipo Shape pode referenciar qualquer objeto
         * de uma classe concreta que herde de Shape.
         *
         * Isso é possível graças à herança e ao polimorfismo.
         */
        Shape shape1 = new Circle(Color.RED, 3.0);

        Shape shape2 = new Rectangle(Color.BLUE, 4.0, 5.0);

        /*
         * A referência é Shape, mas o objeto real é Circle.
         *
         * Portanto, quando chamamos area(), será executada a
         * implementação existente em Circle.
         */
        System.out.println("Circle area: " + shape1.area());

        /*
         * A referência também é Shape, mas o objeto real é Rectangle.
         *
         * Será executada a implementação de area() existente
         * em Rectangle.
         */
        System.out.println("Rectangle area: " + shape2.area());

        /*
         * ============================================================
         * 2. POLIMORFISMO COM CLASSE ABSTRATA
         * ============================================================
         *
         * Podemos criar uma lista de Shape e armazenar diferentes
         * tipos de objetos que herdam de Shape.
         */
        List<Shape> list = new ArrayList<>();

        list.add(new Circle(Color.RED, 2.0));
        list.add(new Rectangle(Color.BLUE, 3.0, 4.0));
        list.add(new Triangle(Color.BLACK, 5.0, 2.0));

        /*
         * Mesmo trabalhando com referências do tipo Shape,
         * cada objeto executará sua própria implementação de area().
         */
        System.out.println("\nSHAPE AREAS:");

        for (Shape shape : list) {

            System.out.printf("%.2f%n", shape.area());
        }

        /*
         * ============================================================
         * 3. MÉTODO CONCRETO NA CLASSE ABSTRATA
         * ============================================================
         *
         * Shape possui o método concreto description().
         *
         * Esse comportamento é herdado pelas subclasses.
         */
        System.out.println("\nDESCRIPTIONS:");

        for (Shape shape : list) {

            System.out.println(shape.description());
        }

        /*
         * ============================================================
         * 4. ACESSANDO COMPORTAMENTO ESPECÍFICO
         * ============================================================
         *
         * Embora a variável seja Shape, o objeto pode ser uma
         * instância específica de Circle.
         *
         * Podemos verificar o tipo real utilizando instanceof.
         */
        Shape shape = new Circle(Color.RED, 10.0);

        if (shape instanceof Circle) {

            Circle circle = (Circle) shape;

            System.out.println("\nCircle radius: " + circle.getRadius());
        }

        /*
         * ============================================================
         * 5. EXEMPLO INTERATIVO
         * ============================================================
         *
         * A partir daqui temos o exemplo original do projeto:
         * o usuário informa as formas e elas são armazenadas como
         * Shape.
         */

        List<Shape> userShapes = new ArrayList<>();

        System.out.print("\nEnter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.nextLine());

            if (shapeType == 'r') {

                System.out.print("Width: ");
                Double width = sc.nextDouble();

                System.out.print("Height: ");
                Double height = sc.nextDouble();

                userShapes.add(
                    new Rectangle(color, width, height)
                );

            } else {

                System.out.print("Radius: ");
                Double radius = sc.nextDouble();

                userShapes.add(
                    new Circle(color, radius)
                );
            }
        }

        /*
         * Perceba novamente o poder da abstração:
         *
         * A lista não precisa saber se possui Circle ou Rectangle.
         *
         * Ela trabalha apenas com o conceito abstrato Shape.
         *
         * Cada objeto é responsável pela sua própria implementação
         * do cálculo da área.
         */
        System.out.println("\nSHAPE AREAS:");

        for (Shape shapeItem : userShapes) {

            System.out.printf("%.2f%n", shapeItem.area());
        }

		sc.close();
	}
}