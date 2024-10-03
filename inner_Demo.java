class Outer
{
public void getAccess()
	{
		
	 class Inner
	{
		public void show()
		{
			System.out.println("inner Class");
		}

	}
		Inner in =new Inner();
		in.show();
	
	}

}
public class inner_Demo {

	public static void main(String[] args) {
		
		/*Outer out=new Outer();                   //Nested Inner Class
		Outer.Inner obj= out.new Inner();
		obj.show();
		*/
	/*	Outer.Inner obj=new Outer.Inner();          //Static inner Class
		obj.show();*/
		Outer out =new Outer();
		out.getAccess();
	}

}
