package list;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person("����",20));
		list.add(new Person("������",20));
		list.add(new Person("������",30));
		list.add(new Person("���¸�",20));
		list.add(new Person("������",30));
		
		for (Person x : list) {
			System.out.println(x);
		}
		
		
		List<String> li = new ArrayList<String>();
		li.add("����");
		li.add("������");
		li.add("������");
		li.add("���¸�");
		li.add("������");
		
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		System.out.println();
		
		System.out.println(li.get(2));
		System.out.println(li.get(li.size()-1));
		li.remove(li.size()-2);
		
	}

}
