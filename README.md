💼 Sistema de Cadastro e Controle Financeiro
📋 Visão Geral
Este projeto é uma API REST desenvolvida em Java com Spring Boot, que oferece um sistema robusto para cadastro de dados pessoais e controle financeiro. Permite gerenciar pessoas, categorias e lançamentos financeiros, com validação rigorosa dos dados e persistência em banco MySQL.

Desenvolvido como avaliação acadêmica para demonstrar competências em backend, validação, persistência e versionamento de banco.

🛠 Tecnologias Utilizadas
🟦 Java 21

🌱 Spring Boot 3.4.5

💾 Spring Data JPA

✅ Spring Validation

🐬 MySQL

🔄 Flyway (migrações e versionamento do banco)

🧹 Lombok

🔧 Insomnia (testes de API REST)

⚙️ Funcionalidades Principais
👤 Cadastro de pessoas com dados completos (logradouro, bairro, CEP, cidade, UF etc.) com validações específicas.

📂 Gerenciamento de categorias financeiras.

💰 Controle detalhado de lançamentos financeiros (descrição, datas, valores, observações, vínculo com categoria e pessoa).

🔐 Validação integrada para garantir integridade e consistência dos dados.

📑 Versionamento automático do banco com Flyway.

🗂 Estrutura de Dados
Entidade	Campos principais
👤 Pessoa	nome, logradouro, bairro, cep (8 dígitos), cidade, uf, complemento, número
📂 Categoria	nome
💰 Lançamento	descricao, dataVencimento (≥ hoje), dataPagamento, valor (>0), observação (máx 200 chars), tipo, categoria, pessoa

🚀 Configuração e Execução
🔧 Configure as credenciais do banco MySQL no arquivo application.properties.

🛠 Execute as migrações do Flyway para criação das tabelas.

▶️ Inicie a aplicação com:

bash
Copiar
Editar
mvn spring-boot:run
📲 Utilize Insomnia ou ferramenta similar para consumir os endpoints REST.

📡 Endpoints Principais para Testes
POST /pessoas — Cadastro de pessoa

POST /categorias — Cadastro de categoria

POST /lancamentos — Cadastro de lançamento financeiro

📌 Considerações Finais
Projeto acadêmico que demonstra boas práticas no desenvolvimento backend com Spring Boot, incluindo validação, persistência e versionamento de banco.

📩 Para dúvidas ou colaborações, sinta-se à vontade para entrar em contato.
