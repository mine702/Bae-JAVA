import java.util.*;
import java.io.*;

class Solution {
    
    public class Node{
        int type;
        int next;
        
        public Node(int type, int next){
            this.type = type;
            this.next = next;
        }
    }
    
    public static List<Node>[] list;
    public static int max = 0;
    
    public int solution(int n, int infection, int[][] edges, int k) {
        int answer = 0;
        list = new ArrayList[n + 1];
        
        for(int i = 1; i < list.length; i++){
            list[i] = new ArrayList<>();    
        }
        
        for(int i = 0 ; i < edges.length; i++){
            int x = edges[i][0];
            int y = edges[i][1];
            int type = edges[i][2];
            
            list[x].add(new Node(type, y));
            list[y].add(new Node(type, x));
        }
        
        boolean[] isCheck = new boolean[n + 1];
        isCheck[infection] = true;
        
        DFS(0, k, isCheck);
        
        answer = max;
        
        return answer;
    }
    
    public void DFS(int depth, int k, boolean[] isCheck){
        if(depth == k){
            int count = 0;
            for(int i = 1 ; i < isCheck.length; i++){
                if(isCheck[i])
                    count++;        
            }
            
            if(max < count)
                max = count;
            return;
        }
        
        for(int i = 1; i <= 3; i++){
            boolean[] clone = isCheck.clone();
            BFS(i, clone);
            DFS(depth + 1, k, clone);
        }
    }
    
    public void BFS(int type, boolean[] isCheck){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1 ; i < isCheck.length; i++){
            if(isCheck[i])
                queue.add(i);
        }
        
        while(true){
            if(queue.isEmpty())
                break;
            
            int next = queue.poll();
            
            for(int i = 0; i < list[next].size(); i++){
                Node node = list[next].get(i);
                if(node.type != type || isCheck[node.next])
                    continue;
                
                isCheck[node.next] = true;
                queue.add(node.next);
            }
        }
    }
}