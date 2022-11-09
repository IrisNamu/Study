# 코멘트 직무부트캠프
### IT 대기업 현업 개발자와 함께 하는 SW개발 실무(백엔드)

#
#
# 목차
[ 1차 과제 (개발환경 셋팅)] (# 1차-과제)
[ 2.코딩을 잘하고 싶어요](#coding을-잘하고-싶어요)
---
## 1차 과제

1. JDK 11 설치 
![jdk11](https://user-images.githubusercontent.com/106574819/200833829-a37727d3-c6fe-4e06-8696-e02af6560cc9.png)

2. Eclipse, Spring 다운로드 및 설치
![eclips_version](https://user-images.githubusercontent.com/106574819/200843507-a9960e24-741c-4f9a-9928-37c495b3c710.png)

3. 톰캣 설정
![Tomcat](https://user-images.githubusercontent.com/106574819/200843497-04cc5334-e25e-45b3-a97f-24494568567a.png)
4. Hello World 출력

- pom.xml 설정
```
	<properties>
		<java-version>11</java-version>
		<org.springframework-version>5.3.23</org.springframework-version>
		<org.aspectj-version>1.6.10</org.aspectj-version>
		<org.slf4j-version>1.6.6</org.slf4j-version>
	</properties>
```

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
- maven-compiler 수정


5. mariaDB, mySql WorkBench 설치 및 샘플 DB 구축

6. 스프링, Mariadb, MyBatis 연동, 데이터 조회

---
## 2차 과제
---
## 3차 과제 
---
## 4차 과제 
