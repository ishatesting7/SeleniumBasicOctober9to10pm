package day7;


//Custom Exception
class NumberException extends Exception {

	public NumberException(String mess)
	{
		super(mess);
	}
}

public class NumberExceptionDemo{
	public static void main(String args[])
	{
		try {
			checkNum(16);
		}
		catch(NumberException e)
		{
			System.out.println("ERROR - "+ e.getMessage());
		}
	}
	
	public static void checkNum(int n) throws NumberException
	{
		if(n<18)
		{
			throw new NumberException("number should be less than n");
		}

	}
}

/*

G1
ZGC

*/

