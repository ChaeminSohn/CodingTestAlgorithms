import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int cnt = 0;
        String line = bufferedReader.readLine();
        StringTokenizer st = new StringTokenizer(line);
       while (n-- > 0) {
    	   int num = Integer.parseInt(st.nextToken());
    	   if(isPrimeNumber(num)) {
    		   cnt++;
    	   }
        }
       System.out.println(cnt);
        
    }
    
    public static boolean isPrimeNumber(int n) {
    	if(n <= 1)
    		return false;
    	else
    	{
    		for(int i = 2; i <= n/2; i++ ) {
    			if(n % i == 0)
    				return false;
    		}
    	}
    	return true;
    }
}
