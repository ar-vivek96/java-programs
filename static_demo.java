class Student
{
	String Name;
	int age;
	static String Teacher;
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("Age: "+age);
		System.out.println("Teacher: "+Teacher);
	}
}
public class static_demo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		s1.Name="Vivek";
		s1.age=26;
		Student.Teacher="xavier";
		s2.Name="Vik";
		s2.age=23;
		
		
		s1.display();
		s2.display();

	}

}
