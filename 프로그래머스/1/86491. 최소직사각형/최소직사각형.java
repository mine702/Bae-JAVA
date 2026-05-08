import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int max01 = 0;
        int max02 = 0;
        
        for(int i = 0; i < sizes.length; i++){
            int num01 = sizes[i][0];
            int num02 = sizes[i][1];
            
            if(num01 >= num02) {
                max01 = Math.max(max01, num01);
                max02 = Math.max(max02, num02);
            } else {
                max01 = Math.max(max01, num02);
                max02 = Math.max(max02, num01);
            }
        }
        
        answer = max01 * max02;
        return answer;
    }
}