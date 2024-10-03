
public class StringInJava {

	public static void main(String[] args) {
		
		StringBuffer obj=new StringBuffer("MoM");
		obj.setCharAt(0, 'j');
		
		System.out.println(obj);
		System.out.println(obj.lastIndexOf("M"));

	}

}
