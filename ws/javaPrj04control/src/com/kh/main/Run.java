package com.kh.main;

public class Run {

	public static void main(String[] args) {

	// ��� - ���ǹ�, �ݺ���

	// ���ǹ� (if, switch)
		
		// if
		int num = 0;
		if (num > 0) {
			System.out.println("����Դϴ�.");
		} else if (num == 0) {
			System.out.println("Zero");
		} else {
			System.out.println("�����Դϴ�.");
		}
		
		// switch (switch, case, default, break)
		int x = 3;
		switch (x) { 
		case 1 : System.out.println("��"); break;
		case 2 : System.out.println("��"); break;
		case 3 : System.out.println("��"); break;
		default : System.out.println("������ ����");
		}

	}

}
