import java.util.*;
import java.io.*;

class Solution {
    public static int[][] locations = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public class Node{
        int Y;
        int X;

        public Node(int Y, int X){
            this.Y = Y;
            this.X = X;
        }
    }

    public int solution(String[] storage, String[] requests) {
        int answer = 0;
        char[][] maps = new char[storage.length + 2][storage[0].length() + 2];

        for(int i = 1; i <= storage.length; i++){
            String str = storage[i - 1];

            for(int j = 1; j <= str.length(); j++){
                maps[i][j] = str.charAt(j - 1);
            }
        }

        for(int i = 0; i < requests.length; i++){
            String request = requests[i];
            char ch = request.charAt(0);

            if(request.length() >= 2){
                for(int j = 1 ; j < maps.length - 1; j++){
                    for(int k = 1; k < maps[j].length - 1; k++){
                        if(maps[j][k] == ch)
                            maps[j][k] = '0';
                    }
                }
            } else {
                ArrayList<Node> list = new ArrayList<>();

                for(int j = 1 ; j < maps.length - 1; j++){
                    for(int k = 1; k < maps[j].length - 1; k++){
                        if(maps[j][k] == ch){
                            if(BFS(j, k, maps)){
                                list.add(new Node(j, k));
                            }
                        }
                    }
                }

                for(int j = 0; j < list.size(); j++){
                    Node node = list.get(j);
                    maps[node.Y][node.X] = '0';
                }
            }
        }

        for(int i = 1 ; i < maps.length - 1; i++){
            for(int j = 1 ; j < maps[i].length - 1; j++){
                if(maps[i][j] != '0')
                    answer++;
            }
        }
        return answer;
    }

    public boolean BFS(int startY, int startX, char[][] maps){
        Queue<Node> queue = new LinkedList<>();
        boolean[][] isCheck = new boolean[maps.length][maps[0].length];
        queue.add(new Node(startY, startX));
        isCheck[startY][startX] = true;
        boolean check = false;

        while(true) {
            if(queue.isEmpty() || check)
                break;

            Node node = queue.poll();

            for(int i = 0 ; i < locations.length; i++){
                int Y = node.Y + locations[i][0];
                int X = node.X + locations[i][1];

                if(Y == 0 || X == 0 || Y == maps.length - 1 || X == maps[0].length - 1){
                    check = true;
                    break;
                }

                if(maps[Y][X] != '0' || isCheck[Y][X])
                    continue;

                isCheck[Y][X] = true;
                queue.add(new Node(Y,X));
            }
        }

        if(check)
            return true;
        return false;
    }
}