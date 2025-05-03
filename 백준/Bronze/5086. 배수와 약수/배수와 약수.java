import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while (true) {
			try {
				line = br.readLine();
			}catch (IOException e) {
				break;
			}

			StringTokenizer st = new StringTokenizer(line);
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			if(num1 == num2)
				break;
			if(num2 % num1 == 0) 
				System.out.println("factor");
			else if(num1 % num2 == 0) 
				System.out.println("multiple");
			else 
				System.out.println("neither");
		}
		br.close();
	}
}
