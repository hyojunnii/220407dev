package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class Menu {

	Scanner sc = new Scanner(System.in);
	
	// 메뉴판 보여주기
	
	public int showMenu() {
		System.out.println("========= MENU =========");
		System.out.println("1. 햄버거");
		System.out.println("2. 음료");
		System.out.println("3. 사이드");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1: return 1; // 부른 곳으로 돌아감
		case 2: return 2; 
		case 3: return 3;
		default : System.out.println("error !!! 메뉴 선택 중 에러 발생"); return -1;
		}
		
	}
	
	// 주문 더 받을건지
	public void more() {
		System.out.println("추가 주문을 하시겠습니까? (Y/N)");
		String answer = sc.nextLine();
		Main.finish = answer.equals("Y") || answer.equals("y") ? false : true;

	}
	
}
