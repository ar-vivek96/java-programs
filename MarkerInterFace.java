
interface Permission
{
	
}
class Myclass implements Permission
{
	public void show()
	{
		System.out.println("In show method");
	}
}
public class MarkerInterFace {

	public static void main(String[] args) {
		Myclass m =new Myclass();
		
		if(m instanceof Permission)
		{
			m.show();
		}
		else
		{
			System.out.println("No Access Granted");
		}
		
		

	}

}
