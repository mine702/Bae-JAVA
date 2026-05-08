import java.util.*;
import java.io.*;

class Solution {
    
    public int answer;
    
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, 0, numbers, target);
        return answer;
    }
    
    public void dfs(int depth, int sum, int[] numbers, int target){
        if(depth == numbers.length){
            if(target == sum)
                answer++;
            return;
        }
        
        dfs(depth + 1, sum + numbers[depth], numbers, target);
        dfs(depth + 1, sum - numbers[depth], numbers, target);
        
    }
}