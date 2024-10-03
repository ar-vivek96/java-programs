import java.util.*;

public class set_demo {

	public static void main(String[] args) {
		
		Set<Integer> s=new TreeSet<>();
		s.add(10);
		s.add(50);
		s.add(17);
		s.add(28);
		s.add(10);
		int v=s.size();
		System.out.println(v);
		System.out.println(s);
		s.remove(50);
		Iterator it=s.iterator();
		while(it.hasNext())
		System.out.print(it.next()+" ");

	}

}
