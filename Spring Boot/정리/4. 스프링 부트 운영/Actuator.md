# 스프링 부트 Actuator : 소개

스프링 부트는 애플리케이션 운영 환경에서 유용하게 사용할 수 있는 Actuator라는 모듈을 제공합니다.
스프링 부트가 제공하는 다양한 엔드 포인트와 매트릭스 데이터를 활용하여 애플리케이션을 모니터링할 수 있습니다.

## Actuator 의존성 추가

```java
implementation 'org.springframework.boot:spring-boot-starter-actuator'
```

Http를 통해 접근 가능한 애플리케이션의 각종 정보를 확인할 수 있는 Endpoints들이 활성화됩니다.

https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#production-ready-endpoints    

## Actuator 접근

/actuator

- Http로 접근하면 Spring HATEOAS(Hypermedia as the Engine of Application State)를 통해 접근 가능한 링크 정보를 리턴해줌
- http를 통해 접근할 경우 공개된 정보는 health, info 두 가지 밖에 없음
- 활성화와 Endpoints를 공개하는 것은 따로 설정이 되어있음
- 활성화 여부는 Endpoint enabled로 관리
- 기본적으로 shutdown 빼고는 전부 enabled=true로 설정되어 있음