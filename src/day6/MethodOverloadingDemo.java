package day6;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.Area(10);
		obj.Area(6.0f);
		obj.Area(10, 5);
		
		
	}
	/*
	 * -> Two or more method must have same name.
	 * -> They should either have diff parameter
	 * -> They should either have diff datatype
	 * -> It is also called as Compile Time Polymorphism 
	 */
	
	void Area(int l, int b)
	{
		int area;
		area = l*b;
		System.out.println("Area of Rectangle - "+ area);
	}
	
	void Area(int s)
	{
		int area;
		area = s*s;
		System.out.println("Area of Square - "+ area);
	}
	
	void Area(float radius)
	{
		float area;
		area = (float) (3.14*radius*radius);
		System.out.println("Area of Circle - "+ area);
	}
	
	int Area(float b, int h)
	{
		
		return 0;
	}
	
	float Area(float b, float h)
	{
		
		return 0;
	}
	
	int Area(int b, float h)
	{
		
		return 0;
	}
}
