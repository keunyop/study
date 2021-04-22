# 스프링 데이터 7부: 데이터베이스 초기화

### JPA를 사용한 데이터베이스 초기화

- spring.jpa.hibernate.ddl-auto

- spring.jpa.generate-dll=true로 설정해 줘야 동작함.

### SQL 스크립트를 사용한 데이터베이스 초기화

- schema.sql 또는 schema-${platform}.sql

- data.sql 또는 data-${platform}.sql

- ${platform} 값은 spring.datasource.platform으로 설정 가능.
