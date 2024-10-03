
class Sample
{
	int rollno;
	int marks;
	Sample(int num,int m)
	{
		System.out.println("Default Constructor");
		rollno=num;
		marks=m;
	}
}
public class constructor_demo {

	public static void main(String[] args) {
		
		Sample s=new Sample(78,33);
		System.out.println(s.marks);
		System.out.println(s.rollno);
		
	
	}

}
