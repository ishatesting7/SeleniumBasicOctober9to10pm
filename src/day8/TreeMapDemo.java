package day8;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> tm = new TreeMap<>();
		
		tm.put("ONE",1);
		tm.put("TWO",2);
		tm.put("THREE",3);

		
		
		// KeySet()
		System.out.println("OUTPUT = "+ tm.keySet());
		System.out.println("OUTPUT Value = "+ tm.values());

		System.out.println("Implementing HeadMap - "+ tm.headMap("ONE"));
		System.out.println("Implementing HeadMap - "+ tm.headMap("TWO"));
		System.out.println("Implementing HeadMap - "+ tm.headMap("THREE"));

		System.out.println("Implementing TailMap - "+ tm.tailMap("THREE"));

	}
	

	

}
