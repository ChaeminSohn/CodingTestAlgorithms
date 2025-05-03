import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean[][] tbl = new boolean[100][100];
		int area = 0;
		
		for(int i = 0; i < num; i ++) {
			int x_start = sc.nextInt();
			int y_start = sc.nextInt();
			for(int x = 0;  x < 10; x++) {
				for(int y = 0; y < 10; y++) {
					tbl[x_start + x][y_start + y] = true;
				}
			}
		}
		for(boolean[] line : tbl) {
			for(boolean colored : line) {
				if(colored)
					area++;
			}
		}
		System.out.println(area);
	}
}