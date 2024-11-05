package day5;

public class forLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 12 X 1 = 12
		forLoopDemo obj = new forLoopDemo();
		obj.tableOfNumber(12);
		obj.addIndividualNumbers(38283);
		obj.reverseString("Hello World");

	}

	void tableOfNumber(int n) {
		for (int i = 1; i <= 12; i++) {
			System.out.println(n + " X " + i + " = " + (i * n));
		}
	}

	// Addition of 1483 == 1+4+8+3

	// Modulus -- Remainder -- %
	void addIndividualNumbers(int n) {
		// While Loop -- Do While Loop
		int result = 0;
		// for (dsas;dasdas;dsadsa)
		while (n > 0) {
			// logic
			int temp = n % 10; // 3
			result = result + temp; // result = 3 + 8
			n = n / 10; // n = 148
		}

		System.out.println("The Addition of Digits - " + result);

	}

	void reverseString(String n) {
		String rev = " ";
		int len = n.length();
		int ind = len - 1;
		do {
			rev = rev + n.charAt(ind);
			ind = ind - 1;
		} while (ind >= 0);

		System.out.println("The Reverse of String - " + rev);

	}
	/*
	 * do { }while(condition);
	 * 
	 * hello world dlrow olleh
	 * 
	 */
	/*
	 * for(init ; conditional check ; updation)
	 * 
	 */
}
