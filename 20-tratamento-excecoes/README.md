# Tratamento de Exceções em Java

Projeto desenvolvido para estudo e prática de **Tratamento de Exceções em Java**, contendo uma classe de conteúdo com exemplos comentados e exercícios práticos utilizando exceções personalizadas.

O projeto apresenta os principais recursos utilizados no tratamento de exceções e demonstra sua aplicação em situações relacionadas a regras de negócio.

---

## 📚 Conteúdo

A pasta `conteudo` contém classes desenvolvidas como **material de estudo e consulta**, com exemplos comentados diretamente no código.

### Principais conceitos abordados

- Exceções em Java
- `try`
- `catch`
- `finally`
- `throw`
- `throws`
- `getMessage()`
- `printStackTrace()`
- Múltiplos `catch`
- Exceções específicas e genéricas
- Exceções verificadas (_Checked Exceptions_)
- Exceções não verificadas (_Unchecked Exceptions_)
- Exceções personalizadas
- Regras de negócio e exceções

### Exemplos apresentados

A classe `Program` apresenta exemplos práticos de:

- Tratamento de `ArithmeticException`
- Tratamento de `ArrayIndexOutOfBoundsException`
- Utilização de `getMessage()`
- Utilização de `printStackTrace()`
- Múltiplos blocos `catch`
- Utilização do bloco `finally`
- Criação e lançamento de exceções personalizadas
- Aplicação de exceções em regras de negócio

Os exemplos possuem **comentários explicativos**, permitindo utilizar a própria classe como material de revisão dos conceitos.

---

## ⚠️ Exceção Personalizada

O conteúdo possui uma `DomainException` criada especificamente para representar violações de regras de negócio.

Nesse caso, a exceção herda de `RuntimeException`:

```java
public class DomainException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }
}
```

Por herdar de `RuntimeException`, ela representa uma **Unchecked Exception**.

Isso significa que o Java não obriga o método que lança essa exceção a declarar `throws` ou o código chamador a utilizar `try-catch`.

---

# 💰 Exercício 1 — Account

O exercício `Account` simula uma operação de saque em uma conta bancária.

A classe `Account` possui:

- Número da conta
- Titular
- Saldo
- Limite de saque

A operação de saque possui regras de negócio que devem ser respeitadas.

### Regras

- O valor do saque não pode ultrapassar o limite de saque.
- O valor do saque não pode ultrapassar o saldo disponível.

Caso alguma regra seja violada, uma `DomainException` é lançada.

```java
public void withdraw(double value) throws DomainException {

    if (value > getWithdrawLimit()) {
        throw new DomainException("The amount exceeds withdraw limit");
    }

    if (value > getBalance()) {
        throw new DomainException("Not enough balance");
    }

    balance -= value;
}
```

Nesse exercício, a `DomainException` herda de `Exception`, sendo portanto uma **Checked Exception**.

O tratamento é realizado no `AccountProgram`:

```java
try {
    account.withdraw(withdraw);
    System.out.printf("New balance: %.2f", account.getBalance());

} catch (DomainException e) {
    System.out.println("Withdraw error: " + e.getMessage());
}
```

---

# 🏨 Exercício 2 — Reservation

O exercício `Reservation` simula um sistema simples de reserva de quarto.

A classe possui:

- Número do quarto
- Data de check-in
- Data de check-out

Também são utilizados:

- `LocalDate`
- `DateTimeFormatter`
- `ChronoUnit`
- `Scanner`

### Regras de negócio

Na criação da reserva:

- A data de check-out não pode ser anterior à data de check-in.

Na atualização da reserva:

- As novas datas devem ser futuras.
- A data de check-out não pode ser anterior à data de check-in.

Quando uma dessas regras é violada, uma `DomainException` é lançada.

### Cálculo da duração

A duração da reserva é calculada através de:

```java
public long duration() {
    return ChronoUnit.DAYS.between(checkIn, checkOut);
}
```

O resultado representa a quantidade de noites entre o check-in e o check-out.

### Atualização da reserva

