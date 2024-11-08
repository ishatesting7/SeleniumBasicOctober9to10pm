package day7;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "chrome";

		switch (browser) {
		case "chrome":
			System.out.println("Invoking Chrome Browser");
			break;
		case "edge":
			System.out.println("Invoking Edge Browser");
			break;
		case "firefox":
			System.out.println("Invoking Firefox Browser");
			break;
		case "opera":
			System.out.println("Invoking Opera Browser");
			break;
		default:
			System.out.println("Invalid Browser Selection");
		}
			for(int k = 0;k<10;k++)
			{
				if(k == 4)
				{
				break;
				}
				System.out.println(k);
			}
			/*
			 * break and continue
			 * 
			 * 
			 * 
			 * 
			 * for() 
			 * { 
			 * 	if(true) 
			 * 	{ break; 
			 * 	} 
			 * }
			 */
		
	}

}
