-- ��������
-- ��ø ���ϴ� ��ŭ ����

SELECT T.*
FROM 
(
    SELECT 
        ROWNUM RN
        , ENAME �̸�
        , HIREDATE �Ի���
        , SAL �޿�
        , DEPTNO �μ���ȣ
    FROM EMP E
    WHERE SAL > 2000
) T
WHERE �μ���ȣ = 10
OR �μ���ȣ = 20
ORDER BY RN --ROWNUM ���İ���
;


SELECT ENAME �̸�, SAL ����, SAL*12 ����
FROM EMP
ORDER BY �̸�;


SELECT 
      ROWNUM RN
    , ENAME �̸�
    , HIREDATE �Ի���
    , SAL �޿�
    , DEPTNO �μ���ȣ
FROM EMP E
WHERE SAL > 2000
;