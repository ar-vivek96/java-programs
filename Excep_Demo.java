
public class Excep_Demo {

	public static void main(String[] args) {
		
		try {
		int a=4/1;
		try {
			int c[]= {2};
			c[20]=20;
			
		}
		catch(Exception e)
		{
			System.out.println("Ecception-->"+e);
		}
		}
		catch(Exception e)
		{
			System.out.println("Exception-->"+e);
		}
		finally
		{
			System.out.println("Thankyou");
		}
		
	}

}
