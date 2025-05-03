import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        while(cnt > 0) {
        	int std = sc.nextInt();
        	int[] scores = new int[std];
        	int sum = 0;
        	for(int i = 0; i < std; i ++) {
        		scores[i] = sc.nextInt();
        		sum += scores[i];
        	}
        	double avg = (double)sum/std;
        	int overAvg = 0;
        	for(int score : scores) {
        		if(score > avg)
        			overAvg++;	
        	}
        	System.out.print(String.format("%.3f", (double)overAvg/std*100));
        	System.out.println("%");
            cnt--;
        }
        
    }
}