package main;

public class Main {

	public static void main(String[] args) {

		//Thread
		/*
		 * ������� 3����
		 * 1.extends Thread
		 * 2.implements Runnable
		 * 3.lambda
		 * 
		 * ���۹�� : start()
		 * ���� : run()�� ����
		 * run()�� ���� class/interface�� ��� �޾ƾ� ��밡��
		 */
		
		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		
		System.out.println("===== ������ =====");
		
		// extends Thread : ��ü Ȱ���Ͽ� ������ ����
		Thread t1 = new MyThread();
		t1.start();
		
		// implements Runnable : ��ü Ȱ���Ͽ� ������ ���� - ���߻�� ������ ���� ����
		Thread t2 = new Thread(new MyRunner());
		t2.start();
		
		// ���ٽ� Ȱ���Ͽ� ������ ���� - implements ��ü ���� ������ �ʰ� ��밡��
		Thread t3 = new Thread(
							() -> {
								System.out.print(Thread.currentThread().getName() + " : ");
								System.out.println("���ٽ�");
							});
		t3.start();
	}

}//class
