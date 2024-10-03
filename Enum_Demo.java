enum Shape{
	CIRCLE,TRIANGLE(3),SQUARE;
	private int sides;
	private Shape()
	{
		System.out.println("Constructor Called");
	}

	private Shape(int i) {
		sides=i;
		
	}
	public int getSides()
	{
		return sides;
	}
}

public class Enum_Demo {
	

	public static void main(String args[])
	{
		Shape b=Shape.TRIANGLE;
		System.out.println(b.getSides());;
	
	/*	System.out.println(b.ordinal());
		Shape[] obj =Shape.values();
		for(Shape x:obj)
		{
			System.out.println(x);
		}
		*/
	/*	if(b==Shape.CIRCLE)
		{
			System.out.println("NO Sides");
		}
		else if(b==Shape.TRIANGLE)
		{
			System.out.println("Three Sides");
		}
		else if(b==Shape.SQUARE)
		{
			System.out.println("FOUR SiDES");
		}
		else
		{
			System.out.println("No Shape");
		}
		*/
		System.out.println(b.getClass().getSuperclass());
		
	}
}
