package codeup;

import java.util.Scanner;

public class Codeup05 {

	public static void main(String[] args) {
		
		// 1218
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a == b && a == c) {
			System.out.println("���ﰢ��");
		} else if (a == b || a == c || b == c) {
			System.out.println("�̵�ﰢ��");
		} else if (a*a + b*b == c*c) {
			System.out.println("�����ﰢ��");
		} else if (a <= b && b <= c) {
			System.out.println("�ﰢ��");
		} else {
			System.out.println("�ﰢ���ƴ�");
		}
	}
}
