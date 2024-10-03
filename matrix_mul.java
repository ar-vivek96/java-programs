
public class matrix_mul {

	public static void main(String[] args) {
		
		int a[][]= { {2,3},
					{4,5}
		};
		int b[][]= {
					{1,2,3},
					{4,5,6}
		};
		int c[][]=new int [a.length][b[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];	//00*00-00*00-01*10
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println(" ");
		}

	}

}
