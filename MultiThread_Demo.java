class Song extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Oh Rhaya");
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}
class Music extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++) {
		System.out.println("ARR");
			try {
				Thread.sleep(1000);} catch (InterruptedException e) {}
		}
	}
}

public class MultiThread_Demo {

	public static void main(String[] args) {
		
		Song s=new Song();
		Music m=new Music();
		s.start();
			try {Thread.sleep(500);} catch (InterruptedException e) {}
		m.start();
	}

}
