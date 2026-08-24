# 19 - POO: Abstração

Projeto de estudos desenvolvido em **Java** para compreender e revisar o conceito de **Abstração** dentro da Programação Orientada a Objetos (POO).

O projeto contém exemplos práticos e um exercício para demonstrar como a abstração pode ser utilizada em diferentes situações.

---

## 📚 Sobre o projeto

**Abstração** é um dos principais pilares da Programação Orientada a Objetos.

Ela consiste em representar uma entidade de forma **genérica**, destacando características e comportamentos relevantes e deixando os detalhes específicos de implementação para as classes especializadas.

Em Java, a abstração pode ser implementada principalmente através de:

- Classes abstratas
- Métodos abstratos
- Interfaces

Neste projeto, o foco principal está no uso de **classes abstratas e métodos abstratos**.

---

## 🎯 Objetivos

Este projeto foi criado para servir como:

- Material de estudo sobre abstração em Java;
- Overview para consulta futura;
- Exemplos práticos de classes abstratas;
- Exercícios de fixação;
- Referência para entender a relação entre abstração, herança e polimorfismo.

---

## 🧠 Conceito de Abstração

Uma classe abstrata pode representar um conceito genérico que não deve necessariamente ser instanciado diretamente.

Por exemplo:

```java
public abstract class Shape {

    public abstract Double area();
}
```

`Shape` representa uma **forma geométrica genérica**.

Sabemos que toda forma possui uma área, porém cada tipo de forma possui uma maneira diferente de calculá-la.

Assim, `Shape` define **o que deve existir**, enquanto suas subclasses definem **como será implementado**.

```text
                         Shape
                    classe abstrata
                           │
             ┌─────────────┼─────────────┐
             │             │             │
             ▼             ▼             ▼
          Circle       Rectangle      Triangle
             │             │             │
             ▼             ▼             ▼
          area()         area()         area()
```

---

# 📂 Estrutura do projeto

O projeto está dividido em duas partes principais:

```text
src
└── main
    └── java
        └── com.renan.abstracao
            │
            ├── conteudo
            │   ├── application
            │   │   └── Program.java
            │   │
            │   └── entities
            │       ├── Shape.java
            │       ├── Circle.java
            │       ├── Rectangle.java
            │       ├── Triangle.java
            │       └── enums
            │           └── Color.java
            │
            └── exercicios
                └── taxpayer
                    ├── application
                    │   └── TaxpayerProgram.java
                    │
                    └── entities
                        ├── Taxpayer.java
                        ├── Individual.java
                        └── Company.java
```

---

# 📖 1. Conteúdo — Shape

O primeiro exemplo do projeto demonstra abstração através de **formas geométricas**.

A classe `Shape` representa uma forma de maneira genérica.

```java
public abstract class Shape {

    private Color color;

    public abstract Double area();
}
```

Ela possui:

- Um atributo comum (`color`);
- Construtores;
- Getters e setters;
- Um método abstrato `area()`.

---

## 🔷 Shape

`Shape` é uma classe abstrata.

```java
public abstract class Shape
```

Por ser abstrata, não podemos fazer:

```java
Shape shape = new Shape();
```

Isso gera erro porque uma classe abstrata não pode ser instanciada diretamente.

Seu objetivo é servir como **classe base** para outras classes.

---

## 🔵 Circle

`Circle` herda de `Shape`:

```java
public class Circle extends Shape
```

E fornece sua própria implementação de `area()`:

```java
@Override
public Double area() {
    return Math.PI * radius * radius;
}
```

---

## ▭ Rectangle

`Rectangle` também herda de `Shape`:

```java
public class Rectangle extends Shape
```

Mas possui uma implementação diferente:

```java
@Override
public Double area() {
    return width * height;
}
```

---

## 🔺 Triangle

`Triangle` é outra implementação concreta de `Shape`:

```java
public class Triangle extends Shape
```

Sua área é calculada de acordo com sua própria regra:

```java
@Override
public Double area() {
    return base * height / 2.0;
}
```

---

## 🔄 Abstração + Polimorfismo

Um dos pontos mais importantes desse exemplo é:

