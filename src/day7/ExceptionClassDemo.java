package day7;

public class ExceptionClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * Exception 
		 * 
		 * Checked Exception and Unchecked Exception
		 * 
		 * Checked Exception - Checked at the COMPILE TIME
		 * 
		 * UnChecked Exception - Checked at the RUNTIME 
		 * Throwable
		 * 		Error
		 * 		Exception
		 * 			RunTime (Uncheck)
		 * 			Compile (check)
		 * 				java.lang.ArrayIndexOutOfBoundsException:
		 * 				jave.lang.SQLException
		 * 
		 * finally
		 * 
		 * - Whatever we write inside finally 
		 */
		//Exception e;
		
		
		try {
		int m[] = {1,2,3};
		System.out.println(m[5]);
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("Cought Exception"+ e.getMessage());
		}
		finally
		{
			System.out.println("Inside Finally");
		}
		System.out.println("Hello I am in Exception");
		
		try {
		int m = 1/0;
		} catch(Exception e)
		{
			System.out.println("Cought Ex - "+ e.getMessage());
		}
		
		/*
		 * 
		 * 
		 * Throwing Exception
		 * 
		 */
	}

}
