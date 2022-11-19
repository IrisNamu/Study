


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

😊2차 과제물 API문서 다운 <br>


   </div>
</details>
---
<details>
   <summary>  3차 과제 </summary>
     <div  markdown="3">
     ### 
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
