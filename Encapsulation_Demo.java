class Demo
{
	 private int age=22;
	 int mark=75;
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		this.age=a;
		
	}
	
}


public class Encapsulation_Demo {
	public static void main(String args[])
	{
		Demo n=new Demo();
		n.setAge(50);
		System.out.println(n.getAge());
		
	}

}
