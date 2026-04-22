import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] locations = new int[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            locations[i] = Integer.parseInt(st.nextToken());
        }

        int min = 0;
        int max = N;
        int mid;
        boolean flag = false;

        while (true) {
            if (min >= max)
                break;

            mid = (max + min) / 2;

            if (locations[0] > mid || N - locations[M - 1] > mid) {
                min = mid + 1;
                continue;
            }

            for (int i = 1; i < M; i++) {
                if (locations[i] - locations[i - 1] > mid * 2) {
                    min = mid + 1;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                flag = false;
                continue;
            }
            max = mid;
        }

        sb.append(min);
        System.out.println(sb);
    }
}