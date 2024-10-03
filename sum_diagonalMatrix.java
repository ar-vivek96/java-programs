
public class sum_diagonalMatrix {

	public static void main(String[] args) {
		
		int a[][]= {
					{1,2},
					{3,5}
		};
			int i,j;
			int pd=0;
			int sd=0;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++) {
				
				if(i==j)
				{
					pd=pd+a[i][j];
				}
				if(i+j==a.length-1)
				{
					sd=sd+a[i][j];
				}
			}
		}
		System.out.println(pd);
		System.out.println(sd);

	}

}
