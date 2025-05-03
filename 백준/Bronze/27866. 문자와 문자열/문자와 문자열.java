import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("");
        int ctxt = sc.nextInt();
        
        System.out.println(str[ctxt-1]);
        
    }
}