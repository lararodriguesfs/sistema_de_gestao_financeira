# 💼 Sistema de Cadastro e Controle Financeiro

**`API REST em Java com Spring Boot para cadastro pessoal e controle financeiro`**

Este projeto é uma API REST desenvolvida em **Java** com **Spring Boot**, que oferece um sistema robusto para cadastro de pessoas, categorias e lançamentos financeiros. Com validação rigorosa, persistência em **MySQL** e versionamento de banco usando **Flyway**, demonstra boas práticas de backend.

---

### 🛠 Tecnologias Utilizadas

<img alt="Java" title="Java" width="20px" 
style="padding-right:5px; vertical-align:middle;" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" /> Java 21 <img alt="Spring Boot" title="Spring Boot" width="20px" style="padding-right:5px; vertical-align:middle;" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" /> Spring Boot 3.4.5 💾 Spring Data JPA 
✅ Spring Validation <img alt="MySQL" title="MySQL" width="20px" style="padding-right:5px; vertical-align:middle;" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original.svg" /> MySQL 🔄 Flyway (migrações e versionamento do banco) 
🧹 Lombok <img alt="Insomnia" title="Insomnia" width="20px" 
style="padding-right:5px; vertical-align:middle;" src="https://kasmweb.com/assets/images/appImage7.png" /> Insomnia (testes de API REST)

<br/>

---

### ⚙️ Funcionalidades Principais

- 👤 Cadastro de pessoas com dados completos (logradouro, bairro, CEP, cidade, UF etc.) com validações específicas.  
- 📂 Gerenciamento de categorias financeiras.  
- 💰 Controle detalhado de lançamentos financeiros (descrição, datas, valores, observações, vínculo com categoria e pessoa).  
- 🔐 Validação integrada para garantir integridade e consistência dos dados.  
- 📑 Versionamento automático do banco com Flyway.  

---

### 🗂 Estrutura de Dados

| Entidade     | Campos principais                                                                                               |  
|--------------|----------------------------------------------------------------------------------------------------------------|  
| 👤 Pessoa    | nome, logradouro, bairro, cep (8 dígitos), cidade, uf, complemento, número                                      |  
| 📂 Categoria | nome                                                                                                           |  
| 💰 Lançamento| descricao, dataVencimento (hoje), dataPagamento, valor (0), observação (máx 200 chars), tipo, categoria, pessoa |  

---

### 📌 Considerações Finais

Projeto desenvolvido na faculdade como parte de uma avaliação prática de desempenho, demonstrando boas práticas no desenvolvimento backend com Spring Boot, incluindo validação, persistência e versionamento de banco.

