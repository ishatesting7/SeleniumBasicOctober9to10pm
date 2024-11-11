package day8;

import java.util.ArrayList;
import java.util.Arrays;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayL = new ArrayList<>();
		arrayL.add("ONE");
		arrayL.add("TWO");
		arrayL.add(0,"THREE");
		arrayL.add("TWO");
		
		System.out.println(arrayL.isEmpty());
		System.out.println(arrayL.get(1));
		System.out.println(arrayL.size());
		System.out.println(arrayL);
		
		Object arrayL1 = new ArrayList<>();

		arrayL1 = arrayL.clone();
		ArrayList<Integer> arrayLint = new ArrayList<>();

		arrayLint.add(1);
		arrayLint.add(2);
		arrayLint.add(3);
		arrayLint.add(4);
		Object[] am = arrayLint.toArray();
		Arrays.sort(am);
		//Arrays.sort
		//System.out.println(arrayL1);
		

	}

}

/*
 * 
 * ArrayList
 * LinkedList
 * HashMap
 * HashTable
 * List
 * Set
 * Map
 * 
 * 
 */
