package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		// 1095 �Էµ� ��ȣ �� ���� ���� ���� ã��
		
		Scanner sc = new Scanner(System.in);
		
		int[] memo = new int[24]; // 0-23
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			// �⼮��ȣ Ȯ��
			int x = sc.nextInt();
			// x�� ĭ�� ���� üũ
			memo[x] = 1;
		}
		
		// 1�� �����ִ� ùĭ ã��
		for(int i = 1; i <= 23; i++) {
			if(memo[i] == 1) {
				System.out.println(i);
				break;
			}
		}
		
//		int min = 24;
//		
//		for(int i = 0; i < n; i++) {
//			a[i] = sc.nextInt();
//			if (a[i] < min) {
//				min = a[i];
//			}
//		}
//		System.out.println(min);
		
	}

}
