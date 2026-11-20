# Servvista Clean Backend

This project is an isolated clean-architecture migration of the existing Servvista backend.
The original project is not modified.

## Dependency direction

```
adapter.in.web
      |
      v
application.service ---> application.port.out
      |                         ^
      v                         |
    domain              infrastructure.config
```

## Packages

- `domain`: business entities, value enums and domain rules.
- `application.dto`: API-independent commands, queries and result models.
- `application.service`: use-case orchestration and transaction boundaries.
- `application.port.out`: persistence/output contracts used by application services.
- `adapter.in.web`: REST controllers. Controllers translate HTTP to application calls.
- `infrastructure.config`: security, persistence and framework configuration.
- `infrastructure.exception`: centralized technical exception translation.

## Compatibility

- Existing REST paths are preserved.
- Existing Flyway migrations are preserved.
- Existing MySQL schema compatibility is preserved.
- Java 21 and Spring Boot are used.

## Rules

1. Domain code must not import web adapters or application services.
2. Controllers must not access persistence ports directly.
3. Application services own use-case transactions.
4. Infrastructure may depend inward; inward layers must not depend on web adapters.
5. New features must be added as a vertical slice across these boundaries.

## Run

```powershell
.\mvnw.cmd spring-boot:run
```

Configure the datasource and JWT properties in `src/main/resources/application.properties`
or through environment variables before running outside local development.
