
public class MultipleThreading {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t2=new Thread(
				()->
				{
					for(int i=0;i<5;i++)
					{
					System.out.println("usure");
					try {
						Thread.sleep(1000);} catch (InterruptedException e) {}
					}
				
			});
		Thread t1=new Thread(
				()->
				{
					for(int i=0;i<5;i++)
					{
					System.out.println("Arr");
					try {Thread.sleep(1000);} catch (InterruptedException e){}
					}
				
			});
		t1.start();
		try {Thread.sleep(500);} catch (InterruptedException e) {}
		t2.start();
		System.out.println(t1.getName());
		t1.join();
		t2.join();
		
		System.out.println("Good Evening");
		
		

	}

}
