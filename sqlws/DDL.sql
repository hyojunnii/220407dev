-- DDL (���̺� ����)

-- ���̺� ����
/*
    CREATE TABLE ���̺��(
         Į���� Į��Ÿ��
        ,Į���� Į��Ÿ��
    };
*/
CREATE TABLE MEMBER(
      NO          NUMBER
    , ID          VARCHAR2(30)
    , PWD         VARCHAR2(100)
    , PHONE       CHAR(13)
    , ENROLL_DATE TIMESTAMP
);

-- ������ ��ȸ
SELECT * FROM MEMBER;

-- ������ �ֱ�
INSERT ALL
INTO MEMBER
VALUES(1,'SWY','1234','010-1234-5678',SYSDATE)
INTO MEMBER
VALUES(2, 'SWY2','1234','010-1234-5678',SYSDATE)
SELECT * FROM DUAL;

-- ������ ����
UPDATE MEMBER
  SET PWD = '4321'
  WHERE ID = 'SWY';

-- ������ ����
DELETE FROM MEMBER;