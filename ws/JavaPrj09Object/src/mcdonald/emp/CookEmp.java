package mcdonald.emp;

public class CookEmp {
	
	String name;
	int money;
	
	public void cook(String ham) {
		System.out.println(ham + " �丮�ϱ�");
		System.out.println("�丮�Ϸ�~");
		this.clean();
	}
	
	public void clean() {
		System.out.println("�������ϱ�");
	}
	
}