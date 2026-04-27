class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;    
        
        while(true){
            
            int minBill = 0;
        int maxBill = 0;
            
        int minWallet = 0;
        int maxWallet = 0;
            
        if(wallet[0] > wallet[1]){
            maxWallet = wallet[0];
            minWallet = wallet[1];
        }else if( wallet[0] < wallet[1]){
            maxWallet = wallet[1];
            minWallet = wallet[0];
        }else{
            maxWallet = wallet[0];
            minWallet = wallet[1]; 
        }
            
        if(bill[0] > bill[1]){
            maxBill = bill[0];
            minBill = bill[1];
        }else if( bill[0] < bill[1]){
            maxBill = bill[1];
            minBill = bill[0];
        }else{
            maxBill = bill[0];
            minBill = bill[1]; 
        }    
            
            if(minBill > minWallet || maxBill > maxWallet){
                if(bill[0] > bill[1])
                    bill[0] = bill[0] / 2;
                else
                    bill[1] = bill[1] / 2;
                
                answer++;
            } else {
                break;
            }
        }
        return answer;
    }
}