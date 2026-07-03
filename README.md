# BootWhats 🚀

Sistema desenvolvido em **Java + Spring Boot** como parte dos estudos em desenvolvimento back-end. O projeto tem como objetivo evoluir gradualmente para uma aplicação integrada à API do WhatsApp, permitindo o gerenciamento de usuários e a automação de atendimentos.

## 📌 Tecnologias utilizadas

* Java 21
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* Maven
* MySQL
* Hibernate
* Git e GitHub

## 📂 Funcionalidades implementadas

* ✅ Cadastro de usuários
* ✅ Listagem de usuários
* ✅ Edição de usuários
* ✅ Integração com banco de dados MySQL
* ✅ Interface utilizando Thymeleaf
* ✅ Persistência de dados com Spring Data JPA

## 📷 Telas do sistema

* Página inicial
* Cadastro de usuários
* Lista de usuários
* Edição de usuários

*(Em breve serão adicionadas imagens das telas.)*

## 🗂 Estrutura do projeto

```text
src
 └── main
     ├── java
     │   └── br.com.bootwhats
     │       ├── controller
     │       ├── model
     │       ├── repository
     │       └── BootwhatsApplication.java
     │
     └── resources
         ├── templates
         └── application.properties
```

## ⚙️ Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/josehumberto1906/bootwhats.git
```

### 2. Entre na pasta

```bash
cd bootwhats
```

### 3. Configure o banco de dados

Crie um banco MySQL chamado:

```sql
CREATE DATABASE bootwhats;
```

Configure o arquivo `application.properties` com seu usuário e senha do MySQL.

Exemplo:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bootwhats
spring.datasource.username=root
spring.datasource.password=sua_senha
```

### 4. Execute o projeto

Utilizando Maven:

```bash
mvn spring-boot:run
```

Ou execute a classe:

```text
BootwhatsApplication.java
```

A aplicação ficará disponível em:

```text
http://localhost:8080
```

## 📌 Próximas funcionalidades

* [ ] Exclusão de usuários
* [ ] Pesquisa de usuários
* [ ] Paginação
* [ ] Interface com Bootstrap
* [ ] Login com Spring Security
* [ ] Criptografia de senhas (BCrypt)
* [ ] API REST
* [ ] Integração com a API Oficial do WhatsApp
* [ ] Chatbot automatizado
* [ ] Deploy na nuvem

## 🎯 Objetivo do projeto

Este projeto foi criado para aprofundar os conhecimentos em Java, Spring Boot e desenvolvimento web, evoluindo de um CRUD para uma aplicação completa com integração ao WhatsApp Business API.

## 👨‍💻 Autor

**José Humberto Garcia Luis**

Estudante de Sistemas de Informação, com foco em desenvolvimento Back-end utilizando Java, Spring Boot, banco de dados e integração de APIs.

---

⭐ Se este projeto foi útil para você, deixe uma estrela no repositório!
