package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		// 1403 �θ� ���� �ι� ����ϱ�

		Scanner sc = new Scanner(System.in);

		// n�ޱ�
		int n = sc.nextInt();

		// �迭 �����
		int arr[] = new int[n];

		// n�� �Է¹ޱ�
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// �迭 �� �� ���
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i < n; i++) {
				System.out.println(arr[i]);
			}
		}

	}

}
