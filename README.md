
# Projeto de API de Usuários

## Visão Geral

Este projeto é uma API RESTful desenvolvida em Java 17 usando uma estrutura do Maven. A API permite o gerenciamento de usuários, incluindo operações como criação, atualização, leitura e remoção de usuários. É construído com uma arquitetura organizada e modular, facilitando a manutenção e a escalabilidade.


## Estrutura do Projeto
```
/src
 ├── /main
 │   ├── /java/com/example/users
 │   │   ├── /controller        # Contém os controladores da API
 │   │   │   ├── /request       # Define classes para receber dados das requisições
 │   │   │   └── /response      # Define classes para enviar dados nas respostas
 │   │   ├── /model             # Contém as classes de modelo (entidades)
 │   │   ├── /repository        # Define as interfaces de repositório para acesso ao banco de dados
 │   │   ├── /service           # Contém a lógica de negócio da aplicação
 │   │   └── /enums             # Define enumerações usadas no projeto
 │   └── /resources
 │       └── /application.properties  # Configurações da aplicação
 └── /test                      # Contém os testes unitários e de integração

```

## Tecnologias Utilizadas

- Java 17 : Linguagem de programação principal utilizada no desenvolvimento da API.
- Maven : Ferramenta de automação de compilação e gerenciamento de dependências.
- Spring Boot : Framework utilizado para simplificar o desenvolvimento de aplicações Java, oferecendo configuração automática e um ambiente de desenvolvimento robusto.
- Spring Data JPA : Abstração sobre o JPA que facilita a implementação da camada de persistência, permitindo o acesso simplificado a bancos de dados relacionais.
- Hibernate : Framework de mapeamento objeto-relacional (ORM) usado junto com o JPA para gerenciamento de dados persistentes.
- Spring Web : Módulo do Spring usado para criar drivers que respondam às requisições HTTP.
- Spring Validation : Utilizado para validação de dados das requisições através de anotações.
- Banco de Dados : O projeto pode ser configurado para usar diferentes bancos de dados, como H2 para desenvolvimento e testes, ou PostgreSQL, MySQL em produção.


## Funcionalidades

 - Criação de Usuário : Permite criar um novo usuário no sistema fornecendo dados como nome, data de nascimento, documento, e-mail e telefone.

 - Atualização de usuário : permite atualizar os dados de um usuário existente.

- Consulta de Usuários : Permite recuperar informações de usuários, seja individualmente ou em listas, filtrando por diferentes critérios.

- Remoção de Usuário : Permite excluir um usuário do sistema.
