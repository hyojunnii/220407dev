package animalCrossing.game;

import java.util.Scanner;

public class MakeMoneyTool {

	public void moneyTool() {
		
		Scanner sc = new Scanner(System.in);
		
		MakeMoney makeMoney = new MakeMoney();
		
		//�� ����
		System.out.println("-------------------------------");
		System.out.println("���� �����!");
		System.out.println("1. �����ȱ� 2. ���ֽ��ϱ�(�̱���) ��");
		
		//do
		int c = sc.nextInt();
		if(c == 1) {
			makeMoney.sellFruit();
		} else if (c == 2) {
			makeMoney.radishStock();
		} else {
			System.out.println("�ٽ� �Է�����!");
		}
		
	}
	
}