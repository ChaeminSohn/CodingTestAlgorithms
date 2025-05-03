import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		StringTokenizer st = new StringTokenizer(line);
		BigInteger bigNum1 = new BigInteger(st.nextToken());
		BigInteger bigNum2 = new BigInteger(st.nextToken());
		BigInteger result = bigNum1.add(bigNum2);
		
		System.out.println(result);
		br.close();
	}
}

