package practice;

public class MyClass01 {
	
	//��ü ����, �޼ҵ� ȣ��
	
	public String name; //�������� class���� Heap
	public int age;
	
	/*
	 * �������� vs �ʵ�(�ν��Ͻ�����==��������==Ŭ��������==�������)
	 * - ���� ���� �̸� ��� ����
	 * - �޼ҵ� �ȿ����� ���������� ���õȴ�
	 * - this.������ ���� ���ָ� �ʵ尡 ���õȴ�
	 */
	
	public void introduce() {
		String name = "�������� ����";
		name = "��������";
		this.name = "�޼ҵ� �ȿ��� ���� �̸�";
		//this : ���� ��ü ������ = public String name
		System.out.println("�ȳ� ���� MyClass01 Ÿ���̾�");
		System.out.println("�� �̸��� " + name);
		System.out.println("�� ���̴� " + age);
	}
	
	public void myMethod01() {
		System.out.println("MyClass01 �� myMethod01 ȣ��");
	}
	public void myMethod02() {
		System.out.println("MyClass01 �� myMethod02 ȣ��");
	}
	
	
}
