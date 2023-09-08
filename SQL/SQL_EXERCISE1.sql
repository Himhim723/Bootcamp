CREATE TABLE REGIONS(
	REGION_ID INTEGER,
    REGION_NAME VARCHAR(25),
    PRIMARY KEY(REGION_ID)
);

CREATE TABLE COUNTRIES(
	COUNTRY_ID VARCHAR(2),
    COUNTRY_NAME VARCHAR(40),
    REGION_ID INTEGER,
    PRIMARY KEY(COUNTRY_ID),
    FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID)
);

CREATE TABLE LOCATIONS (
	LOCATION_ID INTEGER,
    STREET_ADDRESS VARCHAR(25),
    POSTAL_CODE VARCHAR(12),
    CITY VARCHAR(30),
    STATE_PROVINCE VARCHAR(12),
    COUNTRY_ID VARCHAR(2),
    PRIMARY KEY(LOCATION_ID),
    FOREIGN KEY(COUNTRY_ID) REFERENCES COUNTRIES (COUNTRY_ID)
);

CREATE TABLE DEPARTMENTS(
	DEPARTMENT_ID INTEGER,
    DEPARTMENT_NAME VARCHAR(30),
    MANAGER_ID INTEGER,
    LOCATION_ID INTEGER,
    PRIMARY KEY(DEPARTMENT_ID),
    FOREIGN KEY(LOCATION_ID) REFERENCES LOCATIONS(LOCATION_ID)
);


CREATE TABLE JOB_GRADES(
	GRADE_LEVEL VARCHAR(2),
    LOWEST_SAL INTEGER,
    HIGHEST_SAL INTEGER,
    PRIMARY KEY(GRADE_LEVEL)
);

CREATE TABLE JOBS (
	JOB_ID VARCHAR(10),
    JOB_TITLE VARCHAR(25),
    MIN_SALARY INTEGER,
    MAX_SALARY INTEGER,
    PRIMARY KEY(JOB_ID)
);


CREATE TABLE JOB_HISTORY (
	EMPLOYEE_ID INTEGER,
    START_DATE DATE,
    END_DATE DATE,
    JOB_ID VARCHAR(10),
    DEPARTMENT_ID INTEGER,
    PRIMARY KEY(EMPLOYEE_ID,START_DATE),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID)
);

CREATE TABLE EMPLOYEES(
	EMPLOYEE_ID INTEGER,
    FIRST_NAME VARCHAR(20),
    LAST_NAME VARCHAR(25),
    EMAIL VARCHAR(25),
    PHONE_NUMBER VARCHAR(20),
    HIRE_DATE DATE,
    JOB_ID VARCHAR(10),
    SALARY NUMERIC(9,2),
    COMMISSION_PCT NUMERIC(9,2),
    MANAGER_ID INTEGER,
    DEPARTMENT_ID INTEGER,
    PRIMARY KEY(EMPLOYEE_ID),
    FOREIGN KEY(EMPLOYEE_ID) REFERENCES JOB_HISTORY(EMPLOYEE_ID),
    FOREIGN KEY(JOB_ID) REFERENCES JOBS(JOB_ID),
    FOREIGN KEY(DEPARTMENT_ID) REFERENCES DEPARTMENTS(DEPARTMENT_ID)
);

INSERT INTO REGIONS(REGION_ID)
VALUES
(1),(2),(3);

INSERT INTO COUNTRIES 
VALUES
("DE","GERMANY",1),
("IT","ITALY",1),
("JP","JAPAN",3),
("US","UNITED STATE",2);

INSERT INTO LOCATIONS(LOCATION_ID,STREET_ADDRESS, POSTAL_CODE,CITY,COUNTRY_ID)
VALUES
(1000,"1297VIA COLA DI RIE",989,"ROMA","IT"),
(1100,"93091 CALLE DELLA TE",10934,"VENICE","IT");

INSERT INTO LOCATIONS
VALUES
(1200,"2017 SHINJUKU-KU",1689,"TOKYO","TOKYO","JP"),
(1400,"2014 JABBERWOCKY RD",26192,"SOUTHLAKE","TEXAS","US");

INSERT INTO DEPARTMENTS 
VALUES
(10,"ADMINISTRATION",200,1100),
(20,"MARKETING",201, 1200),
(30,"PRUCHASING",202,1400);

INSERT INTO EMPLOYEES
VALUES
(100,"STEVEN",'KING','SKING','515-1234567',"1987-06-17","ST_CLERK",24000.00,0.00,109,10),
(101,"NEENA","KOCHHAR","NKOCHHAR","515-1234568","1987-06-18","MK_REP",17000.00,0.00,103,20),
(102,"LEX","DE HAAN","LDEHAAN","515-1234569","1987-06-19","IT_PROG",17000.00,0.00,108,30),
(103,"ALEXANDER","HUNOLD","AHUNOLD","590-4234567","1987-06-20","MK_REP",9000.00,0.00,105,20);

INSERT INTO JOBS (JOB_ID)
VALUES("ST_CLERK"),("MK_REP"),("IT_PROG");

INSERT INTO JOB_HISTORY
VALUES
(102,"1993-01-13","1998-07-24","IT_PROG",20),
(101,"1989-09-21","1993-10-27","MK_REP",10),
(101,"1993-10-28","1997-03-15","MK_REP",30),
(100,"1996-02-17","1999-12-19","ST_CLERK",30),
(103,"1998-03-24","1999-12-31","MK_REP",20);

