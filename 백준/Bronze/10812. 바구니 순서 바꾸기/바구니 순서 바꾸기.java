import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[sc.nextInt()];
    	int trials = sc.nextInt();
    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = i+1;
    	}
    	while(trials > 0) {
    		int begin = sc.nextInt();
    		int end = sc.nextInt();
    		int mid = sc.nextInt();
    		int[] arrcpy = arr.clone();
    		for(int i = begin - 1; i < end ; i++) {
    			if(i + (mid - begin) >= end)
    				arr[i] = arrcpy[mid - end + i -1];
    			else
    				arr[i] = arrcpy[i + (mid - begin)];
    		} 
    		trials--;
    	}
    	for(int i = 0; i < arr.length; i++){
    	    System.out.print(arr[i] + " ");
        }
    }
}
