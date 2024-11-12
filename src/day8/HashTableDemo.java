package day8;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, Integer> ht = new Hashtable<>();

		ht.put("String1", 1);
		ht.put("String2", 2);
		ht.put("String3", 3);

		System.out.println(ht);

		int v = ht.get("String1");
		System.out.println(v);

		if (ht.containsValue("asd")) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");

		}

		for (var entry : ht.entrySet()) {
			System.out.println("Key -- " + entry.getKey() + "   Value --  " + entry.getValue());
		}

	}
	
	/*
	 * Admin ---> admin123
	 * Master --> master123
	 * Client --> client123
	 */

}
