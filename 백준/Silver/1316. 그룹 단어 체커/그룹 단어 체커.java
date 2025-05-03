import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int cnt = sc.nextInt();
		sc.nextLine();
		while (cnt > 0) {
			boolean isGroup = true;
			int[] alpList = new int[26];
			String str = sc.nextLine();
			char temp = str.charAt(0);
			int idx = temp - 'a';
			alpList[idx]++;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) != temp) {
					temp = str.charAt(i);
					idx = temp - 'a';
					alpList[idx]++;
				}
			}
			for (int i : alpList) {
				if (i > 1) {
					isGroup = false;
					break;
				}
			}
			if(isGroup)
				total++;
			cnt--;
		}
		sc.close();
		System.out.println(total);
	}
}
