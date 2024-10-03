class Abcd
{
	int n1;
	int n2;
	int res;
	Abcd(int a,int b)
	{
		n1=a;
		n2=b;
	}
	Abcd()
	{
		System.out.println("Default Constructor");
	}
	
	void display()
	{
		res=n1+n2;
		System.out.println("REsult "+res);
	}
}
public class Constructor_Demo1 {

	public static void main(String[] args) {
		
		Abcd c=new Abcd(10,20);
		Abcd c1=new Abcd();
		c.display();
		c1.display();
	}

}
