-- �Լ� (���ڿ�)

--SUBSTR(���ڿ�, ������ġ, (����))
SELECT SUBSTR('ABCDEFGHIJK', 3, 5) 
FROM DUAL;

SELECT * 
FROM EMP
WHERE ENAME LIKE '%' || SUBSTR('ABCDEFG',5,1) || '%'; -- = %E%

--CONCAT : ���ڿ� ��ġ��
SELECT CONCAT('ABC','�ɿ���') CONCAT
FROM DUAL;

--TRIM : ���� ���� / TRIM, LTRIM, RTRIM
SELECT TRIM('   ABC   ') TRIM
FROM DUAL;

--LOWER : �ҹ��ڷ�
--UPPER : �빮�ڷ�
SELECT LOWER('ABC') 
FROM DUAL;

--REPLACE : ��ü
SELECT REPLACE('ABC','B','X')
FROM DUAL;

--PAD : ���ϴ� ������ ��ŭ ��ĭ ä���� (���ϴ� ���ڷ�)
--LPAD, RPAD
SELECT RPAD('ABC',5,'0') AS PAD
FROM DUAL;

--INITCAP : ù���ڸ� �빮�ڷ� �ٲ���
SELECT INITCAP('abc') 
FROM DUAL;

--INSTR : Ư�� ���ڿ��� ���°�� �����ϴ��� Ȯ�� (���ڿ�, ã�����ڿ�, ���°���� �˻�, N��° ������)
SELECT INSTR('ABCDEFGKH12345KH12345','KH', 5, 2) 
FROM DUAL;

--LENGTH : ���ڿ� ����
SELECT LENGTH('ABC') FROM DUAL;
