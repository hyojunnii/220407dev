package menu;

import util.InputUtil;

public class Menu {
	
	// �޼ҵ� == ���� -> �޼ҵ� �� �ۼ���, ���� ���·� �ۼ� ����
	// �޴� �����ֱ�
	public void showMenu() {
		System.out.println("1. ȸ������");
		System.out.println("2. �����ϱ�");
		System.out.println("3. ");
		System.out.println("4. ");
		System.out.println("5. ");
//		inputMenu();
	}
	
	// �޴� ���� �Է� �ޱ�
	public String inputMenu() {
		String input = InputUtil.inputStr();
		return input;
	}
	
}
