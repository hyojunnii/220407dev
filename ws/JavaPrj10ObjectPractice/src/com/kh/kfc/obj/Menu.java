package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	// �޴��� �����ֱ�
	
	public int showMenu() {
		System.out.println("========= MENU =========");
		System.out.println("1. �ܹ���");
		System.out.println("2. ����");
		System.out.println("3. ���̵�");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1: return 1; // �θ� ������ ���ư�
		case 2: return 2; 
		case 3: return 3;
		default : System.out.println("error !!! �޴� ���� �� ���� �߻�"); return -1;
		}
		
	}
	
	// �ֹ� �� ��������
	public void more() {
		System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�? (Y/N)");
		String answer = sc.nextLine();
		Main.finish = answer.equals("Y") || answer.equals("y") ? false : true;

	}
	
}