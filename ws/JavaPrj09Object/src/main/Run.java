package main;

import java.util.Scanner;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {

		// class와 object의 차이
		
//		Scanner sc = new Scanner(System.in); // scanner라는 클래스 파일을 이용해서 객체 만들겠다(new)
//		sc.nextInt();
		
		/*
		 * <객체지향>
		 * @ 카운터 직원 -> 클래스 CLASS
		 *	데이터 DATA(VARIABLE)
		 * - 닉네임
		 * - 시급 : 9천원
		 *	기능 METHOD
		 * - 주문받는 기능
		 * - 계산 기능
		 * ==== 철수 -> 인스턴스 INSTANCE,OBJECT (Heap 영역에 할당)
		 */
		
		// 멤버변수 : 클래스 내부 선언 heap 객체안 == 전역변수
		// 지역변수 : 메소드 안에서 선언 stack
		// 클래스변수 : static 키워드
		
		System.out.println("Run 클래스의 main 메소드 호출");
		System.out.println("=============================");
	
		// 객체 생성 (MyClass01 클래스 파일 이용해서 객체)
		MyClass01 mc = new MyClass01();
			// type이 MyClass01
		// 객체 메소드 호출 (MyClass01 클래스 파일의 myMethod01 호출)
		mc.name = "심원용";
		mc.age = 20;
		mc.introduce();

//		mc.myMethod01();
//		mc.myMethod02();
	}

}
