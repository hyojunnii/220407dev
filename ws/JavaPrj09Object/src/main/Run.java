package main;

import java.util.Scanner;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {

		// class�� object�� ����
		
//		Scanner sc = new Scanner(System.in); // scanner��� Ŭ���� ������ �̿��ؼ� ��ü ����ڴ�(new)
//		sc.nextInt();
		
		/*
		 * <��ü����>
		 * @ ī���� ���� -> Ŭ���� CLASS
		 *	������ DATA(VARIABLE)
		 * - �г���
		 * - �ñ� : 9õ��
		 *	��� METHOD
		 * - �ֹ��޴� ���
		 * - ��� ���
		 * ==== ö�� -> �ν��Ͻ� INSTANCE,OBJECT (Heap ������ �Ҵ�)
		 */
		
		// ������� : Ŭ���� ���� ���� heap ��ü�� == ��������
		// �������� : �޼ҵ� �ȿ��� ���� stack
		// Ŭ�������� : static Ű����
		
		System.out.println("Run Ŭ������ main �޼ҵ� ȣ��");
		System.out.println("=============================");
	
		// ��ü ���� (MyClass01 Ŭ���� ���� �̿��ؼ� ��ü)
		MyClass01 mc = new MyClass01();
			// type�� MyClass01
		// ��ü �޼ҵ� ȣ�� (MyClass01 Ŭ���� ������ myMethod01 ȣ��)
		mc.name = "�ɿ���";
		mc.age = 20;
		mc.introduce();

//		mc.myMethod01();
//		mc.myMethod02();
	}

}