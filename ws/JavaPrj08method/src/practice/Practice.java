package practice;

public class Practice {

	public void test() {
		System.out.println("practice start");
//		printHelloWorld();
		printMyName();
		multiple(10);
		System.out.println(getName());
		System.out.println(plus(10,20));
		System.out.println("practice end");
		
	}

	public void printHelloWorld() {
		System.out.println("hello world");
	}
	
	public void printMyName() {
		System.out.println("권효정");
	}
	
	public void multiple(int x) {
		System.out.println(x * 2);
	}

	public String getName() {
		return "권효정";
	}
	
	public int plus(int a, int b) {
		return a + b;
	}
}
