import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int line = 1;
		int largestNumInLine = 1;
		while(true) {
			largestNumInLine += (6*(line-1));
			if(num / largestNumInLine == 0|| num == largestNumInLine) {
				break;
			}
			line++;
		}
		System.out.println(line);
		
	}
}
