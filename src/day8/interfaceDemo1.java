package day8;

interface interfaceDemo {

	
	/*
	 * ->Abstract Method - Method do not have the body only signature will be available
	 * ->No Constructore - 
	 * ->Default Method --> 
	 * ->Static Method 
	 * ->Contants - Public, Static and Final 
	 * ->Multiple Inheritance -> Through Interface 
	 * 
	 */
	final int m=10;
	int n = 100;
	static int o = 1000;
	void Demo1(); //Abstract Method
	
	default void Demo2() //Default Method
	{
		System.out.println("I am in Demo2");
	}
	
	static void Demo3() //Static Method
	{
		System.out.println("I am in Demo3");
	}
	
}

 class interfaceDemo1 implements interfaceDemo
{

	@Override
	public void Demo1() {
		// TODO Auto-generated method stub
		System.out.println("I am in Demo1");
	}
	public static void main(String args[])
	{
		interfaceDemo1 obj = new interfaceDemo1();
		obj.Demo1();
		obj.Demo2();
		System.out.println(obj.m);
		
	}
	
}
