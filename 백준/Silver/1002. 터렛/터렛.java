import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());
        double longerR;
        double shorterR;
        String line;
        StringTokenizer st;
       
       
        while(T-- > 0) {
        	line = bufferedReader.readLine();
        	st = new StringTokenizer(line);
        	double x1 = Integer.parseInt(st.nextToken());
        	double y1 = Integer.parseInt(st.nextToken());
        	double r1 = Integer.parseInt(st.nextToken());
        	double x2 = Integer.parseInt(st.nextToken());
        	double y2 = Integer.parseInt(st.nextToken());
        	double r2 = Integer.parseInt(st.nextToken());
         	if(x1 == x2 && y1 == y2) {
        		if(r1 == r2) 
       				System.out.println(-1);
        		else 
        			System.out.println(0);
        		continue;
        	}
        	double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1-y2, 2));
        	if(r1 >= r2) {
        		longerR = r1; shorterR = r2;
        	}
        	else {
        		longerR = r2; shorterR = r1;
        	}
   
        	if(distance > (r1 + r2)) {
        		System.out.println(0);
        	}
        	else if(distance == (r1 + r2)) {
        		System.out.println(1);
        	}
        	else {
        		if(longerR > distance + shorterR)
        			System.out.println(0);
        		else if(longerR == distance + shorterR)
        			System.out.println(1);
        		else
        			System.out.println(2);
        	}
        }
        bufferedReader.close();
    }
}