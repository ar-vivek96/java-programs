//hierarchical inheritance
class A
{
	void display()
	{
		System.out.println("Parent");
	}
	
}
class C1 extends A
{
	void show()
	{
		System.out.println("Child 1");
	}
	
}
class C2 extends A
{
	void Print()
	{
		System.out.println("Child 2");
	}
	
}
public class inheri_Demo {

	public static void main(String[] args) {
		
		C1 obj=new C1();
		obj.show();
		obj.display();
		C2 o=new C2();
		o.display();
		o.Print();
	}

}
