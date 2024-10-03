class OverLoad
{
	int n1;
	int n2;
	int res;
void sum(int a,int b)
{
	n1=a;
	n2=b;
	res=n1+n2;
	System.out.println("Res "+res);
}
void sum(double a,double b)
{
	n1=(int)a;
	n2=(int)b;
	res=(int)(a+b);
	System.out.println("Res "+res);
}
void sum(int a,double b)
{
	n1=a;
	n2=(int)b;
	res=(int)(a+b);
	System.out.println("Res "+res);
	
}
	
}


public class poly_Demo {

	public static void main(String[] args) {
		
		OverLoad o=new OverLoad();
		o.sum(20,10);
		o.sum(20.5, 10.5);
		o.sum(20,10.5); 
	}

}
