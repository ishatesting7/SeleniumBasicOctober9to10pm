package day6;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[100]; //Approach 1
		
		String[] arr1; //declare the array  Approach 2
		
		arr1 = new String[100]; //allocate the memory
			
		int[] age = {1,2,3,4,5,6,7}; // Approach 3
		
		int age1[] = {1,2,3};  //Approach 4
		
		//Enhance for loop
		for(int a : age1)
		{
			System.out.println("Array Value - "+ a);
		}
		
	}
	/*
	 * -> Array - Responsible for storing multiple value of same data-type
	 * 
	 */

}
