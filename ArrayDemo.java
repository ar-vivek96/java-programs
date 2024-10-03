import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
	/*	int a[]=new int[5];
		String b[]= {"RAhul","Rohit","Kishan"};
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
*/
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter Elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		
		}
		System.out.println("Max:"+max);
		}

}
