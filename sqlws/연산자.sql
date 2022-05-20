-- DML (SELECT) ������

-- ������ ������ ���̺� ����
CREATE TABLE TEMP_TB(
      NAME VARCHAR2(100)
    , AGE NUMBER
);

-- ������ �ֱ�
INSERT INTO TEMP_TB VALUES ('AAA', 20);
INSERT INTO TEMP_TB VALUES ('BBB', 21);
INSERT INTO TEMP_TB VALUES ('CCC', 22);
COMMIT;

-- ��ȸ
SELECT * FROM TEMP_TB;

-- ���� ���ϱ� +
SELECT NAME �̸�, AGE+1 ���⳪�� FROM TEMP_TB;

SELECT NAME, AGE, 123 ��������Į�� FROM TEMP_TB;
SELECT NAME, AGE, 'ZZZ' FROM TEMP_TB;
SELECT NAME, AGE, 'ZZZ' AS "���� ���� Į��" FROM TEMP_TB;
SELECT NAME, AGE, 'ZZZ' AS ��������Į�� FROM TEMP_TB;
SELECT NAME, AGE, 'ZZZ' ��������Į�� FROM TEMP_TB;
SELECT NAME, AGE, AGE ��������Į�� FROM TEMP_TB;
SELECT NAME, AGE, AGE+3 ��������Į�� FROM TEMP_TB;

-- ���ڿ� ���ϱ� ||
SELECT NAME, AGE FROM TEMP_TB;
SELECT NAME, AGE, NAME ��������Į�� FROM TEMP_TB;
SELECT NAME, AGE, NAME+1 ��������Į�� FROM TEMP_TB; -- ����
SELECT NAME, AGE, 1+1 ��������Į�� FROM TEMP_TB;
SELECT NAME, AGE, 1+'1' ��������Į�� FROM TEMP_TB; -- ����+���� => ����
SELECT NAME, AGE, 1||'1' ��������Į�� FROM TEMP_TB; -- ����||���� => ����
SELECT NAME, AGE, 7 ��������Į�� FROM TEMP_TB; -- ���ڴ� ������ ����
SELECT NAME, AGE, '7' ��������Į�� FROM TEMP_TB; -- ���ڴ� ���� ����
SELECT NAME, AGE, NAME+'ZZZ' ��������Į�� FROM TEMP_TB; -- ����
SELECT NAME, AGE, NAME || 'ZZZ' ��������Į�� FROM TEMP_TB; -- ���ڿ� ���ϱ� ������
SELECT NAME, AGE, CONCAT(NAME,'ZZZ') ��������Į�� FROM TEMP_TB; -- CONCAT() �Լ����

SELECT NAME||'('||(AGE)||')' "�̸�(����)" FROM TEMP_TB;

SELECT SYSDATE FROM TEMP_TB;

-- DUAL : �׽�Ʈ ���̺� - ������ ����ϰ� �ϳ��� ����
SELECT 123 + 1 FROM DUAL;

-- ������
/*
    =               : ����
    !=, ^=, <>      : ���� �ʴ�
    >, <, >=, <=    : ��Һ�
    IS NULL         : NULL����
    IS NOT NULL     : NULL�� �ƴ���

    NOT             : ����������
    AND             : �׸��� (==&&)
    OR              : �Ǵ� (==||)
    BETWEEN A AND B : A�� B����
    IN, NOT IN      : ���ԵǴ���
    
    LIKE, NOT LIKE  : ���ڿ� ��
    %               : 0�� �̻��� ���ڿ�
    _               : �ѱ���
*/

SELECT * FROM TEMP_TB;

SELECT NAME, AGE FROM TEMP_TB; -- ��� �� ���

-- ���̰� 20�� ROW�� ���
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE AGE = 20;

-- ���̰� 20�� �ƴ� ROW�� ���
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE AGE != 20
--WHERE AGE ^= 20
--WHERE AGE <> 20
;

-- ���̰� 20 �ʰ��� ROW ���
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE AGE > 20
;

-- AGE�� NULL�� ������ �ֱ�
INSERT INTO TEMP_TB(NAME) VALUES('SWY');
--ROLLBACK;
SELECT * FROM TEMP_TB;
--COMMIT;

-- ���̰� NULL�� ROW
SELECT NAME, AGE 
FROM TEMP_TB 
--WHERE AGE IS NULL
WHERE AGE IS NOT NULL
;

-- AGE�� 19�ʰ� �̸鼭, 21������ ROW
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE AGE > 19
AND AGE <= 21
;

-- AGE�� 20���� �̰ų�, 22�̻��� ROW
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE AGE <= 20
OR AGE >= 22
;

-- AGE�� 21-22 ������ ROW
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE AGE 
BETWEEN 21 AND 22
;

-- NAME�� 'AAA' �Ǵ� 'BBB' �Ǵ� 'CCC'�� ROW
SELECT NAME, AGE 
FROM TEMP_TB 
WHERE NAME IN('AAA','BBB','CCC')
--WHERE NAME NOT IN('AAA','BBB','CCC')
;

-- NAME�� D�� �����ϴ� ROW
SELECT NAME, AGE
FROM TEMP_TB
--WHERE NAME LIKE 'S%'
--WHERE NAME LIKE 'A%C'
WHERE NAME NOT LIKE 'A%C'
;

-- NAME�� '��'���� �����ϴ� 3���� ROW
SELECT NAME, AGE 
FROM TEMP_TB
WHERE NAME LIKE '��__'
;

--������ �ֱ�
INSERT INTO TEMP_TB(NAME) VALUES ('ABC');
INSERT INTO TEMP_TB(NAME) VALUES ('SSS');
INSERT INTO TEMP_TB(NAME) VALUES ('QQQ');
INSERT INTO TEMP_TB(NAME) VALUES ('SIM');
INSERT INTO TEMP_TB(NAME) VALUES ('KIM');
INSERT INTO TEMP_TB(NAME) VALUES ('ȫ�浿');
INSERT INTO TEMP_TB(NAME) VALUES ('ȫ��ȯ');
INSERT INTO TEMP_TB(NAME) VALUES ('������');
INSERT INTO TEMP_TB(NAME) VALUES ('��ö��');
INSERT INTO TEMP_TB(NAME) VALUES ('����ѹ��ź��̿͵η��');
SELECT * FROM TEMP_TB;
--COMMIT;

-- ������ ���̺� ����
--DROP TABLE TEMP_TB;




