# Data e Hora em Java

Projeto de estudo desenvolvido para praticar e consultar os principais recursos da API `java.time` do Java.

O projeto apresenta exemplos práticos de criação, manipulação, comparação, formatação e conversão de datas e horários, além de conceitos relacionados a UTC, fusos horários, `Period`, `Duration` e timestamps.

## Tecnologias

* Java 17+
* API `java.time`
* Eclipse IDE

## Conteúdos abordados

### Datas e horários

* `LocalDate` — representação de uma data sem horário.
* `LocalTime` — representação de um horário sem data.
* `LocalDateTime` — data e horário sem fuso.
* `Instant` — instante na linha do tempo, normalmente utilizado em UTC.
* `ZonedDateTime` — data e horário associados a um fuso horário.

### Criação e conversão

* Criação de datas com `of()`
* Conversão de `String` para data com `parse()`
* Conversão entre `Instant`, `LocalDateTime` e `ZonedDateTime`
* Combinação de `LocalDate` e `LocalTime`

### Manipulação

* `plusDays()`, `plusMonths()` e `plusYears()`
* `plusHours()` e `plusMinutes()`
* `minusDays()`, `minusMonths()` e `minusYears()`
* Obtenção do primeiro e último dia do mês

### Informações sobre datas

* Dia do mês
* Mês
* Ano
* Dia da semana
* Dia do ano

### Comparação

* `isBefore()`
* `isAfter()`
* `isEqual()`

### Diferença entre datas e horários

* `Period` — utilizado para calcular períodos entre datas.
* `Duration` — utilizado para calcular duração entre horários ou instantes.

### Formatação

Utilização de `DateTimeFormatter` para formatar datas e horários em diferentes padrões.

Exemplo:

```java
DateTimeFormatter formato =
        DateTimeFormatter.ofPattern("dd/MM/yyyy");

System.out.println(data.format(formato));
```

### Fusos horários

Exemplos utilizando diferentes regiões:

```text
America/Sao_Paulo
Europe/London
Asia/Tokyo
```

Também são demonstradas conversões de um `Instant` UTC para diferentes fusos horários.

### Timestamp

Exemplos de obtenção do timestamp em milissegundos utilizando:

```java
System.currentTimeMillis();
Instant.now().toEpochMilli();
```

### Formatos ISO

Utilização dos formatadores ISO disponibilizados pela API:

* `ISO_DATE`
* `ISO_DATE_TIME`

## Estrutura

```text
src
└── com.renan.datahora
    └── conteudo
        └── application
            └── DateTimeOverview.java
```

## Objetivo

Este projeto serve como material de consulta durante os estudos de Java, reunindo em uma única classe exemplos dos principais recursos relacionados a datas e horários.

A classe `DateTimeOverview` pode ser executada para visualizar no console o comportamento de cada recurso apresentado.

## Observação

A API `java.time` é a API moderna de datas e horários introduzida no Java 8 e deve ser priorizada em novos projetos em vez das antigas classes como `Date` e `Calendar`.
