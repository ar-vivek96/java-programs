import java.util.*;
public class twoDimen_demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Row :");
		int Row=sc.nextInt();
		System.out.println("Enter Colum");
		int Clm=sc.nextInt();
		int a[][]=new int[Row][Clm];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
		System.out.println("ENter Elements a["+i+"]"+"["+j+"] :");
			a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
		}
	}

}