```java
List<Shape> list = new ArrayList<>();
```

A lista utiliza `Shape` como tipo, mas pode armazenar diferentes subclasses:

```java
list.add(new Circle(...));
list.add(new Rectangle(...));
list.add(new Triangle(...));
```

Depois:

```java
for (Shape shape : list) {
    System.out.println(shape.area());
}
```

Mesmo utilizando uma referência do tipo `Shape`, cada objeto executará sua própria implementação de `area()`.

```text
Shape
  │
  ├── Circle      → area() do Circle
  │
  ├── Rectangle   → area() do Rectangle
  │
  └── Triangle    → area() do Triangle
```

Esse exemplo demonstra como **abstração, herança e polimorfismo trabalham juntos**.

---

# 📖 2. Exercício — Taxpayer

O segundo exemplo é um exercício prático utilizando o conceito de abstração para representar diferentes tipos de contribuintes.

A classe base é:

```java
public abstract class Taxpayer
```

Ela possui características comuns:

```java
private String name;
private Double annualIncome;
```

E define um comportamento abstrato:

```java
public abstract Double calculateIncomeTax();
```

---

## 👤 Individual

`Individual` representa uma pessoa física:

```java
public class Individual extends Taxpayer
```

Possui uma característica específica:

```java
private Double healthExpenses;
```

E implementa sua própria regra:

```java
@Override
public Double calculateIncomeTax() {
    ...
}
```

---

## 🏢 Company

`Company` representa uma empresa:

```java
public class Company extends Taxpayer
```

Possui uma característica específica:

```java
private Integer numberOfEmployees;
```

E também possui sua própria implementação:

```java
@Override
public Double calculateIncomeTax() {
    ...
}
```

---

## 🔄 Polimorfismo no exercício

Assim como no exemplo de `Shape`, podemos trabalhar utilizando a classe abstrata:

```java
List<Taxpayer> list = new ArrayList<>();
```

A lista pode conter:

```java
list.add(new Individual(...));
list.add(new Company(...));
```

E podemos percorrer os objetos através da referência `Taxpayer`:

```java
for (Taxpayer tp : list) {
    System.out.println(tp.printTax());
}
```

O Java executará automaticamente a implementação correta de:

```java
calculateIncomeTax()
```

de acordo com o tipo real do objeto.

---

# 🔗 Relação entre os dois exemplos

Os dois projetos utilizam exatamente a mesma ideia fundamental.

### Shape

```text
Shape
 │
 ├── Circle
 ├── Rectangle
 └── Triangle
```

Cada forma calcula sua área de maneira diferente.

### Taxpayer

```text
Taxpayer
 │
 ├── Individual
 └── Company
```

Cada tipo de contribuinte calcula seu imposto de maneira diferente.

A estrutura do conceito é a mesma:

```text
             CLASSE ABSTRATA
                    │
          define características
             e comportamentos
                    │
                    ▼
          ┌───────────────────┐
          │      Método       │
          │     abstrato      │
          └─────────┬─────────┘
                    │
           cada subclasse
           implementa sua
             própria regra
                    │
        ┌───────────┼───────────┐
        ▼           ▼           ▼
   Subclasse A Subclasse B Subclasse C
```

---

# 🧩 Elementos importantes

## `abstract`

Indica que uma classe ou método é abstrato.

Classe:

```java
public abstract class Shape
```

Método:

```java
public abstract Double area();
```

---

## Método abstrato

Um método abstrato não possui implementação:

```java
public abstract Double area();
```

As subclasses concretas devem implementá-lo.

---

## `@Override`

Indica que uma subclasse está sobrescrevendo um método herdado:

```java
@Override
public Double area() {
    return width * height;
}
```

---

## `extends`

Utilizado para estabelecer uma relação de herança:

```java
public class Circle extends Shape
```

```java
public class Individual extends Taxpayer
```

---

## `super()`

Utilizado para chamar o construtor da classe pai:

```java
public Circle(Color color, Double radius) {
    super(color);
    this.radius = radius;
}
```

Nesse caso, `super(color)` chama o construtor correspondente de `Shape`.

