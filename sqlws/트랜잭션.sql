-- Ʈ�����
/*
    : �ɰ� �� ���� ���� ó���� �ּ� ����
    EX) ������ü : �� ������ ���� �ٸ� �������� �ű�� ��
    1. �� ���忡�� ���� ����
    2. ���� ���忡 ���� ����
*/

-- Ŀ��, �ѹ�
-- DDL�������� COMMIT �ڵ� ����

-- Ʈ����� �׽�Ʈ�� ���� �ӽ� ���̺� ���� //����(DROP)�Ұ���
CREATE TABLE MY_TB(
      NAME CHAR(9)
    , AGE NUMBER
);

INSERT INTO MY_TB(NAME, AGE)
VALUES ('ABC', 20);
COMMIT; -- Ŀ���ؾ��� ���� DB�� �ݿ�

INSERT INTO MY_TB
VALUES ('ZZZ', 22);
ROLLBACK;

SELECT * FROM MY_TB;

DROP TABLE MY_TB;