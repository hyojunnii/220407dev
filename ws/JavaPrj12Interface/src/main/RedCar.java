package main;

// interface ����� implements
// Ŭ����, �������̽� ������ ����� extends
public class RedCar implements Car {

	// �������̽��� ��ӹ޴� ���, ������ ��� �޼ҵ带 �������̵� �ؾ���
	// �������̽��� �޼ҵ� �������̵��� ����ȭ �ϱ� ���ؼ� �����
	
	@Override
	public String startCar() {
		return "ȫ�� �õ� �ɾ���";
	}

	@Override
	public void go() {
		System.out.println("ȫ��, ������ ��");
	}

	@Override
	public int stop() {
		return 100;
	}
	
	
}
