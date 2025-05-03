import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int line = 1;
		int molecular = 1;
		int denominator = 1;
		while(--x > 0) {
			if(molecular == 1) {
				if(line % 2 == 1) {
					denominator++;
					line++;
				}
				else {
					denominator--;
					molecular++;
				}
			}
			else if(denominator == 1) {
				if(line % 2 == 0) {
					molecular++;
					line++;
				}
				else {
					molecular--;
					denominator++;
				}
			}
			else {
				if(line % 2 == 0) {
					molecular++;
					denominator--;
				}
				else {
					molecular--;
					denominator++;
				}
			}
		}
		System.out.println(molecular + "/" + denominator);
	}
}

