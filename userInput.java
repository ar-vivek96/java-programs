import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userInput {

	public static void main(String[] args) throws IOException {

		InputStreamReader is=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("Enter Any mag");
		Double num=Double.parseDouble(br.readLine());
		System.out.println("Your Msg="+num);
		double val=17+num;
		System.out.println(val);
		
	}

}
