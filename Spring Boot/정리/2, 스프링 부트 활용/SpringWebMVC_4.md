# 스프링 웹 MVC 4부: 정적 리소스 지원

정적 리소스 맵핑 “/**”

- 기본 리소스 위치

classpath:/static

classpath:/public

classpath:/resources/

classpath:/META-INF/resources

예) “/hello.html” => /static/hello.html

spring.mvc.static-path-pattern: 맵핑 설정 변경 가능

spring.mvc.static-locations: 리소스 찾을 위치 변경 가능

- Last-Modified 헤더를 보고 304 응답을 보냄.
- ResourceHttpRequestHandler가 처리함.

WebMvcConfigurer의 addRersourceHandlers로 커스터마이징 할 수 있음

```java
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
   registry.addResourceHandler("/m/**")
           .addResourceLocations("classpath:/m/")
           .setCachePeriod(20);
}
```