# Backend-web-api

## Descrição
O projeto retrata-se a operações básicas de um CRUD, como criar, editar, listar e deletar usuários. Para isso, é utilizado o **Java** e seu poderoso framework **Spring Boot**, para realizar todas as tarefas e salvar no banco de dados **MySQL**.

## Instrução de instalação
* <a href='https://www.jetbrains.com/pt-br/idea/'>IDE</a> do seu gosto;
* Instalação do <a href='https://www.java.com/pt-BR/download/manual.jsp'>Java</a>;
* Instalação do banco <a href='https://www.mysql.com/downloads/'>MySQL</a>;
* <a href='https://www.apachefriends.org/pt_br/download.html'>XAMPP</a>, para conexão com banco de dados;
* Usar o <a href='https://start.spring.io/'>spring initializr</a> para instalação das dependências;
* Utilizar o <a href='https://www.postman.com/downloads/'>Postman</a> ou outra ferramenta para testes de requisições na api.

## Instrução de uso
1. Ao criar um projeto pelo spring initializr e utilizar o gerenciador de pacotes **Maven**, a execução do código ficará por conta do Tomcat, onde rodará na porta 8080;
2. Será necessário inicializar o servidor do MySQL no XAMPP;
3. A API ficará acessivel em <a>http://localhost:8080</a>
4. Antes de rodar pela primeira vez o código, certifique-se de criar um banco e configurar o arquivo application.properties. Esse arquivo é responsável principalmente por fazer a conexão com o MySQL;
5. A porta que se encontra no arquivo application.properties, deve ser a mesma que o mysql roda no seu pc.

### application.properties
```properties
spring.application.name=PROJECT_NAME

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:PORT/MYSQL_DATABASE
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
spring.datasource.username=MYSQL_USER
spring.datasource.password=MYSQL_PASSWORD   
```

## API Endpoints

A API possui os seguintes endpoints:

```
POST /usuarios - Salvar um usuário no banco de dados.
GET /usuarios - Listar todos os usuários cadastrados.
GET /usuarios/id - Buscar um usuário pelo id.
DELETE /usuarios/id - Deletar um usuário pelo id.
PUT /usuarios - Atualizar um usuário pelo body
```









