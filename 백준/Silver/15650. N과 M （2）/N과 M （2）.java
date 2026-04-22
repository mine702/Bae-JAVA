import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static boolean[] isCheck;
    public static int[] save;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        isCheck = new boolean[N];
        save = new int[M];
        com(0, 0, N, M);
        System.out.println(sb);
    }

    public static void com(int depth, int start, int N, int R) {
        if (depth == R) {
            for (int i = 0; i < save.length; i++) {
                sb.append(save[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for (int i = start; i < N; i++) {
            if (isCheck[i])
                continue;
            save[depth] = i + 1;
            isCheck[i] = true;
            com(depth + 1, i, N, R);
            isCheck[i] = false;
        }
    }
}