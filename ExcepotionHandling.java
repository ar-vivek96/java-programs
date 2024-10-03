
public class ExcepotionHandling {
	
		public void throwsDemo() throws Exception
		{
			String str=null;
			System.out.println(str.length());
		}
		public void slave()
		{
			try
			{
			throwsDemo();
			}
			catch(Exception e)
			{
				System.out.println("OOPs"+e);
			}
		}
	
	public static void main(String[] args) {
	
		ExcepotionHandling obj=new ExcepotionHandling();
		obj.slave();
	}

}
