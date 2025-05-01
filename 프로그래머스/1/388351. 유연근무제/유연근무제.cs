using System;
using System.Linq;

public class Solution {
    public int solution(int[] schedules, int[,] timelogs, int startday) {
        int answer = 0;
        for(int i = 0; i < schedules.Count(); i++){
            int scheduledMinutes = (schedules[i] / 100) * 60 + (schedules[i] % 100);
            bool isAlwaysOnTime = true;
            for(int  j = 0 ; j < 7; j++){   
                if((j + startday) % 7 == 0 || (j + startday) % 7 == 6)
                    continue;
                int actualMinutes = (timelogs[i, j] / 100) * 60 + (timelogs[i, j] % 100);       
                if(scheduledMinutes + 10 < actualMinutes) 
                    isAlwaysOnTime = false;
            }
            if(isAlwaysOnTime) answer += 1;   
        }
        return answer;
    }
}