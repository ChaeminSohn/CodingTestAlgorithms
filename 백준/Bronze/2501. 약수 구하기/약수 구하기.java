import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String atgs[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		ArrayList<Integer> aliquots = new ArrayList<>();
		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				aliquots.add(i);

			}
		}
		if(aliquots.size() < K)
			System.out.println(0);
		else
			System.out.println(aliquots.get(K-1));
	}
}
