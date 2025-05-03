import java.io.*;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        for(int i = 2; i <= N/2 ; i++) {
        	if(N % i ==0) {
        		N /= i;
        		arr.add(i);
        		i--;
        	}
        }
        for(int i : arr) {
        	System.out.println(i);
        }
        if(N != 1)
           System.out.println(N);
        
    }
}
