package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Test {
	
	Person p1 = new Person("�ɿ���", 20, 'M');
	Person p2 = new Person("������", 20, 'M');
	Person p3 = new Person("�ɻ��", 20, 'M');

	String s1 = "aaa";
	String s2 = "bbb";
	String s3 = "ccc";
	
	//List - �迭�� �ٸ��� ����� ������� ���� ����
	public void testList() {
		
		//ArrayList
//		ArrayList al = new ArrayList();
//		al.add(p1);
//		al.add(p2);
//		al.add(p3);
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//
//		System.out.println(al.get(0));
//		System.out.println(al.get(2));
//		System.out.println(al.get(5));
		
		//LinkedList
		LinkedList list = new LinkedList();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(5));
	}
	
	//Set : �ε���, �ߺ��� ����, ���Կ��� Ȯ�� ����
	public void testSet() {
		//HashSet
		HashSet hs = new HashSet();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
	}
	
	//Map : key:value ����
	public void testMap() {
		//HashMap
		HashMap map = new HashMap();
		
		map.put("first", p1);
		map.put("second", p2);
		map.put("third", p3);
		
		System.out.println(map.get("first"));
	}
	
	
	
	
	
	
}//class
