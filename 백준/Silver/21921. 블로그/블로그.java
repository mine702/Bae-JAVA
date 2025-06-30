import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static int[] sums;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        sums = new int[X];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < X; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (i == 0) {
                sums[0] = n;
                continue;
            }

            sums[i] = sums[i - 1] + n;
        }

        int max = 0;
        int count = 0;

        for (int i = N - 1; i < X; i++) {
            if (i == N - 1) {
                max = sums[i];
                count = 1;
                continue;
            }

            int value = sums[i] - sums[i - N];
            if (max < value) {
                max = value;
                count = 1;
            } else if (max == value)
                count++;
        }
        if (max == 0)
            sb.append("SAD");
        else
            sb.append(max + "\n" + count);
        System.out.println(sb);
    }
}
