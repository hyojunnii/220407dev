package com.kh.car;

public class RedCar extends Car {
	
	//super : �θ�Ŭ���� �����ڸ� ȣ��
	public RedCar(String color, int speed, int price) {
		super(color, speed, price);
		// super(color,speed); �� ����
	}

//		this(); //����
	
	//ȫ�� �����޼ҵ�
	public void sayRed() {
		System.out.println("ȫȫȫ");
	}
	
	
	//�������̵� == �θ� Ŭ������ �޼ҵ带 �������ϴ� ��
	//@Override == ������̼� : ������� �˷��ְ�, ��ǻ�Ϳ��� �����Ǵ� �ش޶��
	@Override
	public void startCar() {
		System.out.println("ȫ�� �õ� �ɾ���");
	}
	
	@Override
	public void stop() {
		System.out.println("ȫ�� �극��ũ");
	}
	
	@Override
	public void go() {
		System.out.println("ȫ�� �Ǽ�");
	}
}
