
public class enhanced_for {

	public static void main(String[] args) {
	/*	
		int a[]= {1,2,3,4,5,6,7};
		for(int x:a)
		{
			System.out.print(" "+x);
		}
*/
		int a[][]= {
					{1,2,3},
					{4,5,6},
					{7,8,9}
		};
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(" "+y);
			}
			System.out.println();
		}
	}

}
