package com.kh.math;

public class MathTest {

	public void test() {
		//abs : ���밪
		int num = -10;
		int result = Math.abs(num);
		System.out.println(result);
	}
	
	public void test2() {
		//ceil : �ø�
		double d = 1.23;
		double result = Math.ceil(d);
		System.out.println(result);
		
		//floor : ����
		double result2 = Math.floor(d);
		System.out.println(result2);
		
		//round : �ݿø�
		double result3 = Math.round(d);
		System.out.println(result3);
	}
	
	public void test3() {
		//random : 0�̻� ~ 1�̸� ������ double
		double r = Math.random();
		System.out.println(r);
	}
	
}//class
