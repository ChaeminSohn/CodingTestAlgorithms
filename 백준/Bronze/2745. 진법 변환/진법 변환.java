import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int base = sc.nextInt();
		int result = 0;
		int pow = 0;
		String[] arr = N.split("");
		for(int i = arr.length - 1; i >= 0; i--) {
			char c = arr[i].charAt(0);
			if(c >= 48 && c <= 57) {
				result += (c-48) * Math.pow(base, pow++); 
			}
			else if(c >= 65 && c <= 90)
				result += (c-55) * Math.pow(base, pow++);
			else
				break;
		}
		System.out.println(result);
	}
	
	
}