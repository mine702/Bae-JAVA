import java.util.*;

class Solution {
    public int solution(int[][] signals) {
        int answer = -1;

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean flag = true;
        int index = 0;

        while (flag) {
            if(index == 100000){
                break;    
            }
            
            for (int i = 0; i < signals.length; i++) {
                int start = signals[i][0] + 1;

                if (index != 0)
                    start += (signals[i][0] + signals[i][1] + signals[i][2]) * index;

                for (int j = 0; j < signals[i][1]; j++) {
                    int nums = start + j;

                    if (!map.containsKey(nums))
                        map.put(nums, 1);
                    else {
                        int count = map.get(nums);
                        if (++count == signals.length) {
                            answer = nums;
                            flag = false;
                            break;
                        }
                        map.put(nums, count);
                    }
                }
                if (!flag)
                    break;
            }
            index++;
        }
        return answer;
    }
}