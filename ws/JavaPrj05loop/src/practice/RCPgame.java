package practice;

import java.util.Scanner;

public class RCPgame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("##���������� ����##");

		int cnt = 0;
		
//		boolean isUserWin = false;
//		while(!isUserwin) {}
		
		while (true) {
			int num = (int) ((Math.random() * 3) + 1);

			System.out.println();
			System.out.println("1.���� 2.���� 3.��");

			int input = sc.nextInt();
			cnt++;

			String com;
			String user;

			if (num == 1) {
				com = "����";
			} else if (num == 2) {
				com = "����";
			} else {
				com = "��";
			}
			if (input == 1) {
				user = "����";
			} else if (input == 2) {
				user = "����";
			} else {
				user = "��";
			}

			if (input > 3) {
				System.out.println("�ٽ� �Է��ϼ���.");
				cnt = 0;

			} else {
				System.out.println("��ǻ�� : " + com);
				System.out.println("����� : " + user);

				if (input == num) {
					System.out.println("-�����ϴ�-");

				} else if (input == 1) {
					if (num == 3) {
						System.out.println("-����� ��-");
						System.out.println();
						System.out.println(cnt + "�� ���� �¸��ϼ̽��ϴ�.");
						System.out.println("�ٽ��Ͻðڽ��ϱ�? 1.��");
						int yn = sc.nextInt();
						if (yn == 1) {
							cnt = 0;
							continue;
						} else {
							break;
						}
					} else {
						System.out.println("-��ǻ�� ��-");
					}

				} else if (input == 2) {
					if (num == 1) {
						System.out.println("-����� ��-");
						System.out.println();
						System.out.println(cnt + "�� ���� �¸��ϼ̽��ϴ�.");
						System.out.println("�ٽ��Ͻðڽ��ϱ�? 1.��");
						int yn = sc.nextInt();
						if (yn == 1) {
							cnt = 0;
							continue;
						} else {
							break;
						}
					} else {
						System.out.println("-��ǻ�� ��-");
					}

				} else if (input == 3) {
					if (num == 2) {
						System.out.println("-����� ��-");
						System.out.println();
						System.out.println(cnt + "�� ���� �¸��ϼ̽��ϴ�.");
						System.out.println("�ٽ��Ͻðڽ��ϱ�? 1.��");
						int yn = sc.nextInt();
						if (yn == 1) {
							cnt = 0;
							continue;
						} else {
							break;
						}
					} else {
						System.out.println("-��ǻ�� ��-");
					}
				}
				
				
			}
		}

	}
}
