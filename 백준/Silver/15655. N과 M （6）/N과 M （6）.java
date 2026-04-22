import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static int[] nums;
    public static boolean[] visited;
    public static int[] output;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        nums = new int[N];
        output = new int[M];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);
        com(0, 0, N, M);
        System.out.println(sb);
    }

    public static void com(int depth, int start, int n, int m) {
        if (depth == m) {
            for (int i = 0; i < output.length; i++)
                sb.append(output[i] + " ");

            sb.append("\n");
            return;
        }
        for (int i = start; i < n; i++) {
            if (visited[i])
                continue;

            visited[i] = true;
            output[depth] = nums[i];
            com(depth + 1, i + 1, n, m);
            visited[i] = false;
        }
    }

}