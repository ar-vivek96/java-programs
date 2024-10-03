class Counter
{
	private int count;
	
	
	public int getCount()
	{
		return count;
	}
	public synchronized void increment()
	{
		count =count+1;
	}
}
public class ThreadSyncronize {

	public static void main(String[] args) throws InterruptedException {
		
		Counter c=new Counter();
		Thread t1=new Thread(()->
		{
			for(int i=0;i<100;i++) {
				c.increment();
			try {Thread.sleep(1000);} catch (InterruptedException e){}  //lambda Expression
			}
		});
		t1.start();
		try {Thread.sleep(500);} catch (InterruptedException e){}
		Thread t2=new Thread(()->
		{
			for(int i=0;i<100;i++) {
				c.increment();
			try {Thread.sleep(1000);} catch (InterruptedException e){}
			}
		});
		
		t2.start();
	/*
		System.out.println(t1.MAX_PRIORITY);
		System.out.println(t2.getPriority());
		System.out.println("Good Evening");*/	
		t1.join();
		t2.join();
		System.out.println(c.getCount());
	}

}
