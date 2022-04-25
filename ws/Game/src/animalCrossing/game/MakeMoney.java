package animalCrossing.game;

import java.util.Scanner;

public class MakeMoney {

	ResidentInfo userInfo = new ResidentInfo();
		
	Scanner sc = new Scanner(System.in);
	
	public int money;
	
	public void sellFruit() {
		System.out.println("과일을 따서 팔아보자!");
		System.out.println();
		System.out.println("---------- 게임 방법 ----------");
		System.out.println("사과는 한 개에 2000원에 팔리고 있다.");
		System.out.println("따고싶은 갯수만큼 알파벳 'o'를 입력해보자! ▼");
		
		while(true) {
		String apple = sc.nextLine();
			//// o 만 인식은 모르겠음
			if(apple.contains("o")||apple.contains("O")) {
				
				System.out.println();
				System.out.println(apple.length() + "개를 땄다!");
				this.money = (apple.length() * 2000);
				System.out.println(this.money + "원을 벌었다!");
				
				//// 전체 누적 하는법 ㅜㅜㅜㅜㅜ Main가면 리셋됨
				int totalMoney = userInfo.getTotalMoney();
				totalMoney += this.money;
				System.out.println("-------------------------------");
				System.out.println("현재 잔액 : " + totalMoney + "원");
				userInfo.setTotalMoney(totalMoney);
				
				System.out.println();
				System.out.println("더 따시겠습니까? 1. 예 2. 아니오 ▼");
				int re = sc.nextInt();
				System.out.println();
				if(re != 1) {break;}
				// int타입이라 문자 입력시 오류
				
			} else {
				System.out.println("알파벳 'o'를 입력하자! ▼");
				continue;
			}
		}
		
	}
		
	public void radishStock() {
		System.out.println("무주식을 해보자!");
	}
}
