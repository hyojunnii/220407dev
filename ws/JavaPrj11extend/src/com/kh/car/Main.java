package com.kh.car;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== ��� =====");

		// ������ polymorphism : �θ�Ŭ������ �ڽ�Ŭ���� �޾��ִ°�
		
		//Ex) Car Ÿ���� �������� �ڽ� Ÿ���� ��ü �ִ°�
		Car rc = new RedCar("����",100,3000);
		
		//���� ���ε�: ����Ǳ� �� (�θ�Ŭ����)
		//���� ���ε� : �ڽ�Ŭ���� (���� ��Ÿ��)
		
		rc.startCar();
//		System.out.println(rc.getColor());
//		System.out.println(rc.getSpeed());
//		System.out.println(rc.getPrice());
		
		
		Car rc2 = new GreenCar("���", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("����", 300, 9900);
		rc3.startCar();
		
		// ��ü �� (instanceof)
		// A instanceof B : A�� B Ÿ���� �´��� Ȯ���Ͽ� boolean Ÿ���� �����͸� ����
//		if(rc instanceof Car) {
//			System.out.println("����");
//		} else {
//			System.out.println("�ƴ�");
//		}
		
		// �߻�ȭ (abstract)
		
		
	}
	
	//1. ��� : �θ�Ŭ������ data, method �޾ƿ�
	//�θ� ��ü�� �����ؾ� �ڽİ�ü�� ������ �� ����
	//���� : extends
	//* ��� Ŭ������ ���� ���� �θ�� Object Ŭ�����̴�. *
	
	//2. �������̵�
	//���� : �θ�Ŭ������ �޼ҵ� ������ (�ٵ�κ� ������)
	//�ۼ��� : �������̵� �Ϸ��� �޼ҵ� �����ٰ� @Override��� ����
	
	//3. ������
	//�θ�Ŭ���� Ÿ������ �ڽ� Ŭ���� Ÿ���� ��ü�� ���� �� �ִ�.
	
	//4. ���ε�
	//�������ε�
	//�������ε�

	//5. super
	//super�� �θ� ����Ű�� Ű����
	//this�� �ڱ��ڽ�
	
	//6. getter/setter
	//private �ʵ� (�������� == �ν��Ͻ����� == ��ü���� == ������� == Ŭ��������)
	//���������ڰ� private�� �ֵ��� ������� ����ϱ� ���ؼ� ����� �޼ҵ�
	
	
}
