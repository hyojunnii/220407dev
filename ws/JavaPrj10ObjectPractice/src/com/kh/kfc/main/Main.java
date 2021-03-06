package com.kh.kfc.main;

import com.kh.kfc.obj.Menu;
import com.kh.kfc.obj.MenuBeverage;
import com.kh.kfc.obj.MenuHamburger;
import com.kh.kfc.obj.MenuSide;

public class Main {

	public static int total; // 창고에 보관
	public static String menuAll = "";
	public static boolean finish;
	
	public static void main(String[] args) {
		
		// 생성자 : 객체 생성, 초기화
			// 생성자 만들기 : [접근제한자]클래스명(){실행내용}
			// 생성자 호출(객체 생성) : new 생성자 (heap메모리 안에 생성)
		
		System.out.println("KFC에 오신걸 환영합니다.");

		// 메뉴판 객체 생성
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
				System.out.println("다시 선택해주세요.");
			}
			
			menu.more();
			
		} while (!Main.finish);
		
		System.out.println();
		System.out.println("주문하신 메뉴는 " + Main.menuAll + "입니다.");
		System.out.println("총 가격은 " + Main.total + "원 입니다.");
	
	}

}
