package person.main;

import person.obj.Person;

public class PersonMain {
	
	public static void main(String[] args) {

		System.out.println("PersonMain 클래스의 main 메소드 호출");
		System.out.println("====================================");
		
		//Person 클래스를 이용해서 객체 생성
		Person p1 = new Person();
		
		System.out.println("객체 확인 :: " + p1);
		
		p1.walk();
		p1.say();
		p1.eat();
		
		p1.name = "권효정";
		p1.age = 25;
		p1.height = 170;
		p1.weight = 50;
		p1.birth = "08-21";
		p1.gender = 'F';
		p1.location = "경기";
		p1.skin = "황";
				
		p1.introduce();
		
	}

}
