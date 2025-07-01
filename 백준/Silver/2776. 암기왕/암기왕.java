import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int T = Integer.parseInt(br.readLine());

        for (int k = 0; k < T; k++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<Integer, Integer> map = new HashMap<>();

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                map.put(num, 1);
            }

            int M = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < M; i++) {
                int num = Integer.parseInt(st.nextToken());
                if (map.get(num) != null)
                    sb.append(map.get(num) + "\n");
                else
                    sb.append(0 + "\n");
            }
        }

        System.out.println(sb);
    }
}
