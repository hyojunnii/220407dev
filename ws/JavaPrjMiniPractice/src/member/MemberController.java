package member;

import java.util.Scanner;

public class MemberController {

	public void memberJoin() {
		Scanner sc = new Scanner(System.in);

		System.out.println("===== ȸ������ ���� =====");
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pwd = sc.nextLine();
		
		//ȸ������ ���� ���� üũ
		boolean checkResult = checkMember(id);
		if(checkResult) {
			insertMember(id,pwd);
		} else {
			System.out.println("ȸ������ ����!");
		}
		
	}
	
	// ����Ͻ� ���� ó�� (service ����)
	private boolean checkMember(String id) {
		// ���̵� �ߺ� üũ�ؼ�, ��� ����
		// ���̵� �����ڸ� ��Ī�� ������ ������ ���� ó��
		if("admin".equals(id)) {
			return false;
//		} else if(/*� ���*/) {
//			return false;
		} else {
			return true;
		}
	}

	// ������ ���� (data ����)
	private void insertMember(String id, String pwd) {
		//���� ��ü ����
		//���� ��ü�κ��� ��Ʈ�� ����
		//��Ʈ�� �̿��ؼ� ������ ����
		System.out.println("ȸ������ �Ϸ� !");
	}
	
}
