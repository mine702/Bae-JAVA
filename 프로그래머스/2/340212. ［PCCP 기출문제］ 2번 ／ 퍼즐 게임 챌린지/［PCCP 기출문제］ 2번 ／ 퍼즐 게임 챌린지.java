import java.util.*;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        // 숙련도의 최소는 1, 최대는 난이도 중 최대값 (혹은 100,000)
        int max = 100000; 
        int min = 1;
        int answer = max;

        while (min <= max) {
            int mid = (min + max) / 2;
            
            if (isPossible(mid, diffs, times, limit)) {
                answer = mid; // 가능하면 더 작은 숙련도를 찾아봄
                max = mid - 1;
            } else {
                min = mid + 1; // 불가능하면 숙련도를 높임
            }
        }
        
        return answer;
    }
    
    public boolean isPossible(int level, int[] diffs, int[] times, long limit) {
        long time_sum = 0;
        int time_prev = 0;
        
        for (int i = 0; i < diffs.length; i++) {
            int diff = diffs[i];
            int time_cur = times[i];
            
            if (diff <= level) {
                time_sum += time_cur;
            } else {
                int wrong = diff - level;
                // 핵심: 계산 과정에서 (long) 형변환을 추가하여 오버플로우 방지
                time_sum += (long)wrong * (time_cur + time_prev) + time_cur;
            }
            
            // 중간에 이미 limit을 넘었으면 더 볼 필요도 없이 탈출 (최적화)
            if (time_sum > limit) return false;
            
            time_prev = time_cur;
        }
        
        return true;
    }
}