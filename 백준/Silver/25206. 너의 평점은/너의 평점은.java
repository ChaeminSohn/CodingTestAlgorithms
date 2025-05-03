import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		double scoreTotal = 0, gradeTotal = 0;
		int cnt = 20;
		while (cnt > 0) {
			String str = sc.nextLine();
			String[] strArr = str.split(" ");
			double grade = Double.parseDouble(strArr[1]);
			String score = strArr[2];
			gradeTotal += grade;
			switch (score) {
			case "A+":
				scoreTotal += grade * 4.5;
				break;
			case "A0":
				scoreTotal += grade * 4.0;
				break;
			case "B+":
				scoreTotal += grade * 3.5;
				break;
			case "B0":
				scoreTotal += grade * 3.0;
				break;
			case "C+":
				scoreTotal += grade * 2.5;
				break;
			case "C0":
				scoreTotal += grade * 2.0;
				break;
			case "D+":
				scoreTotal += grade * 1.5;
				break;
			case "D0":
				scoreTotal += grade * 1.0;
				break;
			case "F":
				scoreTotal += grade * 0.0;
				break;
			case "P":
				gradeTotal -= grade;
				break;
			}
			cnt--;
		}
		System.out.println(scoreTotal / gradeTotal);

	}

}