interface block
{
	int  age=20;
	public void display();
	public void show();
}
interface lock
{
	void key1();
	void lockkey();
}
class unlock
{
	void newKey()
	{
		System.out.println("Unlock Key");
	}
}

class key extends unlock implements block,lock
{

	@Override
	public void display() {
		{
			System.out.println("in Display");
		}
		
	}

	@Override
	public void show() {
		{
			System.out.println("In Show");
		}
		
	}

	@Override
	public void key1() {
		System.out.println("here is a key");
		
	}

	@Override
	public void lockkey() {
		
		System.out.println("Lock using key");
		
	}
	
}
public class interface_Demo {

	public static void main(String[] args) {
		
		key u=new key();
		u.display();
		u.show();
		u.key1();
		u.lockkey();
		System.out.println(block.age);

	}

}
