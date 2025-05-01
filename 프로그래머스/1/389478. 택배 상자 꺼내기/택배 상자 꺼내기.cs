using System;

public class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;

        while(num <= n){
            answer += 1;
            if(num % w == 0) {
                num += 1;
            }
            else {
                num += (2 * (w - num % w) + 1);
            }     
        }
        return answer;
    }
    
}