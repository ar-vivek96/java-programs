import java.util.*;
public class input_demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age=sc.nextInt();
		System.out.println("Enter Temp:");
		double temp=sc.nextDouble();
		System.out.println("Enter your Name:");
		String Name=sc.next();
		System.out.println("Enter Character:");
		char c=sc.next().charAt(0);
		System.out.println("Age: "+age);
		System.out.println("Temp: "+temp);
		System.out.println("Name: "+Name);
		System.out.println("Char:"+c);
		sc.close();
	}

}
