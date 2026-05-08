import java.util.*;
import java.io.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < completion.length; i++){
            if(map.containsKey(completion[i])){
                map.put(completion[i], map.get(completion[i]) + 1);
            } else {
                map.put(completion[i], 1);
            }
        }
        
        for(int i = 0 ; i < participant.length; i++){
            if(map.containsKey(participant[i])){
                int cnt = map.get(participant[i]);
                if( cnt != 1 ){
                    map.put(participant[i], map.get(participant[i]) - 1);
                } else {
                    map.remove(participant[i]);
                }
            } else {
                answer = participant[i];
            }
        }
        return answer;
    }
}