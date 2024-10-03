import java.util.*;

public class map_Demo {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap<>();
		m.put("Anbu", 90);
		m.put("Naveen",98);
		m.put("Sisin",100);
		m.put("Surya",97);
		m.put("vivek",90);
		m.put("Vivek", null);
		System.out.println(m);
		System.out.println(m.get("Surya"));
		System.out.println(m.keySet());
		for(String key:m.keySet())
		{
			System.out.println(key +":"+m.get(key));
		}
	//	System.out.println(m.values());
		
		

	}

}
