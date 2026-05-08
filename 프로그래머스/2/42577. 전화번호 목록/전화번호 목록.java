import java.util.*;
import java.io.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < phone_book.length; i++){
            map.put(phone_book[i], 1);
        }
        
        for(int i = 0 ; i < phone_book.length; i++){
            String str = phone_book[i];
            
            for(int j = 0 ; j < str.length(); j++){
                String equ = str.substring(0, j);
                if(map.containsKey(equ)){
                    answer = false;
                    break;
                }
            }
            
            if(!answer)
                break;
        }
        return answer;
    }
}