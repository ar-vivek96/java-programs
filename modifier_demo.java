class Demo1
{
	protected int age=22;

public void show()
{
	System.out.println(age);
}

}

public class modifier_demo extends Demo1 {

	public static void main(String[] args) {
		
		Demo1 n=new Demol();
		modifier_demo obj=new modifier_demo();
		n.show();
		System.out.println(n.age);

	}

}
