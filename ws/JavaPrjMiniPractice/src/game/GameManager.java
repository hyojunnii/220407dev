package game;

import util.InputUtil;

public class GameManager {

	public void gameStart() {
		//��ȣ ���� �ϱ�
		System.out.println("1 : ���ٿ����");
		System.out.println("2 : ���ٿ����");
		System.out.println("3 : ���ٿ����");
		
		System.out.print("���� ��ȣ ���� : ");
		int gameNum = InputUtil.inputInt();

//		Scanner sc = new Scanner(System.in);
//		String gameNumStr = sc.nextLine();
//		int gameNum = Integer.parseInt(gameNumStr);
		
		switch(gameNum) {
		case 1: updownGameStart();
			break;
		case 2:
			break;
		case 3:
			break;
		default: // error
		}
	}
	
	private void updownGameStart() {
		System.out.println("1~100������ ���ڸ� �ϳ� ������");
		
		//�Է¹ޱ�
		//��ǻ�� ���� ���� ����
		
		//1. ���ٿ� ��, ��� ���
		//2. �Է¹ޱ�
		//���⶧���� ���ѹݺ�
		
		System.out.println("�̰���ϴ� ~~");
	}
	
	
}
