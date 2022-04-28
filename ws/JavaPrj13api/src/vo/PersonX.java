package vo;

public class PersonX {
	
	//������ (��� �ʵ带 �Ű������� �ϴ�)
	// alt + shift + s�� ������, getter, setter �ڵ����� ���� ����
	
	public PersonX(String name, int age, double height, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	private String name;
	private int age;
	private double height;
	private char gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void info() {
		// ������ �ִ� ��� ������ ������ִ� �޼ҵ�
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("gender : " + gender);
		System.out.println("height : " + height);
	}
	
	//a + sh + s - Generate toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + "]";
	}
	
	
}
