package com.kh.main;

public class Kkobuki {

	public Kkobuki(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	// ������
	private final String name = "���α�";
	private int level;
	private char type; // L,W,F
	
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
	
	// ����
	public void bodyAttack() {
		System.out.println(name + "�����ġ�� !!!");
	}

	public void waterCanon() {
		System.out.println(name + "������ ~~!!");
	}

	public void bubble() {
		System.out.println(name + "��ǰ���� ~~!!");
	}

}
