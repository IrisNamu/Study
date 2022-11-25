


# 코멘트 직무부트캠프
### IT 대기업 현업 개발자와 함께 하는 SW개발 실무(백엔드)

#
#
---
## 

<details>
   <summary>  1차 과제 </summary>
   <div  markdown="1">
   
 ###   1. JDK 11 설치 
###
![jdk11](https://user-images.githubusercontent.com/106574819/200833829-a37727d3-c6fe-4e06-8696-e02af6560cc9.png)
###  
###  
###  
### 2. Eclipse, Spring 다운로드 및 설치
###  
![eclips_version](https://user-images.githubusercontent.com/106574819/200843507-a9960e24-741c-4f9a-9928-37c495b3c710.png)
###  
###  
###   
### 3. 톰캣 설정
###
![Tomcat](https://user-images.githubusercontent.com/106574819/200843497-04cc5334-e25e-45b3-a97f-24494568567a.png)
###  
###  


### 5. Hello World 출력
###
![HelloWorld](https://user-images.githubusercontent.com/106574819/200981008-5d8e18c7-9a0a-4507-a151-1961b2e1b7c6.png)

- pom.xml 설정
```
	<properties>
		<java-version>11</java-version>
		<org.springframework-version>5.3.23</org.springframework-version>
		<org.aspectj-version>1.6.10</org.aspectj-version>
		<org.slf4j-version>1.6.6</org.slf4j-version>
	</properties>
```
- maven-compiler 수정
```
      <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.7.0</version>
                <configuration>
                    <source>11</source>
                    <target>11</target>
                    <compilerArgument>-Xlint:all</compilerArgument>
                    <showWarnings>true</showWarnings>
                    <showDeprecation>true</showDeprecation>
                </configuration>
            </plugin>

```


~~**[오류발생] Cannot access defaults field of Properties**~~(해결) 
`maven-war-plugin`플러그인을 추가
```
<plugin>
  <groupId>org.apache.maven.plugins</groupId>
  <artifactId>maven-war-plugin</artifactId>
  <version>3.3.2</version>
</plugin>
```


### 5. mariaDB 설치 ,  DBever 및 샘플 DB 구축
- mariaDB 설치
![MariaDB](https://user-images.githubusercontent.com/106574819/201068081-a50d157c-913e-4724-abc6-385dcbc73f8e.png)

- DBever 로 movie 테이블 생성
		- databases 우클릭 -> create New Databade
		![createTable](https://user-images.githubusercontent.com/106574819/201070267-9986f148-9e01-4605-8818-2dc47d105b4f.png)
		
- 샘플 데이터 Insert하기
~~**[오류발생] SQL Error [1046] [3D000]: No database selected**~~ (해결)
--Theater 데이터베이스 우클릭 -> set as defult 클릭해서 권한 주기
![DB](https://user-images.githubusercontent.com/106574819/201070053-b863497b-4f3c-4ef2-ab17-f6343ab2b4d0.png)






### 6. 스프링, Mariadb, MyBatis 연동, 데이터 조회

![output](https://user-images.githubusercontent.com/106574819/201309898-38e0dd72-c64c-4e2a-91fe-4b1cc52b765a.png)




</div>
</details>

  


---
<details>
   <summary>  2차 과제 </summary>
     <div  markdown="2">
 <h1>기술가이드, API 문서 등 업무를 위해 소통하는 법 이해하기</h1>

😊2차 과제물 API문서 다운 <br>
[SW 활용 현황 API 명세서.pdf](https://github.com/IrisNamu/Study/files/10046334/SW.API.pdf)



     # API 문서 작성해보기

 - API 인터페이스 가이드의 내용에는 통신 방법, 데이터 포맷, 입력 파라미터, 출력 정보 등이 포함되어 있어 개발의 기초가 개념들을 정립하는데 크게 도움이 됩니다. 
-   API 요청을 간단히 설명하면, **프론트 영역에서 서버에 작업을 요청하는 행위**를 말하며, 크게 데이터를 조회/수정/삭제/추가 등이 있을 수 있고, 기능에 따라 서버 내부에는 더 복잡한 로직이 숨어 있을 수 있습니다.
-   API 호출 시, 제대로 성공했다는 메시지와 결과를 리턴해주는게 일반적인 패턴이며, 프론트 개발자는 이러한 API 결과를 프론트 개발에 적용하는 형태를 가집니다.
-   API 명세서는 백엔드 개발자와 프론트엔드 개발자 간의 소통방식이지만, 기획자도 참고하는 문서가 될 수 있을 만큼 함께 일하는 동료가 모두 참고하는 문서로 이용합니다.
- --
**꼭 들어가야 하는 내용들**

-   API Title - api 이름
-   URL - api 경로
-   Method - request 방식 (get | post | delete | put)
-   Data Params - post 요청시 body안에 넣어줄 값
-   URL Params (만약 있을 경우)
    -   Required - url params로 넘길 값
-   Success Response - 응답이 성공적으로 반환될 경우 반환되는 값과 코드
-   Error Response - 응답이 성공적이지 못할 경우 반환되는 값과 코드
-   Sample Call - 요청과 응답의 예시

---

**API**란,

-  서버 애플리케이션의 기능을 사용하기 위한 방법/수단

- 구현 방식을 알지 못해도 서비스가 서로 통신 가능

- 리소스에 대한 액세스 권한을 제공하고 보안과 제어를 유지할 수 있게 해주며 액세스 권한을 어떻게, 누구에게 제공할지 여부만 결정하면 됨

- URI는 서버 설계 도면 / API는 서버 사용 설명서

- URI는 서버 구성 요소를 나타냄 (URI와 API 둘 다 명확하고 직관적이여야 타인이 볼 때 헷갈리지 않음)

----------

2-2.  REST

**REST**란,

리소스 지향 아키텍쳐로 모든 것을 리소스, 명사로 표현

- 모든 형태의 명령이 명사형으로 정의가 가능한 것은 아니지만, 최대한 리소스 기반의 명사 형태로 정의를 하는게 REST형태의 디자인이 됨

----------

2-3.  REST API

웹(HTTP) 설계의 우수성에 비해 제대로 사용되어지지 못하는 모습에 안타까워하며 웹의 장점을 최대한 활용할 수 있는 아키텍처로써 REST를 발표

즉,  자원(URI는 정보의 자원을 표현) + 행위(자원에 대한 행위는 HTTP Method (GET, POST, PUT, DELETE 등) 으로 표현)

- 슬래시 구분자(/)는 계층 관계를 나타내는 데 사용

- URI 마지막 문자로 슬래시(/)를 포함하지 않음

- 하이픈(-)은 URI 가독성을 높이는데 사용

- 밑줄(_)은 URI에 사용하지 않음

- URI 경로에는 소문자가 적합

- 파일 확장자는 URI에 포함시키지 않음

- 자원을 표현하는 Collection과 Document

(Document는 단순히 문서 - 한 객체 / Collection은 문서들의 집합, 객체들의 집합)

Uniform Interface

URI로 지정한 리소스에 대한 조작을 통일되고 한정적인 인터페이스로 수행하는 아키텍처 스타일

Stateless

HTTP Session과 같은 컨텍스트 저장소에 상태 정보를 저장하지 않음 API 서버는 들어오는 요청 만을 들어오는 메시지로만 처리하면 되며, 세션과 같은 정보를 신경 쓸 필요 없음

Layered System

REST 서버는 다중 계층으로 구성될 수 있으며 보안, 로드 밸런싱, 암호화 계층을 추가해 구조상의 유연성을 둘 수 있고 PROXY, 게이트웨이 같은 네트워크 기반의 중간 매체를 사용할 수 있음

Self-descriptiveness

REST API 메시지만 보고도 API를 쉽게 이해 할 수 있음

Client-Server

REST 서버는 API를 제공하고, 제공된 API를 이용해서 비즈니스 로직 처리 및 저장을 책임짐.  
각각의 역할이 확실히 구분되기 때문에 클라이언트와 서버에서 개발해야 할 내용이 명확해지고 서로간 의존성이 줄어듦

Cacheable

HTTP라는 기존의 웹 표준을 그대로 사용하기 때문에 캐싱 기능 적용 가능

----------

3-1.  API 명세서

-  API 문서는 누가 봐도 이해할 수 명확하고 직관적이여야 한다

- 클라이언트에게 API 명세서를 제공해야함 문서 작성방법에는 다양한 방법(swagger, postman api)가 있지만 스프레드시트나 Github WIKI 추천

API 이름

- HTTP Method

- Content-Type

- Request Header/Body

- Response Body


   </div>
</details>
---
<details>
   <summary>  3차 과제 </summary>
     <div  markdown="3">
  
File > New > Project > Spring Boot > Spring Starter Project 를 클릭하여 프로젝트 생성


----------

**pring Boot 포트 변경스프링부트 웹서버 포트 변경**

-   스프링부트 Web의 기본포트는 [8080](https://zetawiki.com/w/index.php?title=8080&action=edit&redlink=1)임
-   다른 포트를 사용하려면 [application.properties](https://zetawiki.com/wiki/Application.properties) 를 수정

`server.port = 포트번호`


# **2 적용방법**

-   STS --- Package Explorer
-   프로젝트명 [boot] --- src/main/resources --- application.properties 더블클릭



→ 원하는 포트 번호 기입→ 특별히 기입한 것이 없다면 파일 내용은 비어 있음

**3) application.properties 수정 ( src/main/resources )**

```java
server.port = 8031
server.servlet.contextPath=/
 
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
 
devtools.livereload.enabled=true
 
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://127.0.0.1:3306/statistc
spring.datasource.username=root
spring.datasource.password=devfunpj

```

----------


*~~- 오류 발생(해결) Several ports (8005, 8081) required by Tomcat v9.0 Server at localhost are already in use. The server may already be running in another process, or a system process may be using the port. To start this server you will need to stop the other process or change the port number(s).~~*

# . Dynamic Web Module 옵션 체크 확인

**검색을 해보면 대부분 이 방법을 소개하고 있습니다.**

1.  프로젝트 선택 후 마우스 오른쪽 클릭
2.  Properties 선택
3.  Project Facets 선택
4.  Dynamic Web Module 옵션과 java 옵션을 체크한 후 apply 버튼 클릭

----------

프로젝트 실행하고 확인해보기

-   port는 application.properties에 등록되어 있습니다.
-   즉 url은 **localhost:8031/test** 가 url이 됩니다.
---


---

```java
.   ____          _            __ _ _
 /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\
( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\
 \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.2.RELEASE)

2022-11-24 16:18:24.785  INFO 22776 --- [  restartedMain] c.e.demo.SettingWebBootApplication       : Starting SettingWebBootApplication on DESKTOP-I9PE8RB with PID 22776 (C:\\Users\\jin99\\Desktop\\Git_Study\\Study\\Comento_SW\\settingWeb_boot\\target\\classes started by jin in C:\\Users\\jin99\\Desktop\\Git_Study\\Study\\Comento_SW\\settingWeb_boot)
2022-11-24 16:18:24.789  INFO 22776 --- [  restartedMain] c.e.demo.SettingWebBootApplication       : No active profile set, falling back to default profiles: default
2022-11-24 16:18:24.857  INFO 22776 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2022-11-24 16:18:24.857  INFO 22776 --- [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2022-11-24 16:18:25.582  WARN 22776 --- [  restartedMain] o.m.s.mapper.ClassPathMapperScanner      : No MyBatis mapper was found in '[com.example.demo]' package. Please check your configuration.
2022-11-24 16:18:26.158  INFO 22776 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8031 (http)
2022-11-24 16:18:26.169  INFO 22776 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2022-11-24 16:18:26.169  INFO 22776 --- [  restartedMain] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.29]
2022-11-24 16:18:26.420  INFO 22776 --- [  restartedMain] org.apache.jasper.servlet.TldScanner     : At least one JAR was scanned for TLDs yet contained no TLDs. Enable debug logging for this logger for a complete list of JARs that were scanned but no TLDs were found in them. Skipping unneeded JARs during scanning can improve startup time and JSP compilation time.
2022-11-24 16:18:26.433  INFO 22776 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2022-11-24 16:18:26.433  INFO 22776 --- [  restartedMain] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1576 ms
2022-11-24 16:18:26.628  INFO 22776 --- [  restartedMain] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2022-11-24 16:18:26.973  INFO 22776 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2022-11-24 16:18:27.059  INFO 22776 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8031 (http) with context path ''
2022-11-24 16:18:27.063  INFO 22776 --- [  restartedMain] c.e.demo.SettingWebBootApplication       : Started SettingWebBootApplication in 2.672 seconds (JVM running for 3.17)
2022-11-24 16:18:41.505  INFO 22776 --- [nio-8031-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2022-11-24 16:18:41.505  INFO 22776 --- [nio-8031-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2022-11-24 16:18:41.513  INFO 22776 --- [nio-8031-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 8 ms

```

프로제트 서버를 실행 한 후

localhost:8080 으로 접속을 해보면

Whitelabel Error Page 에러가 발생하는 경우가 있는데

전체 에러 메시지는 아래와 같다

# Whitelabel Error Page (미해결)




**시도 방법 1. localhost:8080 으로 연결 시 기본값인 index.html이 없다**

![https://blog.kakaocdn.net/dn/dK8bRu/btrgYKVBswM/bdBUotWKa1Z1bOakA5xf6k/img.png](https://blog.kakaocdn.net/dn/dK8bRu/btrgYKVBswM/bdBUotWKa1Z1bOakA5xf6k/img.png)

스프링 구동 시 처음에는 무조건

index.html 을 찾게 설정이 되어있기 때문에

index.html을 만들어두지 않으면 이런 에러가 난다

-> 그러나 계속 나옴

**시도 방법 2**
Description Resource Path Location Type Java compiler level does not match the version of the installed Java project facet. settingWeb_boot Unknown Faceted Project Problem (Java Version Mismatch)

-> properties > Project Facets > Java 를 자신이 사용하고있는 컴파일러 버전과 맞주어주어야 한다.

그래도 되지 않음.

---
실패
   </div>
</details>
---
<details>
   <summary>  4차 과제 </summary>
     <div  markdown="4">
     
   </div>
</details>
---



```

```
