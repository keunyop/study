# 스프링 웹 MVC 1부: 소개

## 스프링 웹 MVC

Spring Web MVC는 Servlet API를 기반으로 만들어진 web framework이며 처음부터 Spring Framework에 포함되어 있었다.

Spring Framework 5.0부터는 Spring Web MVC와 병행하여 Spring WebFlux라는 reactive-stack web framework가 추가되었다.

## 스프링 부트 MVC

아무런 설정 파일을 작성하지 않아도 스프링 부트가 제공해 주는 기본 설정 때문에 스프링 웹 MVC 개발을 시작할 수 있다.

SpringBoot AutoConfiguration 플러그인 안에 WebMvcAutoConfiguration 가 자동 설정을 제공

## 스프링 MVC 확장 및 재정의

> 스프링 부트 MVC에 추가적인 설정이 필요하면 WebMvcConfigurer을 확장해서 필요한 Callback Method를 호출하여 정의하여 사용

> @EnableWebMvc를 같이 사용하면 모든 스프링 MVC 설정이 다 사라지고 재정의 해야 됨


```java
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
}
```

https://docs.spring.io/spring/docs/5.0.7.RELEASE/spring-framework-reference/web.html#spring-web