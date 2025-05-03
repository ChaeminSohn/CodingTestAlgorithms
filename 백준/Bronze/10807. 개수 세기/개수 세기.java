import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int num = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num)
                cnt++;
        }
        System.out.println(cnt);
    }
}