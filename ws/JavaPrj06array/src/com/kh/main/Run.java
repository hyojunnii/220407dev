package com.kh.main;

public class Run {

	public static void main(String[] args) {

		// �迭
		/*
		 * 1. �迭 ���� ���� 		//int[] a;
		 * 2. �迭 ���� 			// new int[3];
		 * 3. �迭�� �� ��ҿ� ���� //a[0];
		 */
		
		// ���� : Ÿ��[] ������; Ÿ�� ������[];
		// ������ ���� a
//		int[] a;
		
		// ���� : ���� = new Ÿ��[�ε�������];
		int[] a = new int[5];
		
		// �ʱ�ȭ : ����, �Ҵ� ���ÿ� �ϴ� ��
//		int[] a = {10,20,30,40,50};
//		int[] a = new int[] {10,20,30,40,50};		
		
		// element�� ����, �Ҵ�
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		// �迭 ���� üũ
		System.out.println(a.length);
		
		// ����
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
	}
}

