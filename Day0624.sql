SELECT * FROM tab;

SELECT  * FROM  STUDENT;

SELECT *  --  name, dept_name
FROM DEPARTMENT, STUDENT
WHERE department.DEPT_ID = student.DEPT_ID ;

SELECT DISTINCT address
FROM STUDENT;
COMMIT;

SELECT
	name,
	YEAR_EMP,
	2012-year_emp
FROM
	professor;

SELECT
	student.NAME,
	student.STU_ID ,
	department.DEPT_NAME
FROM
	STUDENT ,
	DEPARTMENT
WHERE
	student.DEPT_ID = department.DEPT_ID;
	
SELECT
	student.STU_ID
FROM
	STUDENT,
	DEPARTMENT
WHERE
	student.dept_id = department.dept_id
	-- WHERE s.DEPT_ID = d.DEPT_ID
	--쿼리 내에서 쓰는 별칭을 하나 지정하겠다.
	--. 앞에 테이블 명은 소문자로 써야한다.
	
	AND student.year = 3
	AND department.dept_name = '컴퓨터공학과';

SELECT
	name,
	stu_id
FROM
	STUDENT
WHERE
	"YEAR" = 3
	OR "YEAR" = 4
ORDER BY
	STU_ID;
	
SELECT *
FROM STUDENT s 
WHERE "YEAR" =3 OR "YEAR" =5
ORDER BY STU_ID;

SELECT
	name,
	stu_id
FROM
	STUDENT s
WHERE
	"YEAR" = 3
	OR "YEAR" = 4
ORDER BY
	NAME DESC, --DESC 내림차순
	STU_ID;
	


SELECT NAME 
FROM STUDENT s 
WHERE ADDRESS ='서울'

SELECT
	s2.name
FROM
	STUDENT s1,
	STUDENT s2
WHERE
	s1.ADDRESS = s2.ADDRESS
	AND s1.NAME = '김광식' ;
	
SELECT
	name 이름,
	POSITION 직위,
	2022-YEAR_emp 재직연수
FROM
	PROFESSOR;
	
SELECT *
FROM STUDENT s 
WHERE name like '_현%';

SELECT *
FROM STUDENT s 
WHERE RESIDENT_ID LIKE '8%'
or RESIDENT_ID LIKE '90%'
ORDER BY  RESIDENT_ID;

SELECT name, ADDRESS  FROM STUDENT s 
UNION --합집합
SELECT NAME FROM PROFESSOR p;

SELECT STU_ID 
FROM STUDENT s ,DEPARTMENT d
WHERE s.DEPT_ID =d.DEPT_ID
 UNION 
SELECT STU_ID 
FROM TAKES
WHERE grade='A+';


SELECT stu_id FROM STUDENT s ,DEPARTMENT d 
WHERE s.DEPT_ID =d.DEPT_ID AND dept_name='산업공학과'
MINUS 
SELECT STU_ID FROM TAKES t 
WHERE Grade='A+';

select title, credit, year, semester
from course, class
where course.course_id = class.course_id


SELECT *FROM COURSE c;

SELECT Title, credit, YEAR, semester
FROM COURSE c LEFT OUTER JOIN CLASS c2 
USING (COURSE_id);

SELECT title, credit,YEAR,semester
FROM COURSE, CLASS
WHERE course.course_id=class.COURSE_ID(+);

SELECT  title, credit, YEAR, semester
FROM COURSE, CLASS
WHERE course.COURSE_ID(+) =class.course_id;

SELECT title,credit,YEAR,semester
FROM COURSE c FULL OUTER JOIN CLASS c2
USING (COURSE_id);

SELECT COUNT(*)
FROM STUDENT s 
WHERE "YEAR" =3;

SELECT count(COMM)
FROM emp;


SELECT count(dept_id)
FROM STUDENT s 

SELECT*FROM STUDENT s 

SELECT count(distinct dept_id)
FROM STUDENT s 

SELECT count(*)
FROM STUDENT s, DEPARTMENT d 
WHERE s.DEPT_ID =d.DEPT_ID AND d.DEPT_NAME ='컴퓨터공학과';

