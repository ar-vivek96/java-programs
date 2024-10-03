class Addition
{
	int sum=0;
	public int add(int...i )
	{
		for(int x:i)
		{
			sum=sum+x;
		}
		return sum;
		
	}
}
public class VarArgs_demo {

	public static void main(String[] args) {
		
		Addition ad=new Addition();
		int res=ad.add(1,2,3,4,5);
		System.out.println(res);

	}

}
