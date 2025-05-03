import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String str = sc.nextLine();
		ArrayList<Character> arr = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'c') {
				if (i + 1 < str.length()) {
					if (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-') {
						cnt++;
						i++;
						continue;
					}
				}
				cnt++;
			} else if (c == 's') {
				if (i + 1 < str.length()) {
					if (str.charAt(i + 1) == '=') {
						cnt++;
						i++;
						continue;
					}
				}
				cnt++;
			} else if (c == 'd') {
				if (i + 1 < str.length()) {
					if (str.charAt(i + 1) == '-') {
						cnt++;
						i++;
						continue;
					} else if (str.charAt(i + 1) == 'z') {
						if (i + 2 < str.length()) {
							if (str.charAt(i + 2) == '=') {
								cnt++;
								i += 2;
								continue;
							} else {
								cnt += 2;
								i++;
								continue;
							}
						} else {
							cnt += 2;
							i++;
							continue;
						}
					}
				}
				cnt++;
			} else if (c == 'z') {
				if (i + 1 < str.length()) {
					if (str.charAt(i + 1) == '=') {
						cnt++;
						i++;
						continue;
					}
				}
				cnt++;
			} else if (c == 'n') {
				if (i + 1 < str.length()) {
					if (str.charAt(i + 1) == 'j') {
						cnt++;
						i++;
						continue;
					}
				}
				cnt++;
			} else if (c == 'l') {
				if (i + 1 < str.length()) {
					if (str.charAt(i + 1) == 'j') {
						cnt++;
						i++;
						continue;
					}
				}
				cnt++;
			} else
				cnt++;
		}

		System.out.println(cnt);

	}
}