import java.io.*;
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        HashMap<String, List<String>> hash = new HashMap<>();
        for(int i = 0 ; i < clothes.length; i++){
            List<String> items = hash.get(clothes[i][1]);
            if(items == null){
                List<String> newItems = new ArrayList<String>();
                newItems.add(clothes[i][0]);
                hash.put(clothes[i][1], newItems);
            } else {
                items.add(clothes[i][0]);
                hash.put(clothes[i][1], items);
            }
        }

        int sum = 1;

        for(List<String> list : hash.values()){
            sum *= list.size() + 1;
        }

        answer = sum - 1;
        return answer;
    }
}