# Desafio Controle de Fluxo

## Descrição do Desafio

Este projeto faz parte da **Trilha Java Básico** da [DIO](https://www.dio.me). O objetivo é exercitar os conceitos de **Controle de Fluxo** aprendidos no módulo, implementando o seguinte cenário:

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros. Com esses dois números, o programa deverá calcular a quantidade de interações (`for`) e imprimir no console os números incrementados. 

### Regras:
1. **Exemplo de entrada e saída**:
   - Entrada: `12` e `30`
   - Saída: 
     ```
     Imprimindo o número 1
     Imprimindo o número 2
     ...
     Imprimindo o número 18
     ```

2. **Validação**:
   - Se o **primeiro parâmetro** for **maior** que o **segundo**, o sistema deverá lançar uma exceção customizada chamada `ParametrosInvalidosException` com a mensagem: `"O segundo parâmetro deve ser maior que o primeiro"`.

### Estrutura do Projeto:
- **Classe `Contador`**: Contém a lógica principal do programa.
- **Classe `ParametrosInvalidosException`**: Representa a exceção de negócio do sistema.

## Estrutura do Repositório

- Repositório original do desafio: [DIO - Trilha Java Básico](http://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/controle-fluxo)
- Repositório deste projeto: [Meu Repositório](https://github.com/lucaslmp2/dio-java-basico/tree/main/dio-java-basic/Estudos/Lucas/Desafio/Contador)

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/lucaslmp2/dio-java-basico.git
   ```
2. Acesse a pasta do projeto:
   ```bash
   cd dio-java-basico/dio-java-basic/Estudos/Lucas/Desafio/Contador
   ```
