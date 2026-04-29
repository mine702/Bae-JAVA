import java.util.*;
import java.io.*;

class Solution {
    public String solution(String new_id) {
        String answer = "";
        String two = "";

        for(int i = 0 ; i < new_id.length(); i++){
            char ch = new_id.charAt(i);

            if(65 <= ch && ch <= 90){
                answer += (char) (ch + 32); 
            } else if(97 <= ch && ch <= 122){
                answer += ch;
            } else if(ch == '-' || ch == '_' || ch == '.' ){
                answer += ch;
            } else if(48 <= ch && ch <= 57){
                answer += (char) (ch);
            }
        }

        ArrayDeque<Character> dq = new ArrayDeque<>();

        for(int i = 0; i < answer.length(); i++){
            char ch = answer.charAt(i);

            if(!(ch == '.' && !dq.isEmpty() && dq.peekLast() == '.')){
                dq.add(ch);
            }
        }
        answer = "";

        while(true){
            if(dq.isEmpty())
                break;
            answer += dq.poll();
        }

        String str4 = "";

        for(int i = 0; i < answer.length(); i++){
            if(i == 0 || i == answer.length() - 1){
                if(answer.charAt(i) == '.'){
                    continue;
                }
            }

            str4 += answer.charAt(i);
        }

        answer = "";

        if(str4.length() == 0)
            answer = "a";
        else
            answer = str4;

        String str5 = "";

        if(answer.length() >= 15){
            str5 = answer.substring(0, 15);
            
            while(true){
                if(str5.charAt(str5.length() - 1) == '.'){
                    str5 = str5.substring(0, str5.length() - 1);
                } else {
                    answer = str5;
                    break;                    
                }
            }
        }
        
        if(answer.length() <= 2){
            char ch = answer.charAt(answer.length() - 1);
            for(int i = answer.length() - 1; i < 2; i++){
                answer += ch;
            }
        }


        return answer;
    }
}