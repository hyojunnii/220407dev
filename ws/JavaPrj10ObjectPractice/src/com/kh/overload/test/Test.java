package com.kh.overload.test;

public class Test {
	
	/*
	 * ������
	 * 
	 * [����������] Ŭ������(..) {��ü ���� ����,�����ϰ��� ����}
	 * 
	 * ��ü�� �����Ϸ��� �����ڸ� ȣ���ؾ��Ѵ�.
	 */
	
	//�⺻ ������
	public Test() {
		System.out.println("��ü������");
		this.name = "�ɿ���";
		hi();
		System.out.println("����");
	}
	
	//������ �����ε�
	public Test(String s) {
		System.out.println("�����ε��� ������ ȣ��");
		System.out.println(s);
		System.out.println("����");
	}
		
	//data
	public String name;
	
	// �����ε�
	public void hi() {
		System.out.println("hi");
	}
	
	public void hi(String str) {
		System.out.println("hi" + name);
	}
	
}
