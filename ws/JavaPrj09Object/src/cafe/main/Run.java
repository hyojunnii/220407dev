package cafe.main;

import cafe.employee.CounterEmp;
import cafe.employee.KitchenEmp;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("--cafe open--");
		
		CounterEmp ce = new CounterEmp();
		KitchenEmp ke = new KitchenEmp();
		
		ce.order();
		ce.calc();
		ke.cook();
		ke.complete();
		
		ce.nick = "�ɿ���";
		ke.nick = "������";
		
		System.out.println("ī�������� : " + ce.nick);
		System.out.println("�ֹ����� : " + ke.nick);
		
	}

}