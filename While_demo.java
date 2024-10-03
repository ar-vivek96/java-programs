
public class While_demo {

	public static void main(String[] args) {
		int n=5,sum=0,i=0;
		
	/*	while(i<=n)
		{
			sum+=i;
			i++;                         //Entry Control Loop
		}
		System.out.println("SUM: "+sum);
*/
		
		do
		{
			sum=sum+i;
			i++;
		}while(i<=n);
		System.out.println("sum: "+sum);             //Exit Control Loop
	}

}
