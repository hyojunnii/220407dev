package string;

public class Main {

	public static void main(String[] args) {
		String str = "Hello World!";
		System.out.println(str.charAt(4));
		System.out.println(str.substring(1,5));
		System.out.println(str.equals("hello"));
		//"hello".equals(str) �� �� ���� �ڵ� -> str�� null�� ���� �־ literal�� ���ϴ°� ����
		System.out.println(str.contains("abc"));
		System.out.println(str.indexOf("r"));
		String[] strArr = str.split(" ");
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
//		System.out.println(Arrays.toString(strArr));
	}

}
