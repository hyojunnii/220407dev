package practice;

import java.util.Scanner;

public class UpdownGame {

	public static void main(String[] args) {

		// ���ٿ����

		Scanner sc = new Scanner(System.in);

		// ��ǻ�Ͱ� 1~50�߿� ���� �ϳ� �����ϰ� �ϱ�
		int x = (int) (Math.random() * 50) + 1;
				// casting ����ȯ : Ÿ�� ����
				// Math.random() : 0~10������ ���� ��ȯ

		// Ƚ�� ���� ����
		int cnt = 0; 

		while (true) {
			// ��ǻ������ ���� �����
			int num = sc.nextInt();
			// Ƚ�� ����
			cnt++;
			
			// ��ǻ�Ͱ� �亯�ϱ�
			if (num < x) {
				System.out.println("up");
			} else if (num > x) {
				System.out.println("down");
			} else {
				System.out.println("correct");
				System.out.println(cnt + "�� �õ��߽��ϴ�.");
				break;
			}
		}
	}
}
