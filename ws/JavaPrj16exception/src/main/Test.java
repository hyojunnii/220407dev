package main;

public class Test {

						//���� ������
	public void test() throws Exception {
		
		//���� ���� �߻���Ű��
		
		//���� ó��
//		try {
//			throw new Exception(); //Exception ��ü�� ����
//		} catch(Exception e) {
//			System.out.println("���� ����");
//		}
		
		//ThrowableŸ���� ��ü(����)�� ���� �� ����
		throw new Exception();
		
	}
	
	public void methodA() throws Exception {
		System.out.println("�޼ҵ� A ȣ��");
		try {
			methodB();
		} catch (Exception e) {
			throw new MyException();
		}
//		int x = 10;
//		if(x > 0) {
//			throw new MyException;
//		}
//		try {
//			methodB();
//		} catch(Exception e) {
//			throw new MyException();
//		}
		System.out.println("�޼ҵ� A ����");
	}
	
	public void methodB() throws Exception {
		System.out.println("�޼ҵ� B ȣ��");
		methodC();
		System.out.println("�޼ҵ� B ����");
	}
	
	public void methodC() throws Exception {
		System.out.println("�޼ҵ� C ȣ��");
//		throw new Exception(); //���� �߻���Ŵ
		int x = 1 / 0;
		System.out.println("�޼ҵ� C ����");
	}
	
}//class
