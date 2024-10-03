
public class Wrpper_demo {

	public static void main(String[] args) {
		
		int i=5;
	/*	System.out.println(i);
		Integer obj=new Integer(5);            //boxing
		System.out.println(obj);
		
		Integer obj1=5;		//Auto Boxing
		System.out.println(obj1);
		int val=obj1.intValue();       // unboxing 
		int val1=obj1;					//auto-unboxing
		System.out.println(val);
		*/
		double a=22.9;
		System.out.println(a);
		Double dd=new Double(22.9);   //Boxing
		System.out.println(dd);
		
		Double dd1=22.9;    //Auto Boxing
		double d=dd1.doubleValue();     //unboxing
		System.out.println(d);
		
	}

}