O método `updateDates()` realiza as validações antes de alterar as datas:

```java
public void updateDates(LocalDate checkin, LocalDate checkout)
        throws DomainException {

    LocalDate dateNow = LocalDate.now();

    if (checkin.isBefore(dateNow) || checkout.isBefore(dateNow)) {
        throw new DomainException(
            "Reservation dates for update must be future dates"
        );
    }

    if (checkout.isBefore(checkin)) {
        throw new DomainException(
            "Check-out date must be after check-in date"
        );
    }

    this.checkIn = checkin;
    this.checkOut = checkout;
}
```

---

# 🔎 Checked vs Unchecked Exception

O projeto demonstra os dois tipos através das `DomainException` utilizadas no conteúdo e nos exercícios.

| Tipo      | Classe utilizada   | Característica                              |
| --------- | ------------------ | ------------------------------------------- |
| Unchecked | `RuntimeException` | Não obriga `try-catch` ou `throws`          |
| Checked   | `Exception`        | Exige tratamento ou declaração com `throws` |

### Conteúdo

```java
public class DomainException extends RuntimeException
```

**Unchecked Exception**

### Exercícios

```java
public class DomainException extends Exception
```

**Checked Exception**

Essa diferença permite observar, na prática, o comportamento de cada tipo de exceção em Java.

---

## 🗂️ Estrutura do Projeto

```text
src
└── main
    └── java
        └── com
            └── renan
                └── tratamentoexcecoes
                    │
                    ├── conteudo
                    │   ├── application
                    │   │   └── Program.java
                    │   │
                    │   └── exceptions
                    │       └── DomainException.java
                    │
                    └── exercicios
                        │
                        ├── account
                        │   ├── application
                        │   │   └── AccountProgram.java
                        │   │
                        │   └── model
                        │       ├── entities
                        │       │   └── Account.java
                        │       │
                        │       └── exception
                        │           └── DomainException.java
                        │
                        └── reservation
                            ├── application
                            │   └── ReservationProgram.java
                            │
                            └── model
                                ├── entities
                                │   └── Reservation.java
                                │
                                └── exceptions
                                    └── DomainException.java
```

---

# 🎯 Objetivos do Projeto

- Compreender o funcionamento do tratamento de exceções em Java.
- Aprender a utilizar `try`, `catch` e `finally`.
- Compreender a diferença entre `throw` e `throws`.
- Trabalhar com `Checked` e `Unchecked Exceptions`.
- Criar exceções personalizadas.
- Aplicar exceções em regras de negócio.
- Praticar o tratamento de erros através de exercícios.
- Utilizar classes comentadas como material de estudo e consulta.

---

# 🛠️ Tecnologias e Recursos

- **Java**
- **Programação Orientada a Objetos (POO)**
- **Exception Handling**
- **Custom Exceptions**
- **RuntimeException**
- **Exception**
- **LocalDate**
- **DateTimeFormatter**
- **ChronoUnit**
- **Scanner**

---

# 🚀 Como executar

Abra o projeto em uma IDE compatível com Java e execute as classes `Program` dos respectivos módulos.

### Conteúdo

```text
Program.java
```

Contém os exemplos comentados sobre tratamento de exceções.

### Exercício Account

```text
AccountProgram.java
```

Executa o exercício de conta bancária.

### Exercício Reservation

```text
ReservationProgram.java
```

Executa o exercício de reserva.

Os dados dos exercícios são informados através do **console** durante a execução.

---

# 📌 Organização do Projeto

O projeto foi organizado em duas partes principais:

### `conteudo`

Material de estudo contendo **classes comentadas**, exemplos e explicações sobre os conceitos de tratamento de exceções.

### `exercicios`

Implementações práticas utilizadas para aplicar os conceitos estudados.

Os exercícios abordam diferentes cenários de regras de negócio:

- **Account** → validação de operações bancárias.
- **Reservation** → validação de datas e regras de reserva.

Dessa forma, o projeto segue uma sequência de:

**Conceito → Exemplo comentado → Exercício prático**
