import java.util.*;
public class Switch_Demo {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch=n.next().charAt(0);
		switch(ch)
		{
			case 'O':
				System.out.println("On_Duty");
				break;
			case'P':
				System.out.println("Attended Class");
				break;
			case'A':
				System.out.println(" not Attended Class");
				break;
			default:
				System.out.println("Invalid");
				break;
		
		}
		
	}

}
