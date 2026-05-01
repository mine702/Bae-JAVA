import java.util.*;
import java.io.*;

class Solution {
    class Node{
        int count = 0;
        int y;
        int x;
        
        Node(int count, int y, int x){
            this.count = count;
            this.y = y;
            this.x = x;
        }
    }
    
    public static int[][] locations = {{-1,0},{1,0},{0,-1},{0,1}};
    public int solution(int[][] maps) {
        int answer = 0;
        answer = bfs(maps);
        return answer;
    }
    
    public int bfs(int[][] maps){
        int min = -1; 
        Queue<Node> queue = new LinkedList<>();
        boolean[][] isCheck = new boolean[maps.length][maps[0].length];
        queue.add(new Node(1, 0, 0));
        isCheck[0][0] = true;
        while(true){
            if(queue.isEmpty())
                break;
            
            Node node = queue.poll();
            
            for(int i = 0; i < locations.length; i++){
                int y = node.y + locations[i][0];
                int x = node.x + locations[i][1];
                
                if(0 > y || y >= maps.length || 0 > x || x >= maps[0].length || isCheck[y][x] || maps[y][x] == 0){
                    continue;
                }
                
                isCheck[y][x] = true;
                if(y == maps.length - 1 && x == maps[0].length - 1){
                    min = node.count + 1;
                } else 
                    queue.add(new Node(node.count + 1, y, x));
            }
        }
        
        return min;
    }
}