import java.io.*;
import java.util.ArrayList;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        while(n != -1) {
        	for(int i = 1; i < n; i++) {
        		if(n % i == 0) {
        			arr.add(i);
        			sum += i;
        		}
        	}
        	if(sum == n) {
        		System.out.print(n + " =");
        		for(int i : arr) {
        			if(i == 1)
        				System.out.print(" " + 1);
        			else
        				System.out.print(" + " + i);
        		}
        		
        	}
        	else
        		System.out.print(n + " is NOT perfect.");
        	System.out.println();
        	sum = 0;
        	arr.clear();
        	n = Integer.parseInt(bufferedReader.readLine());
        }

        
    }
}
