package day3;

public class JavaOperatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JavaOperatorDemo2 obj = new JavaOperatorDemo2();
		obj.ComparisonOperator();
		obj.ifelseDemo();
		/*
		 * Comparison Operator (> < >= <= != ! ==) if without else if with else -- long
		 * if else -- conditional logic
		 * 
		 */

	}

	void ComparisonOperator() {
		String m = "Hello World";
		String n = "hello world";
		// 2 state - TRUE or FALSE
		int p = 10, q = 12;
		boolean flag = p > q; // Because of String
		System.out.println("Condition 1 - " + flag);
		if (flag) {
			System.out.println("I am in if statement");
		} else {
			System.out.println("I am in else statement");
		}

		flag = p < q; // Because of String
		System.out.println("Condition 2 - " + flag);
		if (flag) {
			System.out.println("I am in if statement");
		} else {
			System.out.println("I am in else statement");
		}

		flag = p >= q; // Because of String
		System.out.println("Condition 3 - " + flag);
		if (flag) {
			System.out.println("I am in if statement");
		} else {
			System.out.println("I am in else statement");
		}

		flag = p <= q; // Because of String
		System.out.println("Condition 4 - " + flag);
		if (flag) {
			System.out.println("I am in if statement");
		} else {
			System.out.println("I am in else statement");
		}

		flag = (p != q); // Because of String
		System.out.println("Condition 5 - " + flag);
		if (flag) {
			System.out.println("I am in if statement");
		} else {
			System.out.println("I am in else statement");
		}

	}

	void ifelseDemo() {
		boolean flag = true;
		// chrome, edge, mozilla firefox
		String browser = "safari";
		if (browser.equals("chrome")) {
			System.out.println("I am opening in chrome");
		} else if (browser.equals("mozilla")) {
			System.out.println("I am opening in mozilla");

		} else if (browser.equals("edge")) {
			System.out.println("I am opening in edge");

		} else if (browser.equals("opera")) {
			System.out.println("I am opening in opera");

		} else if (browser.equals("brave")) {
			System.out.println("I am opening in brave");

		} else {
			System.out.println("user has selected invalid choice");

		}
	}

}
