import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<>();
        
        int before = 10;
        
        for(int i = 0 ; i < arr.length; i++){
            int num = arr[i];
            
            if(num == before)
                continue;
            else
                queue.add(arr[i]);
            
            before = num;
        }
        
        int[] answer = new int[queue.size()];
        int index = 0;
        
        while(true){
            if(queue.isEmpty())
                break;
            
            answer[index++] = queue.poll();    
        }
        return answer;
    }
}