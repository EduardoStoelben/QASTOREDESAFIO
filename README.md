# QASTOREDESAFIO

Este é um projeto de automação de testes desenvolvido com **Selenium** e integrado ao framework **Cucumber**. O objetivo é validar uma funcionalidade de uma aplicação web, a aplicação de cupons de desconto no carrinho de compras.

---

## Estrutura do Projeto

Abaixo está uma breve descrição da estrutura do projeto:

```plaintext
src/  
├── main/  
│   └── java/  
│       ├── driver/                # Configuração e inicialização dos drivers de teste  
│       │   ├── AppWeb.java  
│       │   └── Drivers.java  
├── test/  
│   └── java/  
│       ├── gherkin/               # Hooks (pré e pós-condições dos testes)  
│       ├── steps/                 # Implementação dos Steps do Cucumber  
│       ├── pageobjects/           # Classes de Page Object (elementos e interações)  
│       ├── runner/                # Classe Runner para execução dos testes  
│       ├── utils/                 # Utilidades e funções auxiliares  
│   └── resources/  
│       ├── features/              # Cenários Gherkin (arquivos .feature)  
│       │   └── cupons.feature  
│       └── allure.properties  
├── .gitignore                     # Arquivos e pastas ignorados pelo Git  
├── pom.xml                        # Gerenciamento de dependências (Maven)  
├── README.md                      # Documentação do projeto
```
---

## Pré-requisitos

- **Java JDK 11** ou superior.
- **Maven** instalado (para gerenciar dependências).
- Extensões de teste configuradas:
  - **Selenium WebDriver**
  - **Cucumber**
  - **Allure** para relatórios.

## Tecnologias Utilizadas
- **Selenium WebDriver:** Para automação de interações na interface web.
- **Cucumber:** Para escrita de cenários em linguagem Gherkin e execução dos testes.
- **JUnit:** Framework de testes utilizado para integração com o Cucumber.
- **Allure:** Ferramenta para geração de relatórios detalhados sobre os testes.

---

## Configuração

### Clone o repositório:

Abra o terminal e execute o seguinte comando para clonar o repositório:

```bash
git clone https://github.com/EduardoStoelben/QASTOREDESAFIO.git
```
## Instale as dependências do Maven:
Execute o comando abaixo para instalar as dependências do Maven:
```
mvn clean install
```
## Classe Runner
A classe Runner (localizada em src/test/java/runner/Runner.java) é responsável por executar os testes utilizando o framework Cucumber. A execução dos testes pode ser feita através da classe Runner, que é configurada para executar os cenários descritos nos arquivos .feature.

