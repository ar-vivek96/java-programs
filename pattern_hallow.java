
public class pattern_hallow {

	public static void main(String[] args) {
		
		int i,j;
		int row=4;
		int col=4;
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				if(i==0||i==row-1||j==0||j==col-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
