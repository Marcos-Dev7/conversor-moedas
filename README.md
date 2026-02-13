# 💱 Conversor de Moedas - Challenge Alura & Oracle Next Education

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

Este é um projeto de conversão de moedas desenvolvido como parte do desafio proposto pela **Alura** em parceria com o programa **Oracle Next Education (ONE)**. O objetivo é aplicar conceitos de programação Java, consumo de APIs e manipulação de arquivos JSON.

## 🚀 Funcionalidades

O programa oferece uma interface de console interativa com 6 opções de conversão em tempo real:
- Dólar ➡️ Peso Argentino
- Peso Argentino ➡️ Dólar
- Dólar ➡️ Real Brasileiro
- Real Brasileiro ➡️ Dólar
- Dólar ➡️ Peso Colombiano
- Peso Colombiano ➡️ Dólar

## 🛠️ Tecnologias e Ferramentas

Para o desenvolvimento deste projeto, foram utilizadas as seguintes ferramentas:
- **Linguagem Java**: Versão 25 (utilizando recursos como `Records` e `Text Blocks`).
- **API ExchangeRate-API**: Para obter as taxas de câmbio em tempo real.
- **Biblioteca Gson**: Para o mapeamento de dados JSON.
- **Dotenv-java**: Para o gerenciamento seguro de chaves de API através de variáveis de ambiente.
- **HttpClient**: Para realizar as requisições assíncronas à API.

## 📋 Pré-requisitos e Execução

### 1. Obtenha uma Chave de API
Cadastre-se no site [ExchangeRate-API](https://www.exchangerate-api.com/) para obter sua chave gratuita.

### 2. Configuração do Ambiente
Crie um arquivo chamado `.env` na raiz do projeto e adicione sua chave:
```env
EXCHANGE_API_KEY=sua_chave_aqui
```
### 3. Execução
Abra o projeto em sua IDE de preferência (IntelliJ, VS Code, Eclipse) e execute a classe `Principal.java` localizada no pacote `br.com.marcos.conversor`.

## 📂 Estrutura do Projeto

O projeto foi organizado seguindo boas práticas de modularização para separar as responsabilidades:

* **`br.com.marcos.api`**: Contém a lógica de infraestrutura, incluindo a classe `ConsultarMoeda` para requisições HTTP e o Record `RespostaApi` para o mapeamento do JSON.
* **`br.com.marcos.conversor`**: Contém a classe `Principal`, que gerencia a interface de texto, o menu interativo e o controle do fluxo de repetição (`while/switch`).
* **`.env`**: Gerenciamento de chaves de API para garantir a segurança das credenciais.

---
**Desenvolvido por Marcos Paulo de Freitas Pereira 🖥️**
*Estudante de Engenharia de Software - Contagem/MG*