package animalCrossing.game;

import java.util.Scanner;

public class MakeMoneyTool {

	public static int totalMoney;
	
	public void moneyTool() {
		
		Scanner sc = new Scanner(System.in);
		
		MakeMoney makeMoney = new MakeMoney();
		
		//�� ����
		System.out.println("-------------------------------");
		System.out.println("���� �����!");
		System.out.println("1. �����ȱ� 2. ���ֽ��ϱ� ��");
		
		//do
		int c = sc.nextInt();
		if(c == 1) {
			makeMoney.sellFruit();
			System.out.println("���� �ܾ��� " + totalMoney + "�� �Դϴ�.");
			System.out.println("������ �׸��ξ����ϴ�.");
		} else if (c == 2) {
			totalMoney = totalMoney + makeMoney.radishStock();
			System.out.println("���� �ܾ��� " + totalMoney + "�� �Դϴ�.");
			System.out.println("������ �׸��ξ����ϴ�.");
		} else {
			System.out.println("�ٽ� �Է�����!");
		}
		
	}
	
}
