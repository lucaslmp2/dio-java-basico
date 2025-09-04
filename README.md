# Projeto Dio Java Básico

Este repositório contém os códigos e desafios desenvolvidos durante o aprendizado da linguagem de programação Java na trilha **Java Básico** da [DIO](https://www.dio.me).

## Documentação de Referência
- [Documentação Oficial do Java](https://docs.oracle.com/javase/8/docs/)
- [Documentação do Visual Studio Code para Java](https://code.visualstudio.com/docs/java/java-tutorial)

## Estrutura do Projeto

O projeto está organizado como um projeto Maven, mas com uma estrutura de diretórios não convencional. Os códigos de estudo estão separados por dias e desafios.
O projeto segue a estrutura padrão de um projeto Maven para simplificar a compilação e o gerenciamento.

**Observação:** A estrutura atual possui um diretório `dio-java-basic` aninhado, e o `pom.xml` está configurado para buscar os fontes a partir de `dio-java-basic/Estudos/Lucas`. Para projetos futuros, é recomendável seguir a estrutura padrão do Maven (`src/main/java`, `src/test/java`).

```
.
├── .vscode
│   └── settings.json
├── dio-java-basic
│   └── Estudos
│       └── Lucas
│           ├── Desafio
│           │   └── Contador
│           │       ├── README.md
│           │       └── src
│           │           ├── contador.java
│           │           └── ParametrosInvalidosException.java
│           ├── OitavoDia
│           │   └── ControleCandidatos
│           │       └── src
│           │           └── candidatura
│           │               └── ProcessoSeletivo.java
│           ├── PrimeiroDia
│           │   ├── BoletimEstudantil.java
│           │   └── MinhaClasse.java
│           ├── QuintoDia
│           │   └── ...
│           ├── SegundoDia
│           │   ├── Operadores.java
│           │   └── TiposVariaveis.java
│           └── TerceiroDia
│               └── SobreMim.java
├── .gitignore
├── launch.json
├── pom.xml
└── README.md
```

## Pré-requisitos

- Java JDK 11 ou superior
- Apache Maven 3.6 ou superior

## Configuração e Execução

1.  **Clone o repositório:**
   ```bash
   git clone https://github.com/lucaslmp2/dio-java-basico
   ```
   
2.  **Navegue até o diretório do projeto:**
   ```bash
   cd dio-java-basic
   ```

3.  **Compile o projeto com Maven:**
   Como os arquivos-fonte não estão na estrutura padrão, o `pom.xml` foi configurado para encontrá-los. Para compilar todos os arquivos `.java`:
   ```bash
   mvn compile
   ```
   Os arquivos `.class` serão gerados no diretório `target/classes`.

4.  **Executando os exemplos:**
    Este projeto é uma coleção de pequenos programas e não uma aplicação única. Você pode executá-los individualmente.

    **Via Linha de Comando (após compilar):**
    Por exemplo, para executar o desafio `Contador`:
    ```bash
    java -cp target/classes/ contador
    ```
    *Nota: Alguns arquivos podem estar em pacotes, então o comando para executá-los pode variar. Por exemplo, `ProcessoSeletivo` está no pacote `candidatura`.*
    ```bash
    java -cp target/classes/ candidatura.ProcessoSeletivo
    ```

    **Via VS Code:**
    O arquivo `launch.json` já contém configurações para executar alguns dos programas diretamente pelo painel "Run and Debug" (Executar e Depurar) do VS Code.

## Contribuição

Sinta-se à vontade para contribuir com melhorias ou correções. Faça um fork do repositório e envie um pull request com suas alterações.