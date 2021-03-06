package com.kh.main;

public class Pikachu {
	
	//생성자 만들었기 때문에 기본 생성자X
	// 생성자1
	public Pikachu(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	// 생성자2
//	public Pikachu(int num, char ch, String msg) { // method overloading
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	//데이터
	private final String name = "피카츄";
	private int level;
	private char type; //L,W,F
	
	public int getLevel() { // private 레벨 값 가져오기 : getter
		return this.level;
	}
	
	public void setLevel(int level) { // private에 값 넣기 : setter
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	//동작
	public void bodyAttack() {
		System.out.println(name + "몸통박치기 !!!");
	}

	public void millionVolt() {
		System.out.println(name + "백만볼트 ~~!!");
	}
	
	public void thunderVolt() {
		System.out.println(name + "썬더볼트 ~~!!");
	}
	
	
}