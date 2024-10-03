
public class array_Demo {

	public static void main(String[] args) {
		
		boolean[] rollno=new boolean[20];
		rollno[0]=true;
		rollno[1]=false;
		rollno[2]=false;
		rollno[3]=true;
		rollno[19]=false;
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println(rollno[i]);
		}
		
	}

}
