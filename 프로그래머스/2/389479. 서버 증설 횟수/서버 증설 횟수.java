import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < players.length; i++){
            if(players[i] >= m){
                while(true){
                    if((queue.size() + 1) * m <= players[i]){
                        queue.add(i);
                        answer++;
                    } else {
                        break;
                    }
                }
            }
            
            
            while(true){
                if(!queue.isEmpty() && queue.peek() + k - 1 == i){
                    queue.poll();
                } else 
                    break;
            }
        }

        return answer;
    }
}