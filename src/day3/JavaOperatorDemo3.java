package day3;

public class JavaOperatorDemo3 {

	public static void main(String[] args) {
		
		JavaOperatorDemo3 obj = new JavaOperatorDemo3();
		obj.logicalOperator();

		// TODO Auto-generated method stub
		//AND NOT and OR
		/*
		 * AND
		 *  T  T - T
		 *  T  F - F
		 *  F  T - F
		 *  F  F - F
		 *  
		 * OR
		 *  T  T - T
		 *  T  F - T
		 *  F  T - T
		 *  F  F - F
		 *  
		 *  
		 *  2 raise to 4 - 16
		 *  2 raise to 3 - 8
		 *  TTT
		 *  TTF
		 *  TFT
		 *  TFF
		 *  FTT
		 *  FTF
		 *  FFT
		 *  FFF
		 */
	}
	

	void logicalOperator()
	{
		int m = -10, n = -100;
		//AND
		System.out.println("======== AND =========");

		if(!(m>0 && n>0))
		{
			System.out.println("Both the values are greater than 0");
		}
		else if(m>0 && n<0)
		{
			System.out.println("the value of m is positive and the value of n is negative");
		}
		
		System.out.println("======== OR =========");
		
		if(m>0 || n>0)
		{
			System.out.println("Both the values are greater than 0");
		}
		else if((m>0 || n==0) || (m>10) || (n>20) && (m>10))
		{
			System.out.println("the value of m is positive and the value of n is negative");
		}
		//Combination of AND and OR 
	}
	void countVowels()
	{
		
		String str = "I am new to Java";
		
		//Array - 1. We will be able to store same data type
		//Array - 2. We will be having the fixed size
		
		char ch[] = str.toCharArray();
		
	}
}
