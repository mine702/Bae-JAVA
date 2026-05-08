import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        boolean isCheck = false;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++){
            pq.add(scoville[i]);
        }
        
        while(true){
            if(pq.isEmpty() || isCheck || pq.peek() >= K)
                break;
            
            if(pq.size() == 1){
                isCheck = true;
                break;
            }
            
            int num01 = pq.poll();
            int num02 = pq.poll();
            
            int sum = num01 + num02 * 2;
            pq.add(sum);
            
            answer++;
        }
        
        if(isCheck)
            answer = -1;
        
        return answer;
    }
}