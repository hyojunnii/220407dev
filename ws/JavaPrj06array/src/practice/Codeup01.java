package practice;

import java.util.Scanner;

public class Codeup01 {

	public static void main(String[] args) {
		
		//1093 ���ں� �Է� Ƚ�� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		// �迭�����
		int[] cnt = new int[23];

		// Ƚ�� �Է�
		int n = sc.nextInt();
		
		// Ƚ�� ����
		for(int i = 0;i < n;i++) {
			// �θ� ���� �Է¹ް�
			int x = sc.nextInt();
			// �迭ĭ�� 1 ���ϱ�
			// 0���� �����ϱ� ������ -1ĭ		
			cnt[x-1] += 1;
		}
		
		// �迭 ���
		for (int i = 0;i < 23; i++) {
			System.out.println(cnt[i]);
		
		}
		
		
	}

}
