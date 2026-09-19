
    public class Main 
    {
	static void test() throws ArithmeticException
	{
		int result = 10/0;
	}
	public static void main(String[] args)
	{
		try
		{
		   test();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide by zero");
		}
	}
}

		
		
	
