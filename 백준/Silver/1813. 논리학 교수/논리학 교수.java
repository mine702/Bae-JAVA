import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num, value + 1);
            } else {
                map.put(num, 1);
            }
        }

        int answer = -1;

        if (!map.containsKey(0))
            answer = 0;

        for (Map.Entry<Integer, Integer> elemEntry : map.entrySet()) {
            if (elemEntry.getKey() == elemEntry.getValue()) {
                if (answer < elemEntry.getKey())
                    answer = elemEntry.getKey();
            }
        }
        sb.append(answer);
        System.out.println(sb);
    }
}