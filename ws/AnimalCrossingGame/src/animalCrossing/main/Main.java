package animalCrossing.main;

import java.util.Scanner;

import animalCrossing.game.MakeMoney;
import animalCrossing.game.MakeMoneyTool;
import animalCrossing.game.ResidentInfo;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
					
		/*
		 * ������� ������ ��
		 * 
		 * 1. �ֹδ�ǥ �̸� ���ϱ� 
		 * 
		 * 2. ������
		 * - �����ȱ� : 1�� 1000��, ���ĺ� �Է�
		 * - ���ֽ� : ������ �̿� 		
		 * 
		 * 3. �ٽ��ϱ� / �ܾ�Ȯ�� / ����
		 * 	
		 */
		
		ResidentInfo userInfo = new ResidentInfo();
		MakeMoneyTool moneyTool = new MakeMoneyTool();
		
		
		System.out.println("====== ������� �����ǽ� ======");
		System.out.println();
		System.out.println("������ �ݰ�������! Hook.Int ���� �ʱ��̾߱���");
		System.out.println("���� �Ϸ� �Ա���!!");
		System.out.println("���� �̸��� ���߱���? ��");
		userInfo.setPlayer(sc.nextLine());
		String user = userInfo.getPlayer();
		System.out.println("���� " + user + "(��)����! �ݰ�������!");
		
		System.out.println();
		System.out.println("�׷� " + user + ", ���� ���� ����� �������ٰ�!");
		System.out.println("���� �츮 ������ Ư��ǰ�� ����� �Ⱦ� ���� �� �ְ�, Ư���� ��..�� �ִٰ� ������!");
		System.out.println();
		
		//�� ����
		do {
			moneyTool.moneyTool();
			System.out.println("������ �׸��ξ����ϴ�.");
			System.out.println("-------------------------------");
			System.out.println("1. �ٽ� ���� 2. �ܾ׺��� 3. �����ϱ�");
			int stop = sc.nextInt();
			
			if (stop == 1) {
				
				continue;
				
			} else if (stop == 2) {
				
				System.out.println("���� �ܾ��� " + moneyTool.totalMoney + "�� �Դϴ�.");
				
			} else {
				break;
			}
			
		} while(true);
		
	}
		
		
} //CLASS


