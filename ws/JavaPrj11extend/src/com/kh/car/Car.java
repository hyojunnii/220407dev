package com.kh.car;

// �߻� Ŭ���� (��üȭ ���� �ʴ�)
 //abstract Ű����, 0�� �̻��� �߻�޼ҵ�, ��üȭ �Ұ���

public abstract class Car {
	
	//������
	public Car(String color, int speed, int price) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	//data
	//�������� �ִ�ӵ� ����
	private String color = "�θ����";
	private int speed = -1;
	private int price = -1;
	
	//method
	//�õ��ɱ� �극��ũ �Ǽ�
	
	// �߻� �޼ҵ�
	 //�߻� �޼ҵ尡 ������ ������ �߻� Ŭ������ �Ǿ����
	 //abstract Ű����, �޼ҵ� �ٵ� ����
	 //�߻�޼ҵ�� �ٲ��� �� �ڽĿ� �޼ҵ� �ۼ����ҽ� ����
	 
	public abstract void startCar();
	
	public abstract void stop();
	
	public abstract void go();
	
	public String getColor() {
		System.out.println("Car Class getter called...");
		return this.color;
	}
	
	public int getSpeed() {
		System.out.println("Car Class getter called...");
		return this.speed;
	}
	
	public int getPrice() {
		System.out.println("Car Class getter called...");
		return this.price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed  = speed;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
