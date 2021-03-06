package method02;

public class MyClass02 {
	
	// 메소드 (method)
	
	/* 
	 * 작성 방법
	 * 접근제한자 리턴타입 메소드명(매개변수) {실행내용, return값}
	 * public int plusOne(int number) {number++; return number;}
	 * 
	 * 리턴값이 없으면 void
	 */
	
	public void test() {
		System.out.println("시작");
		
//		myMethod01();
//		plusTen(10);
//		System.out.println(getAge());
		
		int result = plusOne(10);
		System.out.println(result);
		
		System.out.println("종료");
	}
	
	// 매개변수(전달해줘야 하는 값)가 없고, 리턴값(뱉어내는 값)이 없는(void) 메소드
	public void myMethod01() {
		System.out.println("안녕");
	}
	
	// 매개변수가 있고, 리턴값이 없는 메소드
	public void plusTen(int x) {
		x = x+10;
		System.out.println(x);
	}
	
	// 리턴하는 메소드
	public int getAge() {
		System.out.println("getAge메소드 호출");
		return 20; //되돌아감
	}
	
	//매개변수가 있고, 리턴값이 있는 메소드
	public int plusOne(int x) {
		x++;
		return x;
	}
	
	// 리턴타입 / 매개변수 타입 다르게 가능
	public double calcCircle(int r) {
		double result = r * r * 3.14;
		return result;
	}

}
