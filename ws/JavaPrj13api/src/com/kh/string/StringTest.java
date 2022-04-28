package com.kh.string;

public class StringTest {

	public void test() {
		//charAt : ���ڿ����� Ư���ε����� ���ڸ� ������
		String s = "abcdefg";
		
		char ch = s.charAt(0);
		System.out.println("ch : " + ch);
	}

	public void test2() {
		//compareTo : ������ ����, ���̸� ���� ������ 0 �ڸ� ���
		String s = "a";
		String s2 = "b";
		
		int x = s.compareTo(s2);
		System.out.println(x);
	}
	
	public void test3() {
		//concat : ���ڿ� ������
		String s = "abc";
		String s2 = "zzz";
		
		String x = s.concat(s2);
		System.out.println(x);
	}
	
	public void test4() {
		//equals : ���ڿ� ������ ��
		String s = "abc";
		String s2 = "zzz";
		System.out.println(s.equals(s2));
	}
	
	public void test5() {
		//equalsIgnoreCase : ��ҹ��� �����ϰ� ������ ��
		String s = "abc";
		String s2 = "ABC";
		System.out.println(s.equalsIgnoreCase(s2));
	}
	
	public void test6() {
		//length : ���ڿ��� ���̸� ���������� ����
		String s = "ab c";
		System.out.println(s.length());
	}
	
	public void test7() {
		//replace : Ư�� ���ڸ� ���ϴ� ���ڷ� �ٲ���
		String s = "abc123";
		String x = s.replace('c', 'S');
		System.out.println(s); //���� ���ڿ� �״��
		System.out.println(x);
	}
	
	public void test8() {
		//substring : ���ڿ��� Ư�� ������ �߶�
		String s = "abc12345";
//		String x = s.substring(5); //�����ε��� ~ ��
		String x = s.substring(2, 5); //�����ε��� ~ Ư������ 2 <= x < 5
		System.out.println(x);
	}

	public void test9() {
		//toUpperCase
		String s = "abc123";
		String x = s.toUpperCase();
		System.out.println(x);
		String low = test10(x);
		System.out.println(low);
	}
	
	public String test10(String str) {
		//toLowerCase
		return str.toLowerCase();
	}
		
}//class
