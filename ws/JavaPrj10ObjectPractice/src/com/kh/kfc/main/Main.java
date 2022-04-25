package com.kh.kfc.main;

import com.kh.kfc.obj.Menu;
import com.kh.kfc.obj.MenuBeverage;
import com.kh.kfc.obj.MenuHamburger;
import com.kh.kfc.obj.MenuSide;

public class Main {

	public static int total; // â���� ����
	public static String menuAll = "";
	public static boolean finish;
	
	public static void main(String[] args) {
		
		// ������ : ��ü ����, �ʱ�ȭ
			// ������ ����� : [����������]Ŭ������(){���೻��}
			// ������ ȣ��(��ü ����) : new ������ (heap�޸� �ȿ� ����)
		
		System.out.println("KFC�� ���Ű� ȯ���մϴ�.");

		// �޴��� ��ü ����
		Menu menu = new Menu();
		MenuHamburger menuHam = new MenuHamburger(); 
		MenuBeverage menuBev = new MenuBeverage();
		MenuSide menuSide = new MenuSide(); 
		
		do {
			int menuNum = menu.showMenu();

			if (menuNum == 1) {
				menuHam.showMenuHam();
			} else if (menuNum == 2) {
				menuBev.showMenuBeverage();
			} else if (menuNum == 3) {
				menuSide.showMenuSide();
			} else {
				System.out.println("�ٽ� �������ּ���.");
			}
			
			menu.more();
			
		} while (!Main.finish);
		
		System.out.println();
		System.out.println("�ֹ��Ͻ� �޴��� " + Main.menuAll + "�Դϴ�.");
		System.out.println("�� ������ " + Main.total + "�� �Դϴ�.");
	
	}

}