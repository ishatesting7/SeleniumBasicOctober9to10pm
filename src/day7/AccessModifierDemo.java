package day7;

public class AccessModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifierDemo obj = new AccessModifierDemo();
		obj.privateVoid();
		
		/*
		 * public, private, protected and default
		 * 
		 */
	
	}
	//public 
	public void demo()
	{
		System.out.println("I am in public access modifier");
	}
	//protected
	protected void protectVoid()
	{
		System.out.println("I am in protected access modifier");
	}
	
	//private
	private void privateVoid()
	{
		System.out.println("I am in Private access modifier");
	}
	
	//default
	void defaultMethod()
	{
		System.out.println("I am in default access modifier");

	}
	
	//static
	static void defaultMethodWithStatic()
	{
		System.out.println("I am in default access modifier with static keyword");

	}
}
