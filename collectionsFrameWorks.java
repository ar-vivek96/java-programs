import java.util.*;
import java.util.Collection;
public class collectionsFrameWorks {

	public static void main(String[] args) {

		ArrayList<Integer> val=new ArrayList<Integer>();
		val.add(20);
		val.add(50);
		val.add(40);
		val.add(20);
		Collections.sort(val);
		val.add(1, 30);
		System.out.println(val.size());
		
		System.out.println(val);
		System.out.println(val.get(0));
		System.out.println(val.set(0, 10));
		while(val.contains(20))
		val.remove(20);		
		System.out.println(val);
		System.out.println(val);
		

	}

}
