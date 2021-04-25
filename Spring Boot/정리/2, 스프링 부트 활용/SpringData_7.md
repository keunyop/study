# 스프링 데이터 7부: 데이터베이스 초기화

### JPA를 사용한 데이터베이스 초기화

- application.yml을 통해 스키마를 자동 생성 및 업데이트 할 수 있다.

```
spring.jpa.hibernate.ddl-auto=create
spring.jpa.generate-ddl=false
```

> - create-drop: 기동시 스키마를 만들고 종료시 스키마를 지운다. (데이터 유지 X)
> - create: 기동시 스키마를 만들기 전에 초기화하고 새로 만든다. (데이터 유지 X)
> - update: 기존의 스키마는 두고 추가 된 컬럼이나 변경된 항목만 스키마를 변경한다. (데이터 유지 O)
> - validate: 현재 엔티티 맵핑이 관계형 DB에 맵핑할 수 있는 상태인지 검증만 한다.

### SQL 스크립트를 사용한 데이터베이스 초기화

- schema.sql 파일을 resource 디렉토리에 생성하여 스크립트로 따로 관리하여 스키마 생성이 가능하다.

```sql
drop table if exists account CASCADE 
drop sequence if exists hibernate_sequence
create sequence hibernate_sequence start with 1 increment by 1
create table account (id bigint not null, password varchar(255), username varchar(255), primary key (id))
```

- 스키마 생성 외에도 초기 데이터를 넣고 싶다면 data.sql을 사용 할 수 있다.

```sql
insert into account (password, username, id) values ('admin', 'admin', '123')
```


- 실행 순서

> schema.sql -> data.sql -> application.yml