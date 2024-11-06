package day6;
class IndoorGame  //Parent Class
{
	final float pi = 3.14f;
	void rules()
	{
		System.out.println("Indoor Game Rules");
		
	}
	
	static void IndoorGames()
	{
		System.out.println(" I am in static method ");
	}
	
	void GamesImp()
	{
		System.out.println("This Game is Important");
	}
}

class Carrom extends IndoorGame //Child Class
{
	@Override
	void rules()
	{
		System.out.println("Carrom Game Rule");
	}
	
	@Override
	void GamesImp()
	{
		System.out.println("This Game is Important in Child");
	}
	
	
	
}

class TableTennis extends IndoorGame //Child Class
{
	@Override
	void rules()
	{
		System.out.println("Table Tennis Game Rule");
	}
}


public class MethodOverRidingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IndoorGame parentobj = new IndoorGame();
		parentobj.rules();
		parentobj.IndoorGames();
		IndoorGame.IndoorGames();
		IndoorGame parentobj1 = new Carrom();
		parentobj1.rules();
		parentobj1.GamesImp();
		parentobj1.IndoorGames();
		
		TableTennis tt = new TableTennis();
		tt.IndoorGames();
		
		//IndoorGame tt1 = new TableTennis();
	}

	/*
	 * -> It should have same Method Name
	 * -> It should have same number of parameter
	 * -> It should have same return type
	 * 
	 * Rules
	 * -> Final method cannot be overrdden
	 * -> Constructor cannot be overridden
	 * -> Static methods cannot be overridden
	 * 
	 * Final Keyword
	 * Static Keyword
	 * 
	 */
}
