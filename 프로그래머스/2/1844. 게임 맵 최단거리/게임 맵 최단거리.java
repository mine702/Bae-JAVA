import java.util.*;
import java.io.*;

class Solution {
    
    public class Node{
        int Y;
        int X;
        int count;
        
        Node(int Y, int X, int count){
            this.Y = Y;
            this.X = X;
            this.count = count;
        }
    }
    
    public int[][] locations = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    
    public int solution(int[][] maps) {
        int answer = -1;
        Queue<Node> queue = new LinkedList<>();
        boolean[][] isCheck = new boolean[maps.length][maps[0].length];
        
        queue.add(new Node(0, 0, 1));
        isCheck[0][0] = true;
        
        while(true){
            if(queue.isEmpty())
                break;
            
            Node node = queue.poll();
            if(node.Y == maps.length - 1 && node.X == maps[0].length - 1){
                answer = node.count;
                break;
            }
            
            for(int i = 0 ; i < locations.length; i++){
                int y = node.Y + locations[i][0];
                int x = node.X + locations[i][1];
                
                if(y < 0 || x < 0 || y >= maps.length || x >= maps[0].length)
                    continue;
                
                if(isCheck[y][x] || maps[y][x] == 0)
                    continue;
                
                isCheck[y][x] = true;
                queue.add(new Node(y, x, node.count + 1));
            }
        }
        return answer;
    }
}