-- ROWNUM

-- ���̺��, Į���� (���̺�� ���� ����)
-- ���̺�� �ڿ� �ش� ���̺��� ��Ī ���� ����
SELECT E.EMPNO, E.ENAME
FROM EMP E
;

-- ROWNUM : �� ��ȣ�� �ٿ���
SELECT ROWNUM AS RNUM, E.*
FROM EMP E
WHERE ROWNUM >= 1
--WHERE ROWNUM >= 2 -- ����(���ڵ� �� �о��, RESULT SET 1������ �˻�)
;

