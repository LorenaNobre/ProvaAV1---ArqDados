# Projeto Links

## Tecnologias Usadas
- Spring Boot
- MariaDB (via XAMPP)
- JPA / Hibernate
- Lombok

## Instruções
1. Instale o XAMPP e ative o MariaDB.
2. Crie o banco `linksdb` no phpMyAdmin.
3. Clone este repositório e abra no VSCode.
4. Rode o projeto com `LinksApplication.java`.

## Endpoints
- `/categorias` (GET, POST, PUT, DELETE)
- `/links` (GET, POST, PUT, DELETE)

## Estrutura
- Uma `Categoria` pode ter muitos `Links` (1:N)
- Exemplo para POST /links:
```json

