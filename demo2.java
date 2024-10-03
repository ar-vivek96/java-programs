class This1
{
	int n1;
	int n2;
	void getData(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
	}
	void display()
	{
		System.out.println(n1);
		System.out.println(n2);
	}
	
}
public class demo2 {

	public static void main(String[] args) {
		
		This1 o=new This1();
		o.getData(20,30);
		o.display();
	}	

}
