package temp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		/*
		1. Map Ÿ�� ��ü ����
		2. Map �� key�� ���ڿ�, value�� ���� �� �����ϱ�
		3. Map �� 5���� ���ڿ�-���� �� ������ �ֱ�
		4. Ư�� key�� value ������ ����غ���
		5. ��� Ű �� Ȯ���غ��� (���)
		6. ��� value Ȯ���غ��� (���)
		7. ��� key - value �� Ȯ���غ��� (���)
		 */
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�ϳ�", 1);
		map.put("��", 2);
		map.put("��", 3);
		map.put("��", 4);
		map.put("��", 5);
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		
		Iterator<Entry<String, Integer>> iter = es.iterator();
		
		while(iter.hasNext()) {
			Entry<String , Integer> x = iter.next();
			System.out.print(x.getKey() + " : ");
			System.out.println(x.getValue());
		}
		
		
//		Collection<Integer> vvv = map.values(); //iterator �� ��ȯ ����
//		System.out.println(vvv);
		
//		int result = map.get("�ϳ�");
//		System.out.println(result);
		
//		Iterator<String> iter = map.keySet().iterator();
//		
//		while(iter.hasNext()) {
//			String k = iter.next(); //Ű �Ѱ��� ������
//			System.out.print(k + " : ");
//			System.out.println(map.get(k));
//		}
		
		
		
		/*
		1. Set Ÿ�� ��ü ����
		2. ������ ������ �����ϱ�
		3. 5���� ���� �ֱ�
		4. ��� �� ����غ���
		5. ���� n�� �ش� ��ü�� ���ԵǾ� �ִ��� Ȯ���غ���
		 */
		
//		Set set = new HashSet<Integer>();
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
//		set.add(50);
//		
//		boolean result = set.contains(30);
//		System.out.println(result);
//		
		//iterator
//		Iterator<Integer> iter = set.iterator();
		
//		while(true) {
//			if(!iter.hasNext()) {
//				break;
//			}
//			
//			if(iter.hasNext()) {
//				int result = iter.next();
//				System.out.println(result);
//			}
//		}
		
//		while(iter.hasNext()) {
//			int result = iter.next();
//			System.out.println(result);
//		}
		
		
		/*
		 *  1. List Ÿ�� ��ü ����
			2. ���ڿ��� ���� �� �ֵ��� ����
			3. ������ �̸� n�� �ֱ�
			4. ��� ������ �̸� ����غ��� (�ݺ�������)
			5. �� �� 3��° ������ �̸� ����غ���
			6. ������(�ڿ��� ù��°) ������ �̸� ����غ���
			7. �ڿ��� �ι�° ������ �̸� �����ϱ�
		 */
		
		//���׸�
//		List<Person> list = new ArrayList<Person>();
//		
//		list.add(new Person("�ɿ���", 11));
//		list.add(new Person("������", 22));
//		list.add(new Person("�ɻ��", 33));
//		list.add(new Person("�ɳݿ�", 44));
//		list.add(new Person("�ɿ���", 55));
//		
//		for(Person x : list) {
//			System.out.println(x);
//		}
		
		
		
//		list.add("�ɿ���");
//		list.add("������");
//		list.add("�ɻ��");
//		list.add("�ɻ��");
//		list.add("�ɿ���");
		
//		list.remove(list.size()-2); //Ư�� �ε����� ��Ҹ� ������ �� �ִ�.
		
//		int n = list.size()-1; //4
//		System.out.println(list.get(n));
		
		//���� for��
//		for(String x : list) {
//			System.out.println(x);
//		}
		
//		for(int i = 0 ; i < list.size(); ++i) {
//			System.out.println(list.get(i));
//		}
		
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		System.out.println(list.get(3));
//		System.out.println(list.get(4));
		
		
		/*
		1. ���ڿ� �ϳ� �����
		2. n��° ���� ����ϱ�
		3. n��° ���� m ��° ���ڿ� ����ϱ�
		4. "hello" ��� ���ڿ��� ������ Ȯ���ϱ�
		5. "abc" ��� ���ڿ��� �����ϰ� �ִ��� Ȯ���ϱ�
		6. �ش� ���ڿ��� ������ Ư�� ������ �ε��� �� �˾Ƴ���
		7. Ư�� ���ڿ��� �����ڷ� �Ͽ� ���ڹ迭 ����
		 */
		
//		String str = "abc �ȳ� hello hi";
		
//		char ch = str.charAt(5); //Ư�� �ε����� ���� ��ȯ
//		System.out.println(ch);
		
//		String result = str.substring(2,5);
//		System.out.println(result);
		
//		str.equals("hello") //���ڿ� ������ ��
//		"hello".equals(str) //���ڿ� ������ ��
		
//		str.contains("abc"); //�ش繮�ڿ��� ������ �ִ��� �� ����
		
//		int idx = str.indexOf("��");
//		System.out.println(idx);
		
		//"abc �ȳ� hello hi"
//		String[] strArr = str.split(" ");
//		
//		System.out.println(strArr[0]);
//		System.out.println(strArr[1]);
//		System.out.println(strArr[2]);
//		System.out.println(strArr[3]);
		
		
	}
}
