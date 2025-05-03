import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 1;;
        for(int i = 0; i < num && i >= 0;) {
        	for(int j = 1; j <= num+i; j++) {
        		if(j < num-i )
        			System.out.print(" ");
        		else 
        			System.out.print("*");
        	}
        	System.out.println();
        	if(cnt < num)
        		i++;
        	else
        		i--;
        	cnt++;
        		
        	
        }
        
    }
}