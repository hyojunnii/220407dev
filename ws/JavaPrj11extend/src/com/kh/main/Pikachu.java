package com.kh.main;

public class Pikachu {
	
	//������ ������� ������ �⺻ ������X
	// ������1
	public Pikachu(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	// ������2
//	public Pikachu(int num, char ch, String msg) { // method overloading
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	//������
	private final String name = "��ī��";
	private int level;
	private char type; //L,W,F
	
	public int getLevel() { // private ���� �� �������� : getter
		return this.level;
	}
	
	public void setLevel(int level) { // private�� �� �ֱ� : setter
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	//����
	public void bodyAttack() {
		System.out.println(name + "�����ġ�� !!!");
	}

	public void millionVolt() {
		System.out.println(name + "�鸸��Ʈ ~~!!");
	}
	
	public void thunderVolt() {
		System.out.println(name + "�����Ʈ ~~!!");
	}
	
	
}