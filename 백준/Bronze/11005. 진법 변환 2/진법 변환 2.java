import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int B = sc.nextInt();
		Stack<Character> result = new Stack<>();
		while(N != 0) {
			int remain = N % B;
			if(remain >= 10) {
				result.push((char)(remain + '7'));
			}
			else 
				result.push((char)(remain + '0'));
				
			N /= B;
		}
		while(!result.empty()){
			System.out.print(result.pop());
		}
	}
}