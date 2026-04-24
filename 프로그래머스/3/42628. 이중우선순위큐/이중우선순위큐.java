import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for(int i = 0 ; i < operations.length; i++){
            String msg = operations[i];
            String[] msgs = msg.split(" ");
            
            if(msgs[0].equals("I")){
                int key = Integer.parseInt(msgs[1]);
                if(map.containsKey(key)){
                    int value = map.get(key);
                    map.put(key, value + 1);
                } else {
                    map.put(key, 1);
                }
            }else{
                if(msgs[1].equals("1")){
                    if(map.isEmpty())
                        continue;
                    int key = map.lastKey();
                    int value = map.get(key);
                    if(value == 1)
                        map.remove(key);
                    else
                        map.put(key, value - 1);
                }else{
                    if(map.isEmpty())
                        continue;
                    int key = map.firstKey();
                    int value = map.get(key);
                    if(value == 1)
                        map.remove(key);
                    else
                        map.put(key, value - 1);
                }
            }
        }
        
        if(map.isEmpty()){
            answer[0] = 0;
            answer[1] = 0;
        }else{
            answer[0] = map.lastKey();
            answer[1] = map.firstKey();
        }
        return answer;
    }
}