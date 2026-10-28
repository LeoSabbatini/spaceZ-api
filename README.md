# spaceZ API

API back end do app [spaceZ](https://github.com/LeoSabbatini/spaceZ), que fornece os dados dos planetas do Sistema Solar (nome, descrição, tamanho, duração do ano, temperatura e posição em relação ao Sol).

## Tecnologias

- Java 21
- Spring Boot 4.1.1 (Web MVC e Data JPA)
- MySQL
- Lombok
- Swagger / OpenAPI (springdoc)
- Maven

## Pré-requisitos

- JDK 21
- MySQL em execução
- Maven (ou use o wrapper `mvnw` incluído)

## Configuração

Crie o banco no MySQL:

```sql
CREATE DATABASE spacez;
```

Configure a conexão em `application.yaml`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spacez
spring.datasource.username=<usuario>
spring.datasource.password=<senha>
spring.jpa.hibernate.ddl-auto=update
```

## Como rodar

```bash
git clone https://github.com/LeoSabbatini/spaceZ-api.git
cd spaceZ-api
./mvnw spring-boot:run
```

No Windows, use `mvnw.cmd spring-boot:run`.

A API sobe em `http://localhost:8080`.

## Documentação

Com a API rodando, a documentação Swagger fica em:

```
http://localhost:8080/swagger-ui/index.html
```

## Endpoints

| Método | Rota               | Descrição |
|--------|--------------------|-----------|
| GET | `/<planetas>`      | lista todos os planetas |
| GET | `/<planetas>/{id}` | busca um planeta pelo id |

## Estrutura

```
spaceZ-api/
├── src/main/java/     # código da API
├── src/main/resources # configurações
└── pom.xml
```