-- 3. 
SELECT L.LOCATION_ID,L.STREET_ADDRESS, L.CITY,L.STATE_PROVINCE,C.COUNTRY_NAME
FROM LOCATIONS L, COUNTRIES C
WHERE L.COUNTRY_ID = C.COUNTRY_ID;

-- 4
SELECT E.FIRST_NAME, E.LAST_NAME, E.DEPARTMENT_ID 
FROM EMPLOYEES E;

-- 5 
WITH COUNNAME AS (
	SELECT L.LOCATION_ID, C.COUNTRY_NAME
    FROM COUNTRIES C, LOCATIONS L
    WHERE C.COUNTRY_ID = L.COUNTRY_ID
), DEPARTMENTDETAIL AS(
	SELECT D.DEPARTMENT_ID, C.COUNTRY_NAME 
    FROM DEPARTMENTS D, COUNNAME C
    WHERE C.LOCATION_ID = D.LOCATION_ID
)

SELECT E.FIRST_NAME, E.LAST_NAME, E.JOB_ID, E.DEPARTMENT_ID
FROM EMPLOYEES E , DEPARTMENTDETAIL D
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID AND D.COUNTRY_NAME = "JAPAN";

-- 6 LN9 EMPLOYEE ID LASTNAME MANAGER ID MANAGER LAST NAME
INSERT INTO EMPLOYEES (EMPLOYEE_ID,FIRST_NAME, LAST_NAME, EMAIL)
VALUES 
(105,"I AM 105","105 LAST NAME","EE105@GMAIL.COM"),
(108,"I AM 108","108 LAST NAME","EE108@GMAIL.COM"),
(109,"I AM 109","109 LAST NAME","EE109@GMAIL.COM");

SELECT E.EMPLOYEE_ID,E.LAST_NAME, X.EMPLOYEE_ID, X.LAST_NAME
FROM EMPLOYEES E, EMPLOYEES X
WHERE E.MANAGER_ID = X.EMPLOYEE_ID;

-- 7 LN10 FIRST NAME LAST NAME HIRE DATE WHERE HIRE AFTER LEX DE HAAN
with SDAY AS (
	SELECT HIRE_DATE AS DAYSS FROM EMPLOYEES WHERE EMPLOYEE_ID = 102
)

SELECT FIRST_NAME, LAST_NAME, HIRE_DATE 
FROM EMPLOYEES 
WHERE HIRE_DATE BETWEEN (SELECT DAYSS FROM SDAY) + INTERVAL 1 DAY AND "2030-09-09";


-- 8 LN 11 DEPARTMENT NAME NUM OF EMPLOYEES
SELECT COUNT(1), D.DEPARTMENT_NAME
FROM EMPLOYEES E, DEPARTMENTS D
WHERE E.DEPARTMENT_ID = D.DEPARTMENT_ID
GROUP BY DEPARTMENT_NAME;



-- 9 LN12 EMPLOYEE ID JOB TITLE NUM OF DAYS BETWEEN ENDING DATE 
SELECT E.EMPLOYEE_ID, J.JOB_TITLE, DATEDIFF(START_DATE,END_DATE)
FROM EMPLOYEES E, JOBS J , JOB_HISTORY H
WHERE J.JOB_ID = H.JOB_ID AND J.JOB_ID = E.JOB_ID AND E.DEPARTMENT_ID = 30;
    
-- 10 LN13 ALL DEPARTMENT NAME, MANAGER NAME, CITY AND COUNTRY NAME
INSERT INTO JOB_HISTORY
VALUES
(200,"1993-01-13","1998-07-24","IT_PROG",20),
(201,"1993-01-13","1998-07-24","IT_PROG",20),
(202,"1993-01-13","1998-07-24","IT_PROG",20);

SELECT * FROM JOB_HISTORY;
INSERT INTO EMPLOYEES (EMPLOYEE_ID,FIRST_NAME, LAST_NAME, EMAIL)
VALUES 
(200,"I AM 200","200 LAST NAME","EE200@GMAIL.COM"),
(201,"I AM 201","201 LAST NAME","EE201@GMAIL.COM"),
(202,"I AM 202","202 LAST NAME","EE202@GMAIL.COM");

UPDATE EMPLOYEES
SET DEPARTMENT_ID = 30
WHERE EMPLOYEE_ID = 202;

SELECT D.DEPARTMENT_NAME, concat(E.FIRST_NAME," ",E.LAST_NAME) AS MANAGER_NAME ,L.CITY, C.COUNTRY_NAME
FROM DEPARTMENTS D, EMPLOYEES E, LOCATIONS L, COUNTRIES C
WHERE D.DEPARTMENT_ID = E.DEPARTMENT_ID 
AND D.LOCATION_ID = L.LOCATION_ID
AND L.COUNTRY_ID = C.COUNTRY_ID
AND D.MANAGER_ID = E.EMPLOYEE_ID;

-- 11 LB14 AVERAGE SALARY OF EACH DEPARTMENT
SELECT D.DEPARTMENT_NAME, AVG(SALARY), COUNT(1) AS NUM_OF_EMPLOYEE 
FROM DEPARTMENTS D INNER JOIN EMPLOYEES E ON E.DEPARTMENT_ID = D.DEPARTMENT_ID 
GROUP BY D.DEPARTMENT_ID;

SELECT * FROM EMPLOYEES;
