package day7;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowingExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkNumber(16);
		} catch (Exception e) {
			System.out.println("ERROR " + e.getMessage());
		}
	}

	public static void checkNumber(int n) {
		if (n < 18) {
			throw new IllegalArgumentException(n +" should be number and it should be atleast less then 18");
		}
	}
	
	//Declare the Exception with Method (throws)
	public void readingFile(String filePath) throws FileNotFoundException
	{
		FileReader file =  new FileReader("path");
	}

}
