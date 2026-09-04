# Java Files Overview

Projeto desenvolvido para estudo e consulta dos principais recursos de **manipulação de arquivos e diretórios em Java**, utilizando principalmente as APIs `java.nio.file` e `java.io`.

O projeto apresenta exemplos práticos de leitura, escrita, criação e consulta de arquivos, além de um exercício de processamento de dados armazenados em um arquivo CSV.

---

## Objetivo

Este projeto tem como objetivo servir como um **Overview de manipulação de arquivos em Java**, reunindo exemplos práticos dos principais recursos utilizados para trabalhar com arquivos e diretórios.

Entre os conceitos abordados estão:

- `Path`
- `Paths`
- `Files`
- `BufferedReader`
- `BufferedWriter`
- `try-with-resources`
- Leitura de arquivos
- Escrita em arquivos
- Criação de arquivos
- Criação de diretórios
- Verificação de existência e permissões
- Leitura linha por linha
- Leitura de todas as linhas
- Manipulação de arquivos CSV
- Conversão de `String` para tipos numéricos
- Manipulação de objetos a partir de dados de arquivos

---

## Estrutura do Projeto

```text
JavaFilesOverview/
├── src/
│   └── com/
│       └── renan/
│           └── conteudo/
│               ├── application/
│               │   └── FilesOverview.java
│               │
│               └── exercicios/
│                   └── produto/
│                       ├── application/
│                       │   └── ProdutoProgram.java
│                       │
│                       └── entities/
│                           └── Product.java
│
├── files/
│   ├── input.txt
│   └── summary.csv
│
└── README.md
```

---

# FilesOverview

A classe `FilesOverview` reúne exemplos dos principais recursos da classe `java.nio.file.Files`.

## Informações sobre o arquivo

Utiliza recursos como:

```java
Files.exists(path);
Files.isRegularFile(path);
Files.isReadable(path);
Files.isWritable(path);
Files.size(path);
```

Esses métodos permitem verificar informações básicas sobre um arquivo.

Também são utilizados recursos da classe `Path`:

```java
path.toAbsolutePath();
path.getFileName();
path.getParent();
```

---

## Leitura do arquivo completo

Utilizando:

```java
Files.readString(path);
```

é possível carregar todo o conteúdo de um arquivo diretamente para uma `String`.

Esse recurso está disponível a partir do **Java 11**.

Exemplo:

```java
String content = Files.readString(path);
```

---

## Leitura de todas as linhas

Utilizando:

```java
Files.readAllLines(path);
```

o conteúdo do arquivo é carregado como uma:

```java
List<String>
```

Exemplo:

```java
List<String> lines = Files.readAllLines(path);

for (String line : lines) {
    System.out.println(line);
}
```

---

## Leitura linha por linha

O projeto também demonstra a utilização de `BufferedReader`:

```java
try (BufferedReader br = Files.newBufferedReader(path)) {

    String line;

    while ((line = br.readLine()) != null) {
        System.out.println(line);
    }
}
```

Essa abordagem é útil quando queremos processar o arquivo **linha por linha**.

### Try-with-resources

O `BufferedReader` é criado dentro do `try`:

```java
try (BufferedReader br = Files.newBufferedReader(path)) {
```

Dessa forma, o Java fecha automaticamente o recurso ao final do bloco `try`.

Não é necessário chamar manualmente:

```java
br.close();
```

---

# Pesquisa e processamento de conteúdo

O projeto também demonstra como pesquisar informações dentro de um arquivo.

### Verificar se uma palavra existe

```java
content.contains(word);
```

### Contar ocorrências

Utilizando:

```java
content.indexOf(search, index);
```

é possível localizar as ocorrências de uma determinada palavra dentro do conteúdo do arquivo.

---

# Escrita em arquivos

O projeto apresenta exemplos utilizando `BufferedWriter` e `Files.writeString()`.

## Adicionar conteúdo

Utilizando:

```java
StandardOpenOption.APPEND
```

é possível adicionar conteúdo ao final de um arquivo existente.

Exemplo:

```java
try (BufferedWriter bw = Files.newBufferedWriter(
        path,
        StandardOpenOption.APPEND)) {

    bw.newLine();
    bw.write("Nova linha adicionada pelo Java.");
}
```

---

## Sobrescrever um arquivo

Também é demonstrado o uso de:

```java
Files.writeString(path, "Novo conteúdo do arquivo.");
```

