# Sistema de Filtragem de Produtos com Java

Este projeto é uma aplicação de linha de comando em Java para ler dados de produtos de um arquivo CSV, calcular o preço médio e filtrar produtos abaixo dessa média. O projeto foi desenvolvido com o intuito de praticar o uso de **Streams API**, **Lambdas** e **Method References** em coleções, além da manipulação de arquivos.

## Funcionalidades

1. **Leitura de Arquivo CSV**: Lê dados de produtos a partir de um arquivo CSV especificado pelo usuário. Cada linha do arquivo deve conter o nome e o preço de um produto, separados por uma vírgula.
2. **Cálculo do Preço Médio**: Calcula o preço médio de todos os produtos lidos, utilizando **method reference** para simplificar a chamada ao método `getPrice`.
3. **Filtragem e Ordenação**: Filtra os produtos cujo preço é inferior ao preço médio, ordenando-os em ordem alfabética inversa antes de exibi-los.

## Tecnologias e Conceitos Utilizados

- **Java 8+**: Aproveitamento das funcionalidades da linguagem, como **Lambda Expressions**, **Method References** e **Streams API**.
- **Streams API**: Utilizada para manipulação de coleções, realizando operações como filtro, mapeamento e cálculo de média de forma eficiente.
- **Method References**: Uso de method references (`Product::getPrice`) para simplificar operações em Streams.
- **Manipulação de Arquivos**: Leitura de dados de arquivos externos usando `BufferedReader` e `FileReader`.
- **Collections**: Uso de `ArrayList` para armazenamento dinâmico dos produtos.
- **Interface Comparable**: Implementação de ordenação personalizada na classe `Product`.

## Estrutura do Projeto

- **App.java**: Classe principal responsável por gerenciar a entrada do usuário, leitura do arquivo e exibição dos resultados.
- **Product.java**: Classe `Product` que representa o modelo dos produtos com propriedades como nome e preço, além de métodos para ordenação.

## Como Executar

1. Clone o repositório e abra o projeto em sua IDE de preferência.
2. Compile e execute a classe `App.java`.
3. Insira o caminho para o arquivo CSV quando solicitado no terminal. O arquivo deve seguir o formato:

    ```
    NomeProduto1,Preco1
    NomeProduto2,Preco2
    ```

4. O programa exibirá o preço médio dos produtos e listará aqueles com preços abaixo da média, em ordem alfabética inversa.

## Exemplo de Uso

```plaintext
Digite o caminho do arquivo: /caminho/para/arquivo.csv

Preço Médio Dos Produtos: 50.00

Produto3, 45.00
Produto1, 30.00
