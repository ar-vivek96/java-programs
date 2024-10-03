import java.util.*;

public class Arr_Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> val=new ArrayList<>();
		val.add(10);
		val.add(20);
		val.add(30);
		val.add(0,5);
		
		Iterator it=val.iterator();
		while(it.hasNext())
		System.out.print(it.next()+" ");
		for(int x:val)
		{
				System.out.println(x);
		}
		
	}
	
}
