import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char[][] arr = new char[5][15];
		for(int i = 0; i < arr.length; i++) {
			String[] line = sc.nextLine().split("");
			for(int j = 0; j < line.length; j++)
					arr[i][j] = line[j].charAt(0);
		}
		
		for(int j = 0; j < arr[0].length; j++) {
			for(int i = 0; i < arr.length; i++) {
				if(arr[i][j] != 0)
					System.out.print(arr[i][j]);
			}
		}
	}
}