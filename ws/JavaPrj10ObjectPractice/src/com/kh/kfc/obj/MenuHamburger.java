package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuHamburger {

	Scanner sc = new Scanner(System.in);

	// �ܹ��� �޴� �����ֱ�

	public void showMenuHam() {
		System.out.println("======== �ܹ��� ========");
		System.out.println("1. ġŲ���� (5000��)");
		System.out.println("2. Ÿ������ (8000��)");
		System.out.println("3. ¡�Ź��� (7000��)");

		int menu = Integer.parseInt(sc.nextLine());

		switch (menu) {
		case 1:
			Main.total += 5000;
			Main.menuAll += "ġŲ���� ";
			System.out.println("ġŲ ���Ÿ� �����ϼ̽��ϴ�.");
			break;
		case 2:
			Main.total += 8000;
			Main.menuAll += "Ÿ������ ";
			System.out.println("Ÿ�� ���Ÿ� �����ϼ̽��ϴ�.");
			break;
		case 3:
			Main.total += 7000;
			Main.menuAll += "¡�Ź��� ";
			System.out.println("¡�� ���Ÿ� �����ϼ̽��ϴ�.");
			break;
		default:
			System.out.println("�׷� �ܹ��� ����");
		}

		// x = x + 1
		// x += 1
	}
}