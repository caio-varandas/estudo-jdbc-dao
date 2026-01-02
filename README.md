# 📦 Projeto Java JDBC com MySQL (DAO Pattern)

![Status](https://img.shields.io/badge/Status-Concluído-success)
![Tecnologia](https://img.shields.io/badge/Tech-Java%20%7C%20JDBC%20%7C%20DAO%20Pattern%20%7C%20MySQL-blue)



Este projeto é um exemplo prático de acesso a banco de dados usando JDBC em Java, aplicando o padrão DAO (Data Access Object) para realizar operações de CRUD em entidades como Department e Seller.

O objetivo do projeto é estudo e prática de JDBC, organização em camadas e boas práticas de acesso a dados.

## 🛠️ Tecnologias Utilizadas

- **Java (JDK 8+)**
- **MySQL**
- **JDBC (java.sql)**
- **Padrão DAO**
- **MySQL Connector/J**

## Estrutura do Projeto

```

src
├── application
│   ├── Program.java
│   └── Program2.java
│
├── db
│   ├── DB.java
│   ├── DbException.java
│   └── DbIntegrityException.java
│
├── model
│   ├── dao
│   │   ├── DaoFactory.java
│   │   ├── DepartmentDao.java
│   │   └── SellerDao.java
│   │
│   ├── dao.impl
│   │   ├── DepartmentDaoJDBC.java
│   │   └── SellerDaoJDBC.java
│   │
│   └── entities
│       ├── Department.java
│       └── Seller.java
│
├── db.properties   (IGNORADO pelo git)
└── README.md

```

## 🗄️ Banco de Dados

O projeto utiliza MySQL como banco de dados.

## 📄 Script SQL

```sql
CREATE TABLE department (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL
);

CREATE TABLE seller (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Email VARCHAR(100) NOT NULL,
    BirthDate DATE NOT NULL,
    BaseSalary DOUBLE NOT NULL,
    DepartmentId INT NOT NULL,
    FOREIGN KEY (DepartmentId) REFERENCES department(Id)
);
```

## Configuração do Banco (db.properties)

O arquivo db.properties não é versionado (está no .gitignore) e deve ser criado localmente com o seguinte conteúdo:

```properties

user=seu_usuario
password=sua_senha
dburl=jdbc:mysql://localhost:3306/seubanco
useSSL=false

```

## 🚀 Funcionalidades

### Department

- **findById**
- **findAll**
- **insert**
- **update**
- **deleteById**

### Seller

- **findById**
- **findAll**
- **findByDepartment**
- **insert**
- **update**
- **deleteById**


## ▶️ Como Executar

1. Clone o repositório
2. Crie o banco de dados no MySQL
3. Execute o script SQL
4. Crie o arquivo `db.properties`
5. Adicione o MySQL Connector/J ao projeto
6. Execute a classe `Program.java` (ou `Program2.java`)

## 🧠 Conceitos Aplicados

- JDBC puro (`java.sql`)
- PreparedStatement
- ResultSet
- Chaves geradas automaticamente
- Padrão DAO
- Tratamento de exceções personalizadas
- Conversão entre `LocalDate` e `java.sql.Date`

## 📌 Observações

Este projeto foi desenvolvido com foco em aprendizado e não utiliza frameworks
como Spring ou JPA, com o objetivo de compreender o funcionamento do JDBC puro
e do padrão DAO.
