
public class String_Demo {

	public static void main(String[] args) {
		
		String s=new String();
		String s1="bello";
		String s2="aello";
		String s3="  Hello   ";
		System.out.println(s1.length());
		System.out.println(s1.charAt(0));
		System.out.println(s1.concat("World"));
		System.out.println(s1.contains("lo"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.indexOf('H'));
		System.out.println(s1.hashCode());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.compareTo(s2));
		String ss=s3.trim();
		String s4="Hello World";
		System.out.println(ss.length());
		System.out.println(s4.replace("Hel","cel"));
		System.out.println(s4.substring(0,5));
		String str="ARR,U1,ANI";
		String[] s6=str.split(",");
		for(String x:s6)
		{
		System.out.println(x);
		}
		System.out.println(s4.lastIndexOf('l'));
		String s7="aeiou";
		char ch[]=s7.toCharArray();
		for(char c:ch)
		{
			System.out.println(c);
		}
		String st=String.valueOf(ch);
		System.out.println(st);
	}
		

}
