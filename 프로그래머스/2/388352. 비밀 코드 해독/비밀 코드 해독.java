import java.util.*;
import java.io.*;

class Solution {
    public static int[] output;
    public static int count;
    public int solution(int n, int[][] q, int[] ans) {
        output = new int[5];
        count = 0;
        
        com(1, 0, n, q, ans);
        int answer = count;
        return answer;
    }
    
    public void com(int start, int depth, int end, int[][] q, int[] ans){
        if(depth == 5){
            for(int i = 0 ; i < q.length; i++){
                int[] qs = q[i];
                int cnt = 0;
                for(int j = 0; j < 5; j++){
                    for(int k = 0; k < 5; k++){
                        if(qs[j] == output[k])
                            cnt++;
                    }
                }
                
                if(cnt != ans[i])
                    return;
            }
            count++;
            return;
        }
        
        for(int i = start; i <= end; i++){
            output[depth] = i;
            com(i + 1, depth + 1, end, q, ans);
        }
    }
}