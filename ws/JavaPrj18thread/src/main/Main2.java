package main;

public class Main2 {

	public static void main(String[] args) {

		String name1 = Thread.currentThread().getName();
		System.out.print(name1 + " : ");
		System.out.println("===== ������ =====");
		
		Thread t = new TestThread2();
		String name = t.getName();
		System.out.print(name + " : ");
		t.start();
		
		
//		test();
		
	}
	
	//static������ static�� ȣ���ؾ���
	//public void�� ��ü�� �־�� ����Ǳ� ���� (static�� �׻� ����)
	public static void test() {

		//�̽������� ���� : \
		
		System.out.println("\"�ȳ�!\""); //"�ȳ�!"
		System.out.println("��\n��"); //�ٹٲ�
		System.out.println("��\r��"); //�ٹٲ�
		System.out.println("��\t��"); //��		��
		System.out.println("\\");
		
		//printf : format����
		System.out.println("==== printf test ====");
		System.out.printf("%s", "abc"); //%s : string���
		System.out.println();
		System.out.printf("%d", 10);
		System.out.println();
		System.out.printf("%c", 'a');
	}

}//class