SELECT NAME, d.dept_name  --위에가 원하는 결과물이다.
FROM STUDENT s , DEPARTMENT d --테이블
WHERE s.DEPT_ID =d.DEPT_ID; -- 조건식

SELECT sum(2022- YEAR_emp)
FROM PROFESSOR p ;

SELECT *FROM  PROFESSOR p ;

SELECT * FROM DEPT d ;
SELECT * FROM emp;

SELECT sum(sal)
FROM emp;

select 	sum(sal)
from 	emp
where 	job = 'ANALYST';

SELECT *FROM emp;



SELECT sum(sal) FROM emp WHERE job='CLERK'
SELECT sum(sal) FROM emp WHERE job='SALESMAN'
SELECT sum(sal) FROM emp WHERE job='MANAGER'
SELECT sum(sal) FROM emp WHERE job='ANALYST'
SELECT sum(sal) FROM emp WHERE job='PRESIDNET';




	
SELECT * FROM EMP e ;


SELECT  AVG(2022-YEAR_EMP) 평균재직연수
FROM PROFESSOR p 

select 	max(sal), min(sal), avg(sal)
from	emp e, dept d
where 	e.deptno = d.deptno and dname = 'ACCOUNTING';

SELECT dept_id, count(*)
FROM STUDENT s 
GROUP BY DEPT_ID;

SELECT *FROM STUDENT s;

SELECT dname, count(*), avg(sal),max(sal),min(sal)
from 	emp e, dept d
where 	e.deptno = d.deptno
group by 	dname;

SELECT dept_name, count(*), avg(2012-year_emp), max(2012 - year_emp)
FROM PROFESSOR p , DEPARTMENT d 
WHERE p.DEPT_ID =d.DEPT_ID 
GROUP BY dept_name
ORDER BY dept_name;

SELECT dept_name, count(*), avg(2012-year_emp), max(2012-year_emp)
FROM PROFESSOR p, DEPARTMENT d 
WHERE p.DEPT_ID =d.DEPT_ID 
GROUP BY dept_name
HAVING avg(2012- YEAR_EMP)>=10;

SELECT dname, count(*), AVG(sal), max(sal),min(sal)
FROM emp e, dept d
WHERE e.DEPTNO =d.DEPTNO 
GROUP BY dname
--HAVING COUNT(*)>=5; D

SELECT stu_id
FROM TAKES t 
WHERE GRADE IS NULL;

SELECT stu_id, GRADE 
FROM TAKES t 
WHERE grade != 'A+';

SELECT *FROM TAKES t ;

SELECT STU_ID, GRADE
FROM TAKES t 
MINUS
SELECT stu_id, GRADE 
FROM TAKES t 
WHERE GRADE ='A+';

SELECT title
FROM COURSE c 
WHERE COURSE_ID IN 
(SELECT DISTINCT COURSE_ID
FROM CLASS
WHERE classroom='301호');

SELECT *FROM COURSE c 

SELECT DISTINCT title --DISTINCT 중복 제거
FROM COURSE c1, CLASS c2
WHERE c1.COURSE_ID =c2.COURSE_ID
AND classroom='301호';

SELECT title
FROM COURSE c 
WHERE COURSE_ID NOT IN 
(SELECT DISTINCT COURSE_ID --DISTINCT 중복제거
FROM CLASS c
WHERE YEAR = 2012 AND semester=2);


--뷰 생성
CREATE OR replace VIEW v_takes as
SELECT stu_id,class_id
FROM TAKES t;

SELECT *
FROM v_takes;

CREATE OR REPLACE VIEW cs_student AS
SELECT s.stu_id, s.resident_id,s.name,s.YEAR,s.address,s.dept_id
FROM student s,department d
WHERE s.DEPT_ID =d.DEPT_ID AND
d.DEPT_NAME = '컴퓨터공학과';

SELECT * FROM cs_student;

SELECT *
FROM CS_STUDENT 
WHERE address='서울';

INSERT INTO V_TAKES
values('1292502','C101-01')

DROP VIEW V_TAKES;

CREATE OR REPLACE VIEW v_takes as
SELECT stu_id, class_id
FROM TAKES t 
WITH READ ONLY

INSERT INTO v_takes VALUSE ('1292502','C101-01');