import java.io.*;
import java.util.*;

public class Main {

    public static int[] nums;
    public static StringBuilder sb = new StringBuilder();
    public static int N;
    public static int M;
    public static int[] numbers;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[M];
        numbers = new int[10001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int result = Integer.parseInt(st.nextToken());
            numbers[result] = numbers[result] + 1;
        }

        Combination(0);

        System.out.println(sb);
    }

    public static void Combination(int cnt) {
        if (cnt == M) {
            for (int num : nums) {
                sb.append(num).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 1; i <= 10000; i++) {
            if (numbers[i] > 0) {
                nums[cnt] = i;
                numbers[i]--;
                Combination(cnt + 1);
                numbers[i]++;
            }
        }
    }
}
