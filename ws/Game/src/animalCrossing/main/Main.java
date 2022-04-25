package animalCrossing.main;

import java.util.Scanner;

import animalCrossing.game.MakeMoney;
import animalCrossing.game.MakeMoneyTool;
import animalCrossing.game.ResidentInfo;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		/*
		 * �����ƿ� ������ ��
		 * 
		 * 1. �ֹδ�ǥ �̸� ���ϱ� 
		 * 
		 * 2. ����
		 * 3. �� ���� (��Ʈ - ���� - ���� - ������ - ��ž�� - ���Ͻ�)
		 *  
		 * ---�ݺ�---
		 * 4. �� ����
		 * - �����ȱ� : 1�� 2000��, ���ĺ� �Է�
		 * - ���ֽ� : ������ �̿�
		 * 5. ���� �����
		 * 6. ���Ͻ� �ϰ��ϸ� ��
		 */
		
		
		ResidentInfo userInfo = new ResidentInfo();
		MakeMoney makeMoney = new MakeMoney();
		MakeMoneyTool moneyTool = new MakeMoneyTool();
		
		System.out.println("====== �����ƿ� �����ǽ� ======");
		System.out.println();
		System.out.println("������ �ݰ�������! Hook.Int ���� �ʱ��̾߱���");
		System.out.println("�������� �÷��� �����ϰ� �� �� ȯ���ر���!!");
		
		//�̸� ����
		System.out.println("�׷� ���� ���� ��û���� �ۼ��غ��ڱ���! ���� �̸��� ���߱���? ��");
		userInfo.setPlayer(sc.nextLine());
		String user = userInfo.getPlayer();
		System.out.println("���� " + user + "(��)����! �ݰ�������!");
		
		System.out.println();
		System.out.println("-------------------------------");
		System.out.println("--------- ��Ʈ ��ġ�� ---------");
		System.out.println("-------------------------------");
		
		System.out.println("�׷� " + user + ", ��а��� �� ��Ʈ���� �ڰ� �ɰž�!");
		System.out.println("������ ���� �������� ���� ������� �ʾ�...");
		System.out.println(user + "(��)�� ������ �� �����ָ� �������� ū ���� ���� ���� �־��!");
		System.out.println();
		System.out.println("���� ���� ���ؼ��� �ڱ��� �ʿ���~ 50,000�� ���� ������ �����Ű�����-!");
		System.out.println("���� �츮 ������ Ư��ǰ�� ����� �Ⱦ� ���� �� �ְ�, Ư���� ��..�� �ִٰ��� ������!");
		System.out.println("�� ������ �Ǹ� ������ ������!");
		System.out.println();
		
		//�� ����
		do {
			moneyTool.moneyTool();
			System.out.println("-------------------------------");
			System.out.println("������ �׸��ξ����ϴ�.");
			System.out.println("1. �ٽ� ���� 2. �����ϱ�(�̱���) 3. �ܾ׺���(��) 4. �����ϱ�");
			int stop = sc.nextInt();
			
			if (stop == 1) {
				
				continue;
				
			} else if (stop == 2) {
				
				break;
				
			} else if (stop == 3) {
				
				int totalMoney = userInfo.getTotalMoney();
				System.out.println();
				System.out.println("�ܾ� : " + totalMoney + "��");
				
			} else {
				break;
			}
			
		} while(true);
		
	}
		
		
		
		
		
		
		
		
		
}

