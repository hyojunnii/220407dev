-- DML
---------------------------------------------------------
-- SELECT : READ : ������ �б�
---------------------------------------------------------

SELECT * FROM EMP; -- EMP ���̺��� ��� Į�� ��ȸ
SELECT EMPNO, ENAME FROM EMP; -- EMP ���̺��� Ư�� Į�� ��ȸ
-- ��Ī ����ϱ�
SELECT EMPNO AS �����ȣ, ENAME AS ����̸� FROM EMP;
SELECT EMPNO �����ȣ, ENAME ����̸� FROM EMP;
SELECT EMPNO "��� ��ȣ", ENAME "��� �̸�" FROM EMP;

--SELECT * FROM DEPT;
--SELECT * FROM BONUS;
--SELECT * FROM SALGRADE;

---------------------------------------------------------
-- INSERT : CREATE : ������ ����(����)
---------------------------------------------------------
/*
 INSERT INTO
 ���̺��(Į��1, Į��2, ...)
 VALUES(��1, ��2, ...);
 
 - Į�� ���� �������
 - ��� Į�� �� �ʿ� ����(NULL)
 - ��� Į�� �� �� ���, ��������
*/
INSERT INTO 
EMP(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) 
VALUES(1234, 'SWY', 'SALESMAN', 7902, SYSDATE, 777, 100, 30);

INSERT INTO 
EMP(ENAME, EMPNO, JOB, HIREDATE, SAL, COMM, DEPTNO) 
VALUES('SWY', 8888, 'SALESMAN', SYSDATE, 777, 100, 30);

INSERT INTO 
EMP
VALUES(5555, 'SWY', 'SALESMAN', 7902, SYSDATE, 777, 100, 30);

---------------------------------------------------------
-- UPDATE : UPDATE : ������ ����
---------------------------------------------------------
/*
 UPDATE ���̺�� SET Į���� = �� 
 WHERE Į��1 ������ �񱳰�1 
 AND Į��2 ������ �񱳰�2
 OR Į��3 ������ �񱳰�3;
*/

INSERT INTO BONUS(ENAME, JOB, SAL, COMM)
VALUES('SWY', 'SALESMAN', 777, 100);

INSERT INTO BONUS(ENAME, JOB, SAL, COMM)
VALUES('SWY2', 'SALESMAN2', 777, 100);

SELECT * FROM BONUS;

UPDATE BONUS SET SAL = 111 WHERE ENAME = 'SWY';

UPDATE BONUS SET SAL = 111 WHERE COMM > 100;

---------------------------------------------------------
-- DELETE : DELETE : ������ ����
---------------------------------------------------------

SELECT * FROM BONUS;
SELECT * FROM EMP;

DELETE FROM BONUS -- ��� ROW ����
WHERE ENAME = 'SWY2';

DELETE FROM EMP
WHERE EMPNO = 1234
OR EMPNO = 8888
OR EMPNO = 5555;

