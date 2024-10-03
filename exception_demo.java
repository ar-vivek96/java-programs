
public class exception_demo {

	public static void main(String[] args) {
	
	try
	{
		int	a=6/1;
		try
		{
			int c[]= {2};
			c[10]=29;
		}
		catch(Exception e)
		{
			System.out.println("inner try Exception"+e);
		}
	}
	catch(Exception e)
	{
		System.out.println("Exception-->"+e);
	}
	finally
	{
		System.out.println("Bye User");
	}


	}

}
