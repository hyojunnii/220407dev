package mcdonald.main;

import mcdonald.emp.CookEmp;
import mcdonald.emp.CounterEmp;
import mcdonald.emp.RiderEmp;

public class RunMcDonald {

	public static void main(String[] args) {

		// ��ü �̿��ؼ� ���α׷��� 

		System.out.println("====�Ƶ�����====");

		// ��ü �̸� �����
		CounterEmp counter01 = new CounterEmp();
		CookEmp cook01 = new CookEmp();
		RiderEmp rider01 = new RiderEmp();
		
		// �ֹ� > �丮 > ���
		String ham = counter01.order();
		counter01.calc();
		cook01.cook(ham);
		rider01.delivery(ham);
		
		
	}

}
