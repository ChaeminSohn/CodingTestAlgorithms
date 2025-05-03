import java.util.Scanner;
import java.util.Stack;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numberOfCases = sc.nextInt();
		int numberOfQuarters = 0, numberOfDimes = 0,
				numberOfNickels = 0, numberOfPennies = 0;
		for(int i = 0; i < numberOfCases; i++) {
			int changeInCents = sc.nextInt();
			numberOfQuarters = changeInCents / 25;
			changeInCents %= 25;
			numberOfDimes = changeInCents / 10;
			changeInCents %= 10;
			numberOfNickels = changeInCents /5;
			changeInCents %= 5;
			numberOfPennies = changeInCents;
			
			System.out.println(numberOfQuarters + " " + numberOfDimes + " "
			+ numberOfNickels + " " + numberOfPennies);
		}
	}
}