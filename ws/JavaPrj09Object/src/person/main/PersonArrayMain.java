package person.main;

import person.obj.Person;

public class PersonArrayMain {

	public static void main(String[] args) {

		// ��ü �迭

		/*
		 * ����ü > C���, ������ ������ ���� 
		 * Ŭ���� > ����ü ��������, ������ ������ + �޼ҵ� 
		 * ��ü�迭 : ������ ��ü ���� (����Ÿ��)
		 */

		System.out.println("PersonArrayMain Ŭ������ main �޼ҵ� ȣ��");
		System.out.println("=========================================");

		// ��ü �迭
		Person[] pArr = new Person[5];

		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
		}

//		pArr[0] = new Person();
//		pArr[1] = new Person();
//		pArr[2] = new Person();
//		pArr[3] = new Person();
//		pArr[4] = new Person();

		pArr[0].name = "�ǿ�";
		pArr[1].name = "����";
		pArr[2].name = "�ǻ�";
		pArr[3].name = "�ǳ�";
		pArr[4].name = "�ǿ�";

		pArr[0].introduce();
		pArr[1].introduce();
		pArr[2].introduce();
		pArr[3].introduce();
		pArr[4].introduce();

		// �迭 ����
//		Person p1 = new Person();
//		Person p2 = new Person();

//		p1.name = "�ǿ�";
//		p2.name = "����";

//		p1.introduce();
//		p2.introduce();

	}

}