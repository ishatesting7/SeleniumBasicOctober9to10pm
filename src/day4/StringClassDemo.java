package day4;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is a datatype as well as class in JAVA
		// Math is a class
		StringClassDemo obj = new StringClassDemo(); //Def
		
		StringClassDemo obj1 = new StringClassDemo(3,2);

	}
	
	//Constructor - 
	/* -> constructor in java is a method
	 * -> constructor do not have return type
	 * -> constructor are always executed at the time of object creation
	 * -> constructor is having the same name as classname
	 * -> constructor are of two type - default const
	 * 								  - parameterised const
	 * 
	 */
	StringClassDemo()  //Default const
	{
		String m = "Hello I am new to Java";
		String n = "Hello Java";
		System.out.println("The Length of the String is = "+ m.length());  //length
		System.out.println("The concatenated String is = "+ (m.concat(n)).concat("HELLO"));  // concat
		System.out.println("String m in Lower case - " + m.toLowerCase());
		System.out.println("String m in Upper case - " + m.toUpperCase());
		System.out.println(m.indexOf('J')); //position
		System.out.println(m.compareTo(n));
		System.out.println(m.trim());
		System.out.println(m.substring(7));
		System.out.println(m.contains(n));
		String mo[] = m.split(" ");
		System.out.println(mo[0]);
		System.out.println(mo[1]);
		
		//20 Methods of String class
			
	}
	
	StringClassDemo(int m, int n) //Parameterised 
	{
		
		System.out.println("Maximum value - " +Math.max(m, n));	
		System.out.println("Maximum value - " +Math.min(m, n));
		System.out.println("Maximum value - " +Math.pow(m, n));
		System.out.println("Maximum value - " +Math.sqrt(m));
		System.out.println("Maximum value - " +Math.ceil(8.778));
		// 5 Methods of Math class
	}

}
