import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] alphaCnt = new int[26];
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c >= 65 && c <= 90)
                alphaCnt[c - 65]++;
            else if(c >= 97 && c <= 122)
                alphaCnt[c - 97]++;
        }
        int num = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < alphaCnt.length; i++) {
        	if(alphaCnt[i] > num) {
        		num = alphaCnt[i];
        		arr.clear();
        		arr.add(i);
        	}
        	else if(alphaCnt[i] == num)
        		arr.add(i);
        }
        if(arr.size() > 1)
        	System.out.println("?");
        else {
        	char c = (char)('A' + arr.get(0));
        	System.out.println(c);

        }
    }
}