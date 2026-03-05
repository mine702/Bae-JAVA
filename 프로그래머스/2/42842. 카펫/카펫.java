import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        if(yellow != 1){ 
            List<Integer> list = new LinkedList<>();
            for(int i = 1 ; i <= yellow; i++){
                if(yellow % i == 0)
                    list.add(i);
            }

            for (int i = 0 ; i < list.size(); i++){
                int width = list.get(list.size() - i - 1);
                int height = list.get(i);
                int number = (width + 2) * (height + 2) - (width * height);
                if(number == brown){
                    answer = new int[] {width + 2, height + 2};
                    break;
                }
            }
        } else
            answer = new int[] {3, 3};
        
        return answer;
    }
}