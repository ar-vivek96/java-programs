
import java.util.*;
public class mat_Add {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of row in m1");
		int row1=sc.nextInt();
		System.out.println("Enter no of row in m2");
		int row2=sc.nextInt();
		System.out.println("Enter no of col in m1");
		int col1=sc.nextInt();
		System.out.println("Enter no of col in m2");
		int col2=sc.nextInt();
		if(row1==row2&&col1==col2)
		{
		int a[][]=new int [row1][col1];
		int b[][]=new int[row2][col2];
		int c[][]=new int[row1][col1];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter ELements a["+i+"]"+"b["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println("Enter ELements b["+i+"]"+"b["+j+"]:");
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println("");
		}
		
		}
		else
		{
			System.out.println("Martix Size are not equal");
		}
		
		
	}

}
