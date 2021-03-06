package person.main;

import person.obj.Person;

public class PersonArrayMain {

	public static void main(String[] args) {

		// 객체 배열

		/*
		 * 구조체 > C언어, 여러개 데이터 관리 
		 * 클래스 > 구조체 단점보완, 여러개 데이터 + 메소드 
		 * 객체배열 : 여러개 객체 관리 (같은타입)
		 */

		System.out.println("PersonArrayMain 클래스의 main 메소드 호출");
		System.out.println("=========================================");

		// 객체 배열
		Person[] pArr = new Person[5];

		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		}

//		pArr[0] = new Person();
//		pArr[1] = new Person();
//		pArr[2] = new Person();
//		pArr[3] = new Person();
//		pArr[4] = new Person();

		pArr[0].name = "피원";
		pArr[1].name = "피투";
		pArr[2].name = "피삼";
		pArr[3].name = "피넷";
		pArr[4].name = "피오";

		pArr[0].introduce();
		pArr[1].introduce();
		pArr[2].introduce();
		pArr[3].introduce();
		pArr[4].introduce();

		// 배열 없이
//		Person p1 = new Person();
//		Person p2 = new Person();

//		p1.name = "피원";
//		p2.name = "피투";

//		p1.introduce();
//		p2.introduce();

	}

}