---

## Métodos concretos em classes abstratas

Uma classe abstrata não precisa possuir somente métodos abstratos.

Ela também pode possuir métodos concretos:

```java
public String description() {
    return "This is a " + color + " shape.";
}
```

No exercício:

```java
public String printTax() {
    return String.format(
        "%s: $ %.2f",
        getName(),
        calculateIncomeTax()
    );
}
```

Isso permite que a classe abstrata forneça **comportamentos compartilhados** pelas subclasses.

---

# ⚠️ Classe abstrata não significa que tudo precisa ser abstrato

É perfeitamente válido ter:

```java
public abstract class Taxpayer {

    private String name;

    public abstract Double calculateIncomeTax();

    public String printTax() {
        ...
    }
}
```

Nesse exemplo:

- `Taxpayer` é abstrata;
- `calculateIncomeTax()` é abstrato;
- `printTax()` é concreto;
- `name` é um atributo comum;
- `Taxpayer` possui construtores.

A abstração permite combinar comportamentos comuns com comportamentos que precisam ser especializados.

---

# 💡 Regra mental para lembrar

Uma forma simples de lembrar do conceito:

> **A classe abstrata define o que é comum e deixa para as subclasses aquilo que é específico.**

Ou:

```text
Classe abstrata
       │
       ├── O que todas possuem?
       │
       ├── O que todas fazem?
       │
       └── O que precisa ser diferente?
                    │
                    ▼
               Subclasses
```

No exemplo de `Shape`:

```text
Shape → toda forma possui uma área
Circle → como calcular a área do círculo
Rectangle → como calcular a área do retângulo
Triangle → como calcular a área do triângulo
```

No exemplo de `Taxpayer`:

```text
Taxpayer → todo contribuinte possui renda e paga imposto
Individual → como calcular o imposto de pessoa física
Company → como calcular o imposto de empresa
```

---

# 🛠️ Tecnologias utilizadas

- **Java**
- **Programação Orientada a Objetos**
- Classes abstratas
- Métodos abstratos
- Herança
- Polimorfismo
- Sobrescrita de métodos
- Encapsulamento
- `ArrayList`
- `List`
- `Scanner`
- `enum`

---

# 📌 Resumo para consulta

| Conceito                 | Exemplo no projeto               |
| ------------------------ | -------------------------------- |
| Classe abstrata          | `Shape`, `Taxpayer`              |
| Método abstrato          | `area()`, `calculateIncomeTax()` |
| Herança                  | `Circle extends Shape`           |
| Herança                  | `Individual extends Taxpayer`    |
| Sobrescrita              | `@Override`                      |
| Polimorfismo             | `List<Shape>`, `List<Taxpayer>`  |
| Construtor da classe pai | `super()`                        |
| Atributos compartilhados | `color`, `name`, `annualIncome`  |
| Comportamento comum      | `description()`, `printTax()`    |
| Implementação específica | `area()`, `calculateIncomeTax()` |

---

# 🚀 Próximos estudos

Depois de compreender classes abstratas, alguns conceitos importantes para continuar os estudos de POO são:

- Interfaces
- Diferenças entre classes abstratas e interfaces
- Polimorfismo com interfaces
- Composição
- Associação
- Agregação
- Princípios SOLID

---

## 📖 Conclusão

Este projeto foi desenvolvido como um **material de estudo e consulta sobre Abstração em Java**.

Os exemplos de `Shape` e `Taxpayer` demonstram que uma classe abstrata pode definir uma estrutura comum para diferentes objetos, enquanto delega às subclasses a implementação dos comportamentos específicos.

O ponto principal para lembrar é:

```text
ABSTRAÇÃO
    ↓
Define uma representação genérica
    ↓
Classe abstrata define características
e comportamentos comuns
    ↓
Métodos abstratos definem comportamentos
que precisam ser implementados
    ↓
Subclasses fornecem as implementações específicas
    ↓
Polimorfismo permite trabalhar com
os objetos através do tipo abstrato
```

> **Abstração permite trabalhar com o conceito geral de um objeto sem precisar conhecer todos os detalhes de sua implementação.**
