package com.kh.main;

public class Run {

	public static void main(String[] args) {

		// ��� - ���ǹ�, �ݺ���

		// �ݺ��� (for, while, do-while) continue, break

		// while : ���ǽ��� true�ϵ��� ����
		int cnt = 0;
		while (cnt < 10) {
			System.out.println("hi");
			cnt = cnt + 1;
		}

		// for
		for (int i = 0; i < 10; i++) {
			System.out.println("hello");
		}

		// do - while : �� ���� ������ ����
		int x = 3;
		do {
			System.out.println("hihello");
			x++;
		} while (x < 3);

	}

}
