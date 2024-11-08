package day6;

import day7.AccessModifierDemo;

public class publicAccessModDemo extends AccessModifierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifierDemo obj = new AccessModifierDemo();
		obj.demo();
		// obj.defaultMethod(); not allowed
		publicAccessModDemo obj1 = new publicAccessModDemo();
		obj1.protectVoid();

	}

}
