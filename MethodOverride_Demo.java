class Parent1
{
	void Show()
	{
		System.out.println("Child");
	}
	
}
class Child1 extends Parent1
{
	void Show()
	{
		System.out.println("Child");
	}
	
}
public class MethodOverride_Demo {

	public static void main(String[] args) {
		
		Child1 c=new Child1();
		c.Show();

	}

}
