import java.io.*;

class Save implements Serializable
{
	int i;
}
public class serializable_Demo {

	public static void main(String[] args) throws Exception {

		Save obj=new Save();
		obj.i=10;
		System.out.println(obj.i);
		File f=new File("myfile.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		FileInputStream fis =new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Save obj2=(Save) ois.readObject(); 
		System.out.println(obj2.i);
		
	}

}
