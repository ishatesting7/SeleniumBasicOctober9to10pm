package day8;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("ABC");
		ll.add("XYZ");
		ll.add("PQR");
		ll.add("MNO");
		
		ll.addFirst("FIRST");
		
		ll.addLast("LAST");
		
		System.out.println("Array List - "+ ll);
		
		ll.removeFirst();
		
		ll.removeLast();
		
		System.out.println("Array List - "+ ll);
		
		for(String n : ll)
		{
			System.out.println(n);
		}

	}

}
