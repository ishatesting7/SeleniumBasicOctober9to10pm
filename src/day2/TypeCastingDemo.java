package day2;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		float d = i; //Automatic casting - int into double
		
		System.out.println(i); // 10 
		System.out.println(d); // 10.0
		
		//byte - short - char - int - long - float - double (widen type casting)
		//double - float - long - int - char - short - byte (narrow type casting)
		
		//"3994";
		
		double dd =7.39D;
		int ii = (int) dd; //Manual Casting - Double to Int
		
		System.out.println(dd); // 7.39
		System.out.println(ii); // 7
		
		
		double p = (double) 399/500*100f;
		System.out.println(p);
		
		/*
		 * If user 19 and your calc 20 
		 * Fail - TC
		 * Date of Birth
		 * Current Day
		 * Age - Current Day - Date of Birth
		 * Age > 18
		 */
	}

}

// Type Casting - 