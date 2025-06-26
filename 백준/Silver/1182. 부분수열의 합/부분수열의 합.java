import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static int count = 0;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        boolean[] visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < arr.length; i++) {
            combination(arr, visited, 0, 0, i + 1, S);
        }

        sb.append(count);
        System.out.println(sb);
    }

    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r, int answer) {
        if (depth == r) {
            int sum = 0;

            for (int i = 0; i < arr.length; i++)
                if (visited[i])
                    sum += arr[i];

            if (sum == answer)
                count++;
        }

        for (int i = start; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                combination(arr, visited, i + 1, depth + 1, r, answer);
                visited[i] = false;
            }
        }
    }
}