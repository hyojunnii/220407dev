package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuBeverage {

	Scanner sc = new Scanner(System.in);

	// �ܹ��� �޴� �����ֱ�

	public void showMenuBeverage() {
		System.out.println("========= ���� =========");
		System.out.println("1. �ݶ� (1000��)");
		System.out.println("2. ����ũ (4000��)");
		System.out.println("3. ���� (3000��)");

		int menu = Integer.parseInt(sc.nextLine());

		switch (menu) {
		case 1:
			Main.total += 1000;
			Main.menuAll += "�ݶ� ";
			System.out.println("�ݶ� �����ϼ̽��ϴ�.");
			break;
		case 2:
			Main.total += 4000;
			Main.menuAll += "����ũ ";
			System.out.println("����ũ�� �����ϼ̽��ϴ�.");
			break;
		case 3:
			Main.total += 3000;
			Main.menuAll += "���� ";
			System.out.println("���ָ� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�׷� ���� ����");
		}
	}
}