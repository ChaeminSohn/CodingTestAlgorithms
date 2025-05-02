import java.util.Arrays;
import java.util.Collections; 

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int maxSize = 0;
        int h = park.length;
        int w = park[0].length;
        int[][] dp = new int[h][w];
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                String rect = park[i][j];
                
                if(!rect.equals("-1")){
                    dp[i][j] = 0;
                }
                else if(i == 0 || j == 0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                }
                if(dp[i][j] > maxSize) maxSize = dp[i][j];
            }
        }
                                        
       
        if(maxSize > 0){
             Arrays.sort(mats); 


            for (int k = mats.length - 1; k >= 0; k--) {
                int mat_size = mats[k]; 
                if (mat_size <= maxSize) { 
                    answer = mat_size;   
                    break;              
                }
            }
        }
            
        
        return answer;
    }
}





    
    