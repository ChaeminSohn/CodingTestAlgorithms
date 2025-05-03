import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int max = -1;
		int idx_X = 0, idx_Y = 0;
		int y = 0;
		while(y < 9) {
			y++;
			String line = sc.nextLine();
			String[] arr = line.split(" ");
			for(int x = 0; x < arr.length; x++) {
				if(Integer.parseInt(arr[x]) > max) {
					max = Integer.parseInt(arr[x]);
					idx_X = x + 1;
					idx_Y = y;
				}
			}
		}
		System.out.println(max);
		System.out.println(idx_Y + " " + idx_X);
	}
}