package com.kh.main;

public class Run2 {

	public static void main(String[] args) {

		// ������ �迭
		// 2���� �迭
		int[][] a = new int[3][3];
		
		a[0][1] = 1; // 1�� 2��

		
		
		int[][] b = new int[3][]; // ������ �迭 ����, ��ĭ�� ������ ����(�ּҰ� ��)
		
		b[0] = new int[4];  // b[0] �ȿ� �迭
		
		b[0][0] = 10; // b[0] -> �迭�ּ�Ȯ���ϰ��̵� -> [0]��ĭ
		b[0][1] = 20; 
		b[0][2] = 30; 
		b[0][3] = 40; 

		System.out.println(a[0][0]);
		
	}

}
