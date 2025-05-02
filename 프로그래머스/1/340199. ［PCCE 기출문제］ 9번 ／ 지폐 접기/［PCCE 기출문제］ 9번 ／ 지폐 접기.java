class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletBigIndex =  0;
        int walletSmallIndex = 0;
        int billBigIndex = 0;
        int billSmallIndex = 0;
        if(wallet[0] > wallet[1]){
            walletSmallIndex = 1;
        }
        else{
            walletBigIndex = 1;
        }
        
        if(bill[0] > bill[1]){
            billSmallIndex = 1;
        }
        else{
            billBigIndex = 1;
        }
        
       while(wallet[walletBigIndex] < bill[billBigIndex] || wallet[walletSmallIndex] < bill[billSmallIndex]){
            bill[billBigIndex] /= 2;
           
           if(bill[billBigIndex] < bill[billSmallIndex]){
               int temp = billBigIndex;
               billBigIndex = billSmallIndex;
               billSmallIndex = temp;
           }
         answer += 1;
       }
        return answer;
    }
    
}