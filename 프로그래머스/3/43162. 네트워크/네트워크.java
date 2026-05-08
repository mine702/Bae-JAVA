import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        List<Integer>[] list = new ArrayList[n];
        
        for(int i = 0 ; i < list.length; i++){
            list[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < computers.length; i++){
            for(int j = 0; j < computers[i].length; j++){
                if(i == j)
                    continue;
                if(computers[i][j] == 1)
                    list[i].add(j);
            }
        }
        
        boolean[] isCheck = new boolean[n];
        
        while(true){
            Queue<Integer> queue = new LinkedList<>();
            for(int i = 0 ; i < isCheck.length; i++){
                if(!isCheck[i]){
                    queue.add(i);
                    isCheck[i] = true;
                    break;
                }
            }
            
            if(queue.isEmpty())
                break;
            
            while(true){
                if(queue.isEmpty())
                    break;
                
                int num = queue.poll();     
                
                for(int i = 0 ; i < list[num].size(); i++){
                    int next = list[num].get(i);
                    
                    if(isCheck[next])
                        continue;
                    
                    queue.add(next);
                    isCheck[next] = true;
                }
            }
            
            answer++;
            
            /*
            for(int i = 0 ; i < isCheck.length; i++){
                System.out.print(i + " : " + isCheck[i] + " ");
            }
            System.out.println();
            */
        }
        return answer;
    }
}