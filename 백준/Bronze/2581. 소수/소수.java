import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(bufferedReader.readLine());
        int max = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for(int i = min; i <= max ; i++) {
        	if(isPrimeNumber(i)) {
        		arr.add(i);
        		sum += i;
        	}
        }
        if(sum == 0)
        	System.out.println(-1);
        else {
        	System.out.println(sum);
        	System.out.println(arr.get(0));
        }
        
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
