import java.util.*;

class Solution {
    public int solution(String message, int[][] spoiler_ranges) {
        String[] words = message.split(" ");
        int n = words.length;
        
        // 각 단어의 실제 시작/끝 인덱스 계산
        int[] starts = new int[n];
        int[] ends = new int[n];
        int currentIdx = 0;
        for (int i = 0; i < n; i++) {
            starts[i] = currentIdx;
            ends[i] = currentIdx + words[i].length() - 1;
            currentIdx += words[i].length() + 1; // 단어 + 공백
        }

        // 1. 블랙리스트 만들기 (완전히 노출된 단어들)
        Set<String> blackList = new HashSet<>();
        for (int i = 0; i < n; i++) {
            boolean isAnyCharCovered = false;
            for (int[] range : spoiler_ranges) {
                // 단어의 범위와 스포일러 범위가 겹치는지 확인
                if (Math.max(starts[i], range[0]) <= Math.min(ends[i], range[1])) {
                    isAnyCharCovered = true;
                    break;
                }
            }
            if (!isAnyCharCovered) {
                blackList.add(words[i]); // 한 글자도 안 가려졌으면 블랙리스트행
            }
        }

        // 2. 클릭 순서대로 중요한 단어 찾기
        Set<String> found = new HashSet<>();
        int answer = 0;
        for (int[] range : spoiler_ranges) {
            for (int i = 0; i < n; i++) {
                // 이 스포일러 범위에 포함된 단어인가?
                if (Math.max(starts[i], range[0]) <= Math.min(ends[i], range[1])) {
                    // 블랙리스트에 없고, 처음 발견된 중요한 단어라면
                    if (!blackList.contains(words[i]) && !found.contains(words[i])) {
                        found.add(words[i]);
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}