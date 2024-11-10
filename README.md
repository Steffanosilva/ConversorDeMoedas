# 💱 Conversor de Moedas

Um aplicativo de console em Java para conversão de moedas. O conversor permite ao usuário escolher entre diferentes pares de moedas e converte os valores em tempo real, utilizando uma API externa para obter as taxas de câmbio atualizadas.

## ⚙️ Funcionalidades

- 💵 **Suporta conversão de múltiplas moedas para o Real brasileiro (BRL) e vice-versa.**
- 🔄 **Obtenção de taxas de câmbio em tempo real usando uma API.**
- 🖥️ **Interface de linha de comando simples e fácil de usar.**
- 🌐 **Conversões disponíveis:**
  - 🇺🇸 Dólar Americano (USD) para Real (BRL)
  - 🇪🇺 Euro (EUR) para Real (BRL)
  - 🇬🇧 Libra Esterlina (GBP) para Real (BRL)
  - 🇯🇵 Iene (JPY) para Real (BRL)
  - 🇨🇦 Dólar Canadense (CAD) para Real (BRL)
  - 🇨🇭 Franco Suíço (CHF) para Real (BRL)
  - 🇦🇺 Dólar Australiano (AUD) para Real (BRL)
  - 🇨🇳 Yuan Chinês (CNY) para Real (BRL)
  - 🇲🇽 Peso Mexicano (MXN) para Real (BRL)
  - 🇧🇷 Real (BRL) para Dólar Americano (USD)

## 🛠️ Tecnologias Utilizadas

- **Java** ☕: Linguagem de programação principal.
- **Gson** 📦: Biblioteca para processamento de dados JSON, usada para interpretar a resposta da API.
- **API de taxas de câmbio** 🌍: Para obter as taxas de câmbio atualizadas.

## 📂 Estrutura do Projeto

O projeto é organizado nas seguintes classes:

- **AppConversor**: Classe principal que exibe o menu e interage com o usuário.
- **ConversorDeMoedas**: Realiza as chamadas para a API e lida com a lógica de conversão.
- **ServicoDeTaxaDeCambio**: Realiza a solicitação à API e retorna as taxas de câmbio.
- **RespostaAPI**: Classe modelo para mapear a estrutura JSON retornada pela API.

## 🚀 Pré-requisitos

- **Java 8** ou superior
- **Biblioteca Gson**: Se você estiver usando o Maven ou o Gradle, basta incluir a dependência. Se não, baixe o `.jar` [aqui](https://mvnrepository.com/artifact/com.google.code.gson/gson) e adicione ao projeto.

## 📝 Configuração e Instalação

1. Clone este repositório:
   - git clone https://github.com/Steffanosilva/ConversorDeMoedas.git
   - cd conversor-de-moedas
2. Adicione a biblioteca Gson ao seu projeto.
3. Adicione uma chave de API no código (ServicoDeTaxaDeCambio), substituindo "SUA_API_KEY" pela sua chave de API.
4. Compile e execute o projeto:
   - javac -d bin src/*.java
   - java -cp bin AppConversor

## ▶️ Como Usar

- Execute o programa e escolha uma das opções de conversão de moedas.
- Insira o valor que deseja converter.
- O resultado será exibido na tela com a moeda de destino.

## 💻 Exemplo de Uso

* Escolha a moeda que deseja converter:
   
  1 - Dólar (USD para Real (BRL)
  
  2 - Euro (EUR) para Real (BRL)

* Escolha uma das opção digitando o número correspondente: 1
* Digite o valor a ser convertido: 100
* Resultado: 100.00 USD = 500.50 BRL

## ⚠️ Observação

As taxas de câmbio são obtidas em tempo real, então você precisará de uma conexão com a internet para usar o conversor.

## 🤝 Contribuição

Sinta-se à vontade para abrir o aplicativo. Toda contribuição é bem-vinda! 😊

## 📄 Licença

Este projeto está licenciado sob a Licença MIT.


