package com.kh.main;

public class Charmander {
	
	//������
	public Charmander(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	//������
	private final String name = "���̸�";
	private int level;
	private char type; //L,W,F
	
	public int getLevel() { 
		return this.level;
	}
	
	public void setLevel(int level) { 
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

	public void speedAttack() {
		System.out.println(name + "������ȭ ~~!!");
	}
	
	public void fire() {
		System.out.println(name + "�Ҳɼ��� ~~!!");
	}
	
}
