package person.main;

import person.obj.Person;

public class PersonMain {
	
	public static void main(String[] args) {

		System.out.println("PersonMain Ŭ������ main �޼ҵ� ȣ��");
		System.out.println("====================================");
		
		//Person Ŭ������ �̿��ؼ� ��ü ����
		Person p1 = new Person();
		
		System.out.println("��ü Ȯ�� :: " + p1);
		
		p1.walk();
		p1.say();
		p1.eat();
		
		p1.name = "��ȿ��";
		p1.age = 25;
		p1.height = 170;
		p1.weight = 50;
		p1.birth = "08-21";
		p1.gender = 'F';
		p1.location = "���";
		p1.skin = "Ȳ";
				
		p1.introduce();
		
	}

}