Por padrão, o conteúdo existente do arquivo é substituído.

> ⚠️ Os exemplos de escrita estão comentados para evitar alterações acidentais no arquivo `input.txt` durante a execução do Overview.

---

# Criação de diretórios

Utilizando:

```java
Files.createDirectories(directory);
```

é possível criar um diretório e também seus diretórios pais caso ainda não existam.

Exemplo:

```java
Path directory = Paths.get("files/test");

Files.createDirectories(directory);
```

---

# Criação de arquivos

O projeto também demonstra:

```java
Files.createFile(newFile);
```

Esse método cria um novo arquivo vazio.

Antes da criação, o projeto verifica se o arquivo já existe:

```java
if (!Files.exists(newFile)) {
    Files.createFile(newFile);
}
```

---

# Exercício: processamento de CSV

Além do Overview, o projeto possui um exercício prático de leitura e processamento de um arquivo CSV.

O arquivo `summary.csv` possui informações de produtos separadas por vírgula:

```csv
TV,1000.00,2
Notebook,2500.00,1
Mouse,50.00,5
```

A classe `ProdutoProgram` realiza a leitura do arquivo e transforma cada linha em um objeto `Product`.

---

## Utilizando `split()`

Cada linha do CSV é dividida utilizando:

```java
String[] fields = line.split(",");
```

Por exemplo:

```text
Notebook,2500.00,1
```

é transformado em:

```text
fields[0] → Notebook
fields[1] → 2500.00
fields[2] → 1
```

---

## Conversão dos dados

Como os valores obtidos pelo `split()` são `String`, é necessário convertê-los para os tipos apropriados:

```java
String name = fields[0];

double price = Double.parseDouble(fields[1]);

int quantity = Integer.parseInt(fields[2]);
```

São utilizados:

- `Double.parseDouble()` para converter `String` em `double`
- `Integer.parseInt()` para converter `String` em `int`

---

## Criação dos objetos

Após realizar a conversão, os dados são utilizados para criar um objeto `Product`:

```java
products.add(new Product(name, price, quantity));
```

Os produtos são armazenados em:

```java
List<Product> products = new ArrayList<>();
```

---

# Classe Product

A classe `Product` representa um produto e possui os seguintes atributos:

```java
private String name;
private Double price;
private Integer quantity;
```

Também possui um método responsável por calcular o valor total do produto:

```java
public Double totalValue() {
    return quantity * price;
}
```

O cálculo é realizado através da multiplicação:

```text
quantidade × preço
```

---

# Fluxo do exercício

O processamento do CSV segue o seguinte fluxo:

```text
summary.csv
     ↓
Path
     ↓
Files.newBufferedReader()
     ↓
BufferedReader
     ↓
readLine()
     ↓
split(",")
     ↓
String[]
     ↓
Conversão dos tipos
     ↓
Product
     ↓
List<Product>
     ↓
totalValue()
     ↓
Exibição no console
```

---

# Conceitos praticados

Este projeto reúne os seguintes conceitos:

### Arquivos

- `Path`
- `Paths`
- `Files`
- `BufferedReader`
- `BufferedWriter`
- `readLine()`
- `readString()`
- `readAllLines()`
- `writeString()`
- `newBufferedReader()`
- `newBufferedWriter()`
- `createFile()`
- `createDirectories()`

### Manipulação de dados

- `String.split()`
- `Double.parseDouble()`
- `Integer.parseInt()`
- `String.contains()`
- `String.indexOf()`

### Java

- Orientação a objetos
- Encapsulamento
- Construtores
- Getters e Setters
- `List`
- `ArrayList`
- `try-catch`
- `try-with-resources`
- Tratamento de `IOException`

---

## Tecnologias

- Java
- Java NIO
- Java IO
- Collections
- Programação Orientada a Objetos

---

## Observação

O uso de:

```java
String[] fields = line.split(",");
```

é adequado para este exercício e para arquivos CSV simples.

Para arquivos CSV reais que possuam campos contendo vírgulas, aspas, caracteres especiais ou regras mais complexas de escaping, recomenda-se utilizar uma biblioteca específica para processamento de CSV.

---

## Objetivo do projeto

Este projeto foi criado como material de estudo e consulta, permitindo revisar de forma prática os principais conceitos relacionados à **manipulação de arquivos em Java** e seu uso em aplicações que precisam ler, processar e gerar informações a partir de arquivos.
