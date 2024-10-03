abstract class Employee
{
	abstract void display();
}

class Servent extends Employee
{

	@Override
	void display() {
	System.out.println("Abstract method in derived Class");		
	}
	
}
public class Abstract_Demo {

	public static void main(String[] args) {
		Servent n=new Servent();
		n.display();
		
		

	}

}
