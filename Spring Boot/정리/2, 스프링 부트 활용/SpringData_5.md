# 스프링 데이터 5부: 스프링 데이터 JPA 소개

### ORM(Object-Relational Mapping)

- 객체와 릴레이션을 매핑할 때 발생하는 개념적 불일치를 해결하는 프레임워크

>> - 객체는 구조가 복잡하고 다양하지만 테이블은 테이블과 칼럼 밖에 없고 크기가 한정적임
>> - 테이블은 상속이 없지만 객체들은 상속이 있음 클래스 간에 상속 구조를 만들 수도 있음
>> - Relational에서 식별자(PK)는 단순한 반면 object에서의 식별자는 무엇인가? 객체의 hashcode? equals method?
>> - 테이블에서는 PK의 값이 같으면 같은 건데 object에서는 객체의 프로퍼티 값이 같으면 같은 객체라고 할 수 있는가?
>> - 객체의 ID가 null이면 어떻게 처리해야 하는지?

### JPA(Java Persistence API)

- Persistence - 프로세스가 생성했지만 별개로 유지되는 상태의 특징 중 한 가지이며, 별도의 기억 장치에 데이터를 보존하는 것을 목적으로 한다.

- JPA - ORM을 위한 자바 (EE) 표준

### Hibernate

> http://hibernate.org/orm/what-is-an-orm/

- 대부분의 JPA Spec이 Hibernate에 기반해서 만들어져 있다.


### 스프링 데이터 JPA

- Repository 빈 자동 생성

- 쿼리 메서드 자동 구현

- @EnableJpaRepositories (스프링 부트 자동으로 설정)

- Spring Data JPA -> JPA -> Hibernate -> JDBC -> Datasource

```gradle
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
```
