using System;
using System.Collections.Generic;


public class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Queue<int> servers = new Queue<int>(); 
        for(int i = 0; i < 24; i++){
            while(i >= k && servers.Contains(i - k)){
                servers.Dequeue();
            }
            
            while(players[i] >= (servers.Count + 1) * m){
                servers.Enqueue(i);
                answer += 1;
            }  
        }
        return answer;
    }
}