package practice;

public class Main {

	public static void main(String[] args) {

		int[] a = new int[10];
		
		for (int i = 0; i < 10; i++) {
			a[i] = (i+1)*10;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}
}
