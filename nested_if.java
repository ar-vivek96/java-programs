
public class nested_if {

	public static void main(String[] args) {
		
		int mark=90;
		if(mark>=35)
		{
			if(mark>=80)
			{
				System.out.println("Leader");
			}
			else
			{
				System.out.println("Not Eligible");
			}
		}
		else
		{
			System.out.println("Sorry your failed");
		}
		
		System.out.println("Thank you");

	}

}
