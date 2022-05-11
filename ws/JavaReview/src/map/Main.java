package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Map hm = new HashMap<String, Integer>();
		
		hm.put("��", 1);
		hm.put("��", 2);
		hm.put("��", 3);
		hm.put("��", 4);
		hm.put("��", 5);
		
		Set<Map.Entry<String, Integer>> es = hm.entrySet();
		// Map.Entry == Entry
		
		Iterator<Entry<String, Integer>> iter = es.iterator();
		
		while(iter.hasNext()) {
			Entry<String, Integer> x = iter.next();
			System.out.print(x.getKey() + " : ");
			System.out.println(x.getValue());
		}
		
		System.out.println(hm.get("��"));
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
	}

}
