package main;

public interface Car {
	
	/*
	 * �������̽�
	 * 
	 * ��� �޼ҵ�� �߻�޼ҵ��̴�.
	 * ��� �޼ҵ�� public abstract�̴�.
	 * public abstract�� ������ �����ϴ�.
	 * �������̽��� ���� ����� �����ϱ� ������ ���
	 */
	
	// ��� �ڵ����� ���������� ������ �� �޼ҵ� (�߻�޼ҵ�)
	
	/*public abstract*/ String startCar();
	
	void go();
	
	int stop();
	
}
