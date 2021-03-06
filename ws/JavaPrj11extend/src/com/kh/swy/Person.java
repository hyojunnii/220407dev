package com.kh.swy;

public class Person {
	
//클래스 다이어그램
	/*
	 * com.kh.swy.Person
	 * + NAME : String = "swy"
	 * - age : int
	 * + Person(age:int)
	 * + setter/getter()
	 * + walk() : void
	 */
	
	// 상수일때만 static
	public static final String NAME = "swy";
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return NAME;
	}
	
	public void walk() {}

}