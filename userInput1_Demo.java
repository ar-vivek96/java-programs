import java.io.*;

public class userInput1_Demo {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter Msg");
		int str=Integer.parseInt(br.readLine());
		System.out.println(str+17);
	}

}
