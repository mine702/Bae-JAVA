import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        Arrays.sort(mats);
        boolean flag = false;        
        for(int i = mats.length - 1; i >= 0; i--){
            if(flag)
                break;
            
            int size = mats[i];
            
            for(int x = 0; x < park.length; x++){
                if(flag)
                    break;
                for(int y = 0; y < park[x].length; y++){
                    if(park[x][y].equals("-1"))
                        if(Check(x, y, size, park)){
                            flag = true;
                            answer = mats[i];
                            break;
                        }
                }
            }
        }
        
        return answer;
    }
    
    public static boolean Check(int startY, int startX, int size, String[][] park){
        if(startY + size - 1 >= park.length || startX + size - 1 >= park[0].length)
            return false;
        
        for(int i = startY ; i < startY + size; i++){
            for(int j = startX; j < startX + size; j++){
                if(!park[i][j].equals("-1"))
                    return false;
            }
        }
        
        return true;
    }
}