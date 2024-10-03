class Test1
{ 
	public void test()
	{
		System.out.println("in test");
	}
	
}
public class anonymusInner_Demo {

	public static void main(String[] args) {
		
		Test1 n=new Test1() {
			public void test()
			{
				System.out.println("in new Test");
			}
		};
		n.test();

	}

}
