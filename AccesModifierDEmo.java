class outer 
{
	public void Method() {
	AccesModifierDEmo n=new AccesModifierDEmo();
	n.show();
	}
}
public class AccesModifierDEmo {

	public static void main(String[] args) {
		
		outer obj=new outer();
		obj.Method();
	
	}	
		public void show()
		{
			System.out.println("in show method");
		}
}


