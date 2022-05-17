-- DDLF

-- ���̺� ����
-- Į���� ������ ���� ��, �ֵ���ǥ�� �����ָ� ��� ����
-- ���Ǿ Į�������� ����ϰ������, �ֵ���ǥ�� ó�� ����
CREATE TABLE KH_MEMBER(
      NAME VARCHAR2(10)
    , AGE NUMBER
);

-- ���̺� Į�� �߰� (DDL)
ALTER TABLE KH_MEMBER ADD EMAIL VARCHAR2(100);

SELECT * FROM KH_MEMBER;

-- ���̺� Į�� ����
ALTER TABLE KH_MEMBER DROP COLUMN EMAIL;

-- Į�� �����ϱ�
ALTER TABLE KH_MEMBER MODIFY NAME VARCHAR2(100);

-- ������ �־��
INSERT INTO KH_MEMBER
VALUES ('�ɿ���', 20);
COMMIT;

-- ���̺� �����ϱ�
DROP TABLE KH_MEMBER;
