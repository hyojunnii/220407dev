package animalCrossing.game;

import java.util.Scanner;

public class MakeMoney {

	ResidentInfo userInfo = new ResidentInfo();
		
	Scanner sc = new Scanner(System.in);
	
	public int money;
	
	public void sellFruit() {
		System.out.println("������ ���� �Ⱦƺ���!");
		System.out.println();
		System.out.println("---------- ���� ��� ----------");
		System.out.println("����� �� ���� 2000���� �ȸ��� �ִ�.");
		System.out.println("�������� ������ŭ ���ĺ� 'o'�� �Է��غ���! ��");
		
		while(true) {
		String apple = sc.nextLine();
			//// o �� �ν��� �𸣰���
			if(apple.contains("o")||apple.contains("O")) {
				
				System.out.println();
				System.out.println(apple.length() + "���� ����!");
				this.money = (apple.length() * 2000);
				System.out.println(this.money + "���� ������!");
				
				//// ��ü ���� �ϴ¹� �̤̤̤̤� Main���� ���µ�
				int totalMoney = userInfo.getTotalMoney();
				totalMoney += this.money;
				System.out.println("-------------------------------");
				System.out.println("���� �ܾ� : " + totalMoney + "��");
				userInfo.setTotalMoney(totalMoney);
				
				System.out.println();
				System.out.println("�� ���ðڽ��ϱ�? 1. �� 2. �ƴϿ� ��");
				int re = sc.nextInt();
				System.out.println();
				if(re != 1) {break;}
				// intŸ���̶� ���� �Է½� ����
				
			} else {
				System.out.println("���ĺ� 'o'�� �Է�����! ��");
				continue;
			}
		}
		
	}
		
	public void radishStock() {
		System.out.println("���ֽ��� �غ���!");
	}
}