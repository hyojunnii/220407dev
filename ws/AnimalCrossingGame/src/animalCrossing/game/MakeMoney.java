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
		System.out.println("����� �� ���� 1000���� �ȸ��� �ִ�.");
		System.out.println("������� ������ŭ ���ĺ� 'o'�� �Է��غ���! ��");
		
		while(true) {
		String apple = sc.nextLine();
			//// o �� �ν��� �𸣰���
			if(apple.contains("o")||apple.contains("O")) {
				
				System.out.println();
				System.out.println(apple.length() + "���� ����!");
				money = (apple.length() * 1000);
				System.out.println(money + "���� ������!");
				
				MakeMoneyTool.totalMoney = MakeMoneyTool.totalMoney + money;
				System.out.println("-------------------------------");
				System.out.println("���� �ܾ� : " + MakeMoneyTool.totalMoney + "��");
				
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
		
	public int radishStock() {
		System.out.println("���ֽ��� �غ���!");
		System.out.println();
		System.out.println("---------- ���� ��� ----------");
		System.out.println("���� 90-110���� ���ݿ� �� �� ������ �� ���� 50-600�� ���̷� �ȸ��� �ִ�.");
		System.out.println();
		
		//�������� �� ��� (90-110)
		int buyRadish = 0;
		
		System.out.println("----------- ����� ------------");
		while(true) {
			java.util.Random r = new java.util.Random();
			int randomInt = r.nextInt(90,110);
			System.out.println("���� ������ " + randomInt + "�� �Դϴ�. ��ðڽ��ϱ�? 1. �� 2. �ƴϿ� ��");
			
			int input = sc.nextInt();
			if (input == 1) {
				buyRadish = randomInt;
				break;
			} else if (input == 2) {
				continue;
			}
		}
		
		int numRadish = 0;
		
		while(true) {
			System.out.println("�� ���� ��ðڽ��ϱ�? ��");
			int num = sc.nextInt();
			System.out.println(num + "���� ���� " + buyRadish + "���� ��ϴ�.");
			int rTotal = num * buyRadish;
			System.out.println("�� " + rTotal + "���Դϴ�.");
			System.out.println();
			System.out.println("-------------------------------");
			System.out.println("���� �ܾ��� " + MakeMoneyTool.totalMoney + "�� �Դϴ�.");
			System.out.println("�����Ͻðڽ��ϱ�? 1. �� 2. �ƴϿ� ��");
			int yesNo = sc.nextInt();
			if (yesNo == 1) {
				if (MakeMoneyTool.totalMoney - rTotal < 0) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println();
					System.out.println("������ �ٽ� �Է��Ͻðڽ��ϱ�? 1. �� 2. �ƴϿ� ��");
					int input = sc.nextInt();
					if (input == 1) {
						continue;
					} else {
						return 0;
					}
				} else {
					MakeMoneyTool.totalMoney = MakeMoneyTool.totalMoney - rTotal;
					System.out.println("���� �ܾ� : " + MakeMoneyTool.totalMoney + "�� �Դϴ�.");
					numRadish = num;
					break;
				}
			} else if(yesNo == 2) {
				continue;
			}
		}
		System.out.println();
		System.out.println("----------- ���ȱ� ------------");
		
		//��ǻ�Ͱ� ���� ���� ���� (50-600)
		int sellRadish = 0;
		
		while(true) {
			java.util.Random r = new java.util.Random();
			int randomInt = r.nextInt(50,600);
			System.out.println("���� ������ " + randomInt + "�� �Դϴ�. �Ľðڽ��ϱ�? 1. �� 2. �ƴϿ� ��");
			
			int input = sc.nextInt();
			if (input == 1) {
				sellRadish = randomInt;
				break;
			} else if (input == 2) {
				continue;
			}
		}
		
		
		//�ȱ�
		while(true) {
			System.out.println("���� �� : " + numRadish + "��");
			System.out.println("���� ���� �� �Ľðڽ��ϱ�? 1. �� 2. �ƴϿ� ��");
			
			int yesNo = sc.nextInt();
			if (yesNo == 1) {
				System.out.println(numRadish + "���� ���� " + sellRadish + "���� �˴ϴ�.");
				int rEarn = numRadish * sellRadish;
				System.out.println("�� " + rEarn + "���� ������ϴ�.");
				System.out.println("-------------------------------");
				System.out.println();
				return rEarn;
			} else if(yesNo == 2) {
				return 0;
			}
		}
		
		
	}
}
