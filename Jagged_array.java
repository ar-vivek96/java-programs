import java.util.*;
public class Jagged_array {

	public static void main(String[] args) {
	int a[][]= new int[2][];
	a[0]=new int[2];
	a[1]=new int[3];
		
		Scanner sc=new Scanner(System.in);
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("Enter The Elements a["+i+"]["+j+"]:");
				a[i][j]=sc.nextInt();
			}
		}
			
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	

	}

}
