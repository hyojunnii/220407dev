package com.kh.overload.main;

import com.kh.overload.test.Test;

public class Main {

	public static void main(String[] args) {
		
		// ������ ȣ��� ��ü ����, ���� ��ü�� ������ �Ҵ�
		
		Test t = new Test();
		System.out.println();
		Test ts = new Test("���ڿ�");
		
		System.out.println("t.name :: " + t.name);
		
//		t.hi();
//		t.hi("ȿ��");
		
	}

}