package main;

public class Main {
											
	public static void main(String[] args) {

		System.out.println("===== ���� ó�� =====");
		
		//���� : �ʹ� ũ��Ƽ�� ���� ���� ����
		
		/*
		 * <����>
		 * ������ ��Ÿ�� �ý���
		 * 
		 * <ó��>
		 * 1. try-catch : ó��
		 * 2. throw : ������ �̷�, ������ ����
		 */
		
		// ���� �޾Ƽ� ó��
		Test t = new Test();
		try {
			t.methodA();
		} catch (Exception e) {
//			e.printStackTrace(); //���� �۾��� �����޼��� ���
			System.out.println("���� �޼ҵ忡�� Exception catch");
			if(e instanceof MyException) {
				System.out.println("��� ���� ���ܴ� MyException Ÿ��");
			}
		}
		//Main���� ���� �ٽ� ������ : ���α׷� ����
		
		
		// ���� ���� ���� ó��
//		try {
//			throw new MyException();
//		} catch (Exception e){
//			System.out.println("���� ���� ���� ����");
//		}
		
		
		// ���� ó��
//		System.out.println("�ȳ�");
//		
//		try {
//			String str = null;
//			String strSub = str.substring(2,5);
//			System.out.println(strSub);
//			int x = 1 / 0;
//		} catch(ArithmeticException e) {
//			System.out.println("AE ����");
//		} catch(Exception e) {
//			System.out.println("���� �����");
//		}
//		
////		catch(NullPointerException e) {
////			System.out.println("NPE �����");
////		}
//		
//		System.out.println("����");
		
	}//main

}
