import java.util.*;

class Solution {
    // static 보다는 지역 변수로 관리하는 게 안전합니다.
    public List<int[]>[] list;

    public int solution(int[][] points, int[][] routes) {
        int robotCount = routes.length;
        list = new ArrayList[robotCount];
        
        for(int i = 0 ; i < robotCount; i++){
            list[i] = new ArrayList<>();
            // 로봇 한 대가 '전체 경로'를 완주하도록 수정
            Sim(i, routes[i], points);
        }

        int answer = 0;
        int maxTime = 0;
        for(int i = 0; i < robotCount; i++) {
            maxTime = Math.max(maxTime, list[i].size());
        }
        
        // 시간대별로 체크
        for(int t = 0; t < maxTime; t++) {
            Map<String, Integer> map = new HashMap<>();
            for(int i = 0 ; i < robotCount; i++) {
                if(list[i].size() > t) {
                    int[] loc = list[i].get(t);
                    String key = loc[0] + "," + loc[1];
                    map.put(key, map.getOrDefault(key, 0) + 1);
                }
            }
            
            for (int count : map.values()) {
                if(count >= 2) answer++; // 2대 이상이면 위험 상황 +1
            }
        }
        
        return answer;
    }

    public void Sim(int robotIdx, int[] route, int[][] points) {
        // 0초 시점: 첫 번째 포인트 위치 기록
        int[] curr = points[route[0] - 1].clone();
        list[robotIdx].add(new int[]{curr[0], curr[1]});

        // route[1]부터 마지막 포인트까지 순차적으로 이동
        for(int i = 1; i < route.length; i++) {
            int[] target = points[route[i] - 1];

            // 도착할 때까지 반복
            while(curr[0] != target[0] || curr[1] != target[1]) {
                // r 좌표부터 이동
                if(curr[0] != target[0]) {
                    if(curr[0] > target[0]) curr[0]--;
                    else curr[0]++;
                } 
                // r이 같으면 c 좌표 이동
                else {
                    if(curr[1] > target[1]) curr[1]--;
                    else curr[1]++;
                }
                // 이동 후 좌표 기록 (중요: 새 배열 객체 생성)
                list[robotIdx].add(new int[]{curr[0], curr[1]});
            }
        }
    }
}