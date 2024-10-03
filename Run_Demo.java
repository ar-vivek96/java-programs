
public class Run_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(()->
		{
			for(int i=0;i<5;i++) {
			System.out.println("Spark");
			try {Thread.sleep(1000);} catch (InterruptedException e){}  //lambda Expression
			}
		});
		t1.start();
		try {Thread.sleep(500);} catch (InterruptedException e){}
		Thread t2=new Thread(()->
		{
			for(int i=0;i<5;i++) {
			System.out.println("Yuvan");
			try {Thread.sleep(1000);} catch (InterruptedException e){}
			}
		},"First Thread");
		
		t2.start();
	
		System.out.println(t1.MAX_PRIORITY);
		System.out.println(t2.getPriority());
		t1.join();
		t2.join();
		System.out.println("Good Evening");
	}

}
