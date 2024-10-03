class AppForm
{
	private String name;
	int rollno;
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("rollno :"+rollno);
	}
	public String getValue()
	{
		return name;
	}
	public void setValues(String str,int n)
	{
		name=str;
		rollno=n;
	}
}
public class class_Demo {

	public static void main(String[] args) {
		
		AppForm a=new AppForm();
		a.setValues("vivek", 121);		
		a.display();
		AppForm b=new AppForm();
		b.setValues("Anbu",122);
		b.display();

		String c=b.getValue();
		System.out.println(c);
	}

}
