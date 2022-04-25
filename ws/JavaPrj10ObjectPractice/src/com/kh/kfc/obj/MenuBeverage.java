package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuBeverage {

	Scanner sc = new Scanner(System.in);

	// 햄버거 메뉴 보여주기

	public void showMenuBeverage() {
		System.out.println("========= 음료 =========");
		System.out.println("1. 콜라 (1000원)");
		System.out.println("2. 쉐이크 (4000원)");
		System.out.println("3. 맥주 (3000원)");

		int menu = Integer.parseInt(sc.nextLine());

		switch (menu) {
		case 1:
			Main.total += 1000;
			Main.menuAll += "콜라 ";
			System.out.println("콜라를 선택하셨습니다.");
			break;
		case 2:
			Main.total += 4000;
			Main.menuAll += "쉐이크 ";
			System.out.println("쉐이크를 선택하셨습니다.");
			break;
		case 3:
			Main.total += 3000;
			Main.menuAll += "맥주 ";
			System.out.println("맥주를 선택하셨습니다.");
			break;
		default:
			System.out.println("그런 음료 없음");
		}
	}
}
