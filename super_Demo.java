class Parentt
{
	int a=10;
	public void show()
	{
		System.out.println("In Parent");
	}
}
class Childd extends Parentt
{
	int a=20;
	public void show()
	{
		System.out.println("a"+a);
		System.out.println("a"+super.a);
		
	}
	
	
}
public class super_Demo {

	public static void main(String[] args) {
		
		Childd c=new Childd();
		c.show();
		
		

	}

}
