import java.util.*;

class Solution {
    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, List<int[]>> map2 = new HashMap<>();

        for (int i = 0; i < genres.length; i++) {
            map1.put(genres[i], map1.getOrDefault(genres[i], 0) + plays[i]);
            if (!map2.containsKey(genres[i])) {
                map2.put(genres[i], new ArrayList<>());
            }
            map2.get(genres[i]).add(new int[]{i, plays[i]});
        }

        List<String> keys = new ArrayList<>(map1.keySet());
        Collections.sort(keys, (a, b) -> map1.get(b) - map1.get(a));

        List<Integer> list = new ArrayList<>();
        for (String key : keys) {
            List<int[]> songs = map2.get(key);
            Collections.sort(songs, (a, b) -> {
                if (b[1] == a[1]) return a[0] - b[0];
                return b[1] - a[1];
            });

            list.add(songs.get(0)[0]);
            if (songs.size() > 1) {
                list.add(songs.get(1)[0]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}