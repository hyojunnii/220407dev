package method02;

public class MyClass02 {
	
	// �޼ҵ� (method)
	
	/* 
	 * �ۼ� ���
	 * ���������� ����Ÿ�� �޼ҵ��(�Ű�����) {���೻��, return��}
	 * public int plusOne(int number) {number++; return number;}
	 * 
	 * ���ϰ��� ������ void
	 */
	
	public void test() {
		System.out.println("����");
		
//		myMethod01();
//		plusTen(10);
//		System.out.println(getAge());
		
		int result = plusOne(10);
		System.out.println(result);
		
		System.out.println("����");
	}
	
	// �Ű�����(��������� �ϴ� ��)�� ����, ���ϰ�(���� ��)�� ����(void) �޼ҵ�
	public void myMethod01() {
		System.out.println("�ȳ�");
	}
	
	// �Ű������� �ְ�, ���ϰ��� ���� �޼ҵ�
	public void plusTen(int x) {
		x = x+10;
		System.out.println(x);
	}
	
	// �����ϴ� �޼ҵ�
	public int getAge() {
		System.out.println("getAge�޼ҵ� ȣ��");
		return 20; //�ǵ��ư�
	}
	
	//�Ű������� �ְ�, ���ϰ��� �ִ� �޼ҵ�
	public int plusOne(int x) {
		x++;
		return x;
	}
	
	// ����Ÿ�� / �Ű����� Ÿ�� �ٸ��� ����
	public double calcCircle(int r) {
		double result = r * r * 3.14;
		return result;
	}

}