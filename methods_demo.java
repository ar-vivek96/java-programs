
public class methods_demo {
	public static void add(int a,int b)
	{
		 int c=a+b;
		 System.out.println("c :"+c);
		
	}
	public static int add1(int a,int b)
	{
		int d=a+b;
		return d ;
	}

	public static void main(String[] args) {
		
		add(3,5);
		System.out.println("c is print");
		
		int res=add1(2,5);
		res=res*5;
		System.out.println(res);
	}
	

}
