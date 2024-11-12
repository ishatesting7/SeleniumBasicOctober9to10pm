package day8;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		// KEY VALUE
		map.put(1, 1);
		map.put(2, 1);
		map.put(3, 2);
		map.put(1, 2);
		map.put(2, 100);

		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue(100));
		
		

	}

}
