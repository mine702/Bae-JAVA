import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static int[] nums;
    public static int[] output;
    public static boolean[] visited;
    public static boolean isCheck;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        output = new int[N];
        visited = new boolean[N + 1];
        st = new StringTokenizer(br.readLine());

        /*
         * 걍 순열임 이거
         */

        nums = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        permutation(0, N);

        System.out.println(sb);
    }

    public static void permutation(int depth, int n) {
        if (isCheck)
            return;

        if (depth == n) {
            for (int i = 0; i < output.length; i++) {
                int num = output[i];
                int value = nums[num];

                for (int j = 0; j < i; j++) {
                    if (output[j] > num)
                        value--;

                    if (value == -1) {
                        return;
                    }
                }

                if (value != 0)
                    return;
            }

            for (int i = 0; i < output.length; i++) {
                sb.append(output[i] + " ");
            }

            isCheck = true;
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (isCheck)
                return;

            if (!visited[i]) {
                visited[i] = true;
                output[depth] = i;
                permutation(depth + 1, n);
                visited[i] = false;
            }
        }
    }
}