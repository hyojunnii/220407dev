package com.kh.overload.main;

import com.kh.overload.test.Test;

public class Main {

	public static void main(String[] args) {
		
		// 생성자 호출로 객체 생성, 생성 객체를 변수에 할당
		
		Test t = new Test();
		System.out.println();
		Test ts = new Test("문자열");
		
		System.out.println("t.name :: " + t.name);
		
//		t.hi();
//		t.hi("효정");
		
	}

}
