import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		boolean isPel = true;
		String str = sc.nextLine();
		for(int i = 0; i <= str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length() -i - 1))
				isPel = false;	
		}
		if(isPel)
			System.out.println(1);
		else 
			System.out.println(0);
	}
}