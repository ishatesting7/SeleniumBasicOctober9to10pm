package day7;

public class AccessModifierDemo2 extends AccessModifierDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifierDemo obj = new AccessModifierDemo();
		obj.demo();
		obj.protectVoid();
		obj.defaultMethodWithStatic();
		AccessModifierDemo.defaultMethodWithStatic();
		
		AccessModifierDemo2 obj1 = new AccessModifierDemo2();
		obj1.defaultMethodWithStatic();
	}

}
