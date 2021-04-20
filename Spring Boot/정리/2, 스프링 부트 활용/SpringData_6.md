# 스프링 데이터 6부: 스프링 데이터 JPA 연동

### 스프링 데이터 JPA 의존성 추가

```gradle
implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
```

### 스프링 데이터 JPA 사용하기

- @Entity 클래스 만들기

- Repository 만들기

### 스프링 데이터 리파지토리 테스트 만들기

- H2 DB를 테스트 의존성에 추가하기

```gradle
testCompile 'com.h2database:h2'
```

- @DataJpaTest (슬라이스 테스트) 작성

> : 해당 Reopository와 관련된 bean 들만 등록을 해서 테스트를 만드는 것

- @SpringBootTest는 통합 테스트