package day5;

import java.util.Scanner;

public class scannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number = ");
		
		int m,n;
		
		m = s.nextInt();
		n = s.nextInt();
		System.out.println("Enter the String = ");

		String o = s.next();
		o = s.next();
		System.out.println("The number are - " + o + (m+n));
	}

}
