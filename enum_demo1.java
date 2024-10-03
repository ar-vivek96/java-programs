enum Shape1
{
	CIRCLE,TRIANGLE(3),SQUARE;
	private int a=8,sides;
	private Shape1()
	{
		System.out.println("Vvv");
	}
	private Shape1(int a)
	{
		sides=a;
	}
	public int getSides()
	{
		return sides;
	}
	
	
}

public class enum_demo1 {

	public static void main(String[] args) {
		
		
		/*Shape1 obj=Shape1.SQUARE;
		Shape1[] val=Shape1.values();
		for(Shape1 x:val)
		{
			System.out.println(x);
		}
	
		if(obj==Shape1.CIRCLE)
		{
			System.out.println("No Sides");
		}
		else if(obj==Shape1.TRIANGLE)
		{
			System.out.println("Three Sides");
		}
		else if(obj==Shape1.SQUARE)
		{
			System.out.println("Four Sides");
		}
		else
		{
			System.out.println("invalid Selection");
		} */
		Shape1 obj=Shape1.TRIANGLE;
		//System.out.println(obj.getClass().getSuperclass());
		System.out.println(obj.getSides());
	}

}
