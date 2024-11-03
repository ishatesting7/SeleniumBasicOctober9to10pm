package day2;

public class OperatorJava {

	int a = 100; //Access Modifier - private, public, protected and default
				 //Instance Var, Local Var, Global var
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OperatorJava m1 = new OperatorJava();
		//m1.
		OperatorJava a1 = new OperatorJava();
		System.out.println(a1.a);

		//System.out.println(a1.m);
		a1.ArithmeticOperator();  //Function Call -- Method call
		a1.AssignmentOperator();
	

		/*
		 * Arithmetic Operator Assignment Operator Comparison Operator Logical Operator
		 * (AND OR) Bitwise Operator
		 */
	}
	// Method will reside always outside main method
	// void - It is a return type - I am not excepting any value to return
	// A pair of curly bracket is call as block

	void ArithmeticOperator() { //Method Definition -- Function Definition
		int a, b;
		a = 10;
		b = 20;
		System.out.println("Add = " + (a + b));
		System.out.println("Sub = " + (a - b));
		System.out.println("Mul = " + (a * b));
		System.out.println("Div = " + (a / b));
		System.out.println("Modulus = " + (a % b)); //  Remainder 100%10 = 0  --- 				13993%10 === 3
	}

	
	
	void AssignmentOperator()
	{
		int a, b;
		a = 10;
		System.out.println("Add = " + (a+=10));  //  20 
		System.out.println(a);  //  20 

		System.out.println("Sub = " + (a-=10));  //  10
		System.out.println(a);  //  20 

		System.out.println("Mul = " + (a*=10));  //  100
		System.out.println(a);  //  20 

		System.out.println("Div = " + (a/=10));  //  10 
		System.out.println(a);  //  20 

		System.out.println("Modulus = " + (a%=10)); // 0
		System.out.println(a);  //  20 

		System.out.println("Div = " + (a/=10));  //  0
		System.out.println(a);  //  20 

		
	}
	
	// Object - It will have knowledge of all the methods, variable, contructor
	// anything inside class
	// Syntax for creating Object - <classname> <objname> = new <classname>
	// new

}

/*
 * 
 * 1. Print all the - Perform all the arithmetic operator
 * 2. Reversing a number ( input - 120334) ( output - 433021)
 * 
 */
