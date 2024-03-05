# Automação API com RestAssured

Este é um README para guiar você na automação de testes de api usando o RestAssured com Maven e Java 19. Aqui você encontrará informações essenciais sobre a configuração, instalação e execução dos testes automatizados.

## Descrição do Projeto

O objetivo deste projeto é criar testes automatizados que simulem o comportamento do usuário em um navegador web, verificando se é possível realizar uma transação.

## Pré-requisitos

Antes de começar, certifique-se de que você tenha as seguintes dependências instaladas em seu ambiente de desenvolvimento:

- Java Development Kit (JDK) 19: [JDK19](https://www.oracle.com/java/technologies/javase/jdk19-archive-downloads.html)
- Maven: [Instalar Maven](https://maven.apache.org/install.html)

Certifique-se também de ter um navegador web instalado em seu sistema para que o Selenium possa interagir com ele durante a execução dos testes.

## Configuração do Projeto

1. Clone o repositório para o seu ambiente de desenvolvimento:

   ```bash
   git clone https://github.com/Franias/CEP-rest-assured
   ```

2. Navegue até o diretório raiz do projeto:

   ```bash
   cd ..
   ```

3. Compile o projeto e baixe as dependências usando o Maven:

   ```bash
   mvn install
   ```
## Executando os Testes

Após a configuração do projeto, você pode executar os testes automatizados usando o seguinte comando Gradle:

```bash
mvn test
```
