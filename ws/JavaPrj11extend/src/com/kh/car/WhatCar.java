package com.kh.car;

public class WhatCar extends Car{

	public WhatCar(String color, int speed, int price) {
		super(color, speed, price);
	}
	
	public void SayWhat() {
		System.out.println("��");
	}
	
	@Override
	public void startCar() {
		System.out.println("���� �õ� �ɾ���");
	}
	
	@Override
	public void stop() {
		System.out.println("���� �극��ũ");
	}
	
	@Override
	public void go() {
		System.out.println("���� �Ǽ�");
	}

}
