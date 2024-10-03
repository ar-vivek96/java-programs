class GrandFather
{
	int c;
	void print()
	{
		System.out.println("Grand Father");
	}
}
class Parent extends GrandFather
{
	int a;
	void display()
	{
		System.out.println("Parent");
	}
}
class Child extends Parent
{
	int b;
	void show()
	{
	System.out.println("Child");
	}
}	



public class inheritance_demo {

	public static void main(String[] args) {
		
		Child c=new Child();
		c.print();
		c.display();
		c.show();
		c.print();
		c.a=20;
		c.b=30;
		c.c=10;
		System.out.println(c.c);
		System.out.println(c.a);
		System.out.println(c.b);
		
	}

}
