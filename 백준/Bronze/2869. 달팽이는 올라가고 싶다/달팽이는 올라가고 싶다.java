import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int daysToFinish;
		if((V - A) < (A - B)) {
			if(A >= V)
				daysToFinish = 1;
			else 
				daysToFinish = 2;
		}
		else {
			if((V - A) % (A - B) == 0)
				daysToFinish = (V - A) / (A - B) + 1;
			else 
				daysToFinish = (V - A) / (A - B) + 2;
		}
				
		
		System.out.println(daysToFinish);
		br.close();
	}
}

