package rcp.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerRcp {

	public final String gameName = "����������";
	
	public void gameStart() {
		System.out.println(gameName + " ���ӽ���");
	
		int comNum = new Random().nextInt(3) + 1;
		String com = "";
		
		switch(comNum) {
		case 1 : com = "����"; break;
		case 2 : com = "����"; break;
		case 3 : com = "��"; break;
		default : System.out.println("error !!!");
		}

		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		
		System.out.println("com : " + com);
		System.out.println("user : " + user);
		
		// ���ڿ� �� = ���ڿ�.equals(���ڿ�)
		if (com.equals(user)) {
			System.out.println("���");
		} else if (com.equals("����")){
			if(user.equals("����")) {
				System.out.println("����� ��");
			} else {
				System.out.println("��ǻ�� ��");
			}
		} else if (com.equals("����")){
			if(user.equals("��")) {
				System.out.println("����� ��");
			} else {
				System.out.println("��ǻ�� ��");
			}
		} else {
			if(user.equals("����")) {
				System.out.println("����� ��");
			} else {
				System.out.println("��ǻ�� ��");
			}
		}
	}
	
}