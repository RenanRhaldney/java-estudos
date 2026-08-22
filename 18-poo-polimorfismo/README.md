# 18 - POO: Polimorfismo

Projeto desenvolvido para estudar e praticar o conceito de **Polimorfismo** dentro da Programação Orientada a Objetos (POO) utilizando Java.

O projeto reúne exemplos conceituais e exercícios práticos para demonstrar como o polimorfismo permite que objetos de diferentes classes sejam tratados por meio de um mesmo tipo, mantendo comportamentos específicos de cada implementação.

## 📚 Conteúdos abordados

- Polimorfismo
- Herança
- Upcasting e Downcasting
- Sobrescrita de métodos (`@Override`)
- Classes abstratas
- Métodos abstratos
- Interfaces
- Implementação de interfaces
- Referências de superclasse para objetos de subclasses
- Comportamento específico através da sobrescrita de métodos

## 📁 Estrutura do projeto

```text
src
└── com.renan.polimorfismo
    ├── conteudo
    │   ├── application
    │   │   └── Program.java
    │   │
    │   ├── entities
    │   │   ├── Animal.java
    │   │   ├── Cat.java
    │   │   ├── Circle.java
    │   │   ├── Dog.java
    │   │   ├── Rectangle.java
    │   │   └── Shape.java
    │   │
    │   └── interfaces
    │       ├── CreditCardPayment.java
    │       ├── Payment.java
    │       └── PixPayment.java
    │
    └── exercicios
        ├── employee
        │   ├── application
        │   └── entities
        │
        └── product
            ├── application
            └── entities
```

## 🧠 Conceito principal

Polimorfismo significa, de forma simplificada, **"muitas formas"**.

Em Java, ele permite que uma referência de um tipo mais genérico aponte para objetos de diferentes subclasses.

Por exemplo:

```java
Shape shape = new Circle();
```

Embora a variável seja declarada como `Shape`, o objeto criado é um `Circle`.

Quando um método sobrescrito é chamado:

```java
shape.area();
```

o Java executará a implementação correspondente ao objeto que realmente está sendo referenciado.

Esse comportamento é conhecido como **polimorfismo em tempo de execução**.

## 🏗️ Exemplo com herança

Uma classe base pode definir um comportamento que será especializado pelas subclasses:

```java
public abstract class Shape {

    public abstract double area();

}
```

As subclasses podem fornecer suas próprias implementações:

```java
public class Circle extends Shape {

    @Override
    public double area() {
        // implementação específica do círculo
    }

}
```

```java
public class Rectangle extends Shape {

    @Override
    public double area() {
        // implementação específica do retângulo
    }

}
```

Assim, podemos trabalhar com diferentes objetos através da mesma referência:

```java
Shape shape1 = new Circle();
Shape shape2 = new Rectangle();
```

Cada objeto mantém seu próprio comportamento.

## 🔌 Polimorfismo com interfaces

O projeto também apresenta exemplos utilizando interfaces.

Uma interface pode definir um contrato:

```java
public interface Payment {

    void pay();

}
```

Diferentes classes podem implementar esse contrato:

```java
public class PixPayment implements Payment {

    @Override
    public void pay() {
        // pagamento via Pix
    }

}
```

```java
public class CreditCardPayment implements Payment {

    @Override
    public void pay() {
        // pagamento via cartão
    }

}
```

Dessa forma:

```java
Payment payment = new PixPayment();
```

ou:

```java
Payment payment = new CreditCardPayment();
```

A mesma referência `Payment` pode representar diferentes formas de pagamento.

## 🧪 Exercícios

### Employee

O exercício `employee` trabalha com polimorfismo através de uma classe base `Employee` e uma especialização para funcionários terceirizados.

O exemplo demonstra:

- Herança;
- Sobrescrita de métodos;
- Uso de `super`;
- `@Override`;
- Polimorfismo através de uma `List<Employee>`;
- Comportamento específico para funcionários terceirizados.

Um dos principais pontos do exercício é:

```java
List<Employee> employees = new ArrayList<>();
```

A lista utiliza `Employee` como tipo, mas pode armazenar diferentes tipos de funcionários:

```java
employees.add(new Employee(...));
employees.add(new OutsorcedEmployee(...));
```

Ao chamar:

```java
e.payment();
```

o Java executa a implementação correspondente ao tipo real do objeto.

## Product

O exercício `product` foi estruturado para trabalhar com diferentes tipos de produtos, utilizando uma classe base `Product` e especializações como:

- `ImportedProduct`
- `UsedProduct`

O objetivo é aplicar o polimorfismo para representar diferentes comportamentos de produtos dentro de uma mesma estrutura.

## 🎯 Objetivo do projeto

O objetivo deste projeto é servir como material de estudo e consulta sobre **Polimorfismo em Java**, consolidando os conceitos através de exemplos simples e exercícios práticos.

A organização do projeto separa os exemplos conceituais dos exercícios, facilitando a revisão dos conteúdos posteriormente.

## 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- Eclipse IDE
- Git / GitHub

## 📌 Observação

Este é um projeto de estudos desenvolvido para praticar conceitos de **Programação Orientada a Objetos em Java**, podendo receber novos exemplos e exercícios conforme o avanço dos estudos.
