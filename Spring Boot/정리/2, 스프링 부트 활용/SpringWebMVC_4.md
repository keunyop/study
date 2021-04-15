# 스프링 웹 MVC 4부: 정적 리소스 지원

정적 리소스 지원 기능은 클라이언트로부터 요청이 올 경우 이미 만들어져 있는 리소스를 보내주는 기능이다.

기본적으로 아래 위치의 리소스들은 <code>/**</code> 요청에 매핑되어 제공된다.

- classpath:/static

- classpath:/public

- classpath:/resources/

- classpath:/META-INF/resources

  > 예) “/hello.html” => /static/hello.html

Application.yml에서 경로를 변경할 수 있다.

> - spring.mvc.static-path-pattern: 맵핑 설정 변경 가능
> - spring.mvc.static-locations: 리소스 찾을 위치 변경 가능

- Last-Modified 헤더를 보고 304 응답을 보냄.

WebMvcConfigurer의 addRersourceHandlers로 커스터마이징 할 수 있음

```java
@Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
   registry.addResourceHandler("/m/**")
           .addResourceLocations("classpath:/m/")
           .setCachePeriod(20);
}
```
