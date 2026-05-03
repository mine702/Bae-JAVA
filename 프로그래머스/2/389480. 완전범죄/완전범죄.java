import java.util.*;

class Solution {
    public int solution(int[][] info, int n, int m) {
        int[] dp = new int[m];
        
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;
        
        for(int[] value : info){
            int a = value[0];
            int b = value[1];
            
            for(int i = m - 1; i >= 0; i--){
                if(dp[i] == Integer.MAX_VALUE)
                    continue;
                
                if(b + i < m){
                    dp[b+i] = Math.min(dp[b+i] , dp[i]);
                }
                
                dp[i] = dp[i] + a;
            }
        }
        
        int answer = Integer.MAX_VALUE;
        for(int i = 0 ; i < dp.length; i++){
            if(dp[i] < n && dp[i] < answer)
                answer = dp[i];
        }
        
        if(answer == Integer.MAX_VALUE)
            answer = -1;
        return answer;
    }
}