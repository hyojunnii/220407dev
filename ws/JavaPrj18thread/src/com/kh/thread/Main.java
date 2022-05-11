package com.kh.thread;

public class Main {
	
	public static final Factory factory = new Factory();

	public static void main(String[] args) {

		System.out.println("===== ������ �׽�Ʈ =====");
		
		/*
		 * start, run
		 * sleep : ���� �ð� wait
		 * wait : sleep�� ��� (����ȭ ���� ����)
		 * interrupt : �����ؼ� wait ������ �� ���� ������ ��
		 * notify || notiftAll : ��⿭ ����� ��� sleep,wait -> execute
		 * state : �������� ���� (����,����,���,����)
		 * join : �ٸ� ������ ��ٷ���
		 * yield : �ٸ� �����忡�� �ڿ� �� �� �ְ� �纸
		 * daemon : ���� �����忡 ���ӵ�(�θ� ����� ���� ����), ó������ �����̾��
		 * group pool priority ��..
		 */

		//sleep
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			//�� ������ �ҷ��ͼ� 1�� sleep ��û
//			try {
//				Thread.currentThread().sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("���� :: " + e.getMessage());
//			}
//		}
//		System.out.println("��!");
		
//		test1();
		test2();
		
	}//main
	
	private static void test1() {
		
		System.out.println("===== inturrupt test =====");
		
		//MyRunner �̿��ؼ� ������ ����
		Thread t1 = new Thread(new MyRunner());
		t1.start();
		
		t1.interrupt();
	}
	
	private static void test2() {
		
		System.out.println("===== notify test =====");
	
		Thread t1 = new Thread(new RunnerMethodA());
		Thread t2 = new Thread(new RunnerMethodB());
		
		t1.start();
		t2.start();
	}
	
}//class





