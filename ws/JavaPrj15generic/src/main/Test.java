package main;

import java.util.*;

public class Test {

	/*
	 * ���׸� : Ÿ������
	 * ���� : List<String> = new ArrayList<>();
	 * List<String> = new AttayList<String>();
	 */
	
	public void test() {
		
		List<Integer> al = new ArrayList<Integer>();
//		al.add("asd"); - ���׸������� �ȵ�
		al.add(10);
		al.add(20);
		al.add(30);
		
		//����Ʈ�� �ִ� ��� ������ ���Ѱ�
		//�ڵ����� intŸ������ ��ȯ�ؼ� ����
//		int x1 = al.get(0);
//		int x2 = al.get(1);
//		int x3 = al.get(2);
//		
//		int result = x1 + x2 + x3;
		
		int result = 0;
//		for(int i = 0;i < al.size(); i++) 
		
		//enhanced for��, ���� for�� (�÷���, �迭 ��� ��밡��)
		for(int elem : al)
		{
//			int temp = al.get(i);
			int temp = elem;
			result += temp;
		}
		System.out.println(result);
		
	}
	
	
}//class
