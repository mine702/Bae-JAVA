import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i < commands.length; i++){
            int I = commands[i][0];
            int J = commands[i][1];
            int K = commands[i][2];
            
            int[] numbers = Arrays.copyOfRange(array, I - 1, J);
            
            Arrays.sort(numbers);
            
            answer[i] = numbers[K - 1];
        }
        return answer;
    }
}