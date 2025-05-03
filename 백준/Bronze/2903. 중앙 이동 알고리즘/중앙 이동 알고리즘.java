import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numberOfProcess = sc.nextInt();
		int dotsOnEdge = 1 + (int)Math.pow(2, numberOfProcess);
		int numberOfDots = (int)Math.pow(dotsOnEdge, 2);
		System.out.println(numberOfDots);
		
	}
}