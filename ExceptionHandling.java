
public class ExceptionHandling {

	public void throwDemo() throws Exception
	{
		String str=null;
		System.out.println(str.length());
	}
	public void Slave()
	{
		try {
		throwDemo();
		}
		catch(Exception e)
		{
			System.out.println("Exception"+e);
		}
	}
	
	public static void main(String[] args) throws Exception{ 

		ExceptionHandling obj=new ExceptionHandling();
		obj.Slave();
		

	}

}
