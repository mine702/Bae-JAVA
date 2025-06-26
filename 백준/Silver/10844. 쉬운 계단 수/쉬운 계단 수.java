import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        final int MOD = 1_000_000_000;
        int N = Integer.parseInt(br.readLine());
        
        long[][] dp = new long[N + 1][10];
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= N; i++) {
            for (int j = 0; j <= 9; j++) {
                if (j > 0) dp[i][j] += dp[i - 1][j - 1];
                if (j < 9) dp[i][j] += dp[i - 1][j + 1];
                dp[i][j] %= MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i <= 9; i++) {
            sum = (sum + dp[N][i]) % MOD;
        }

        sb.append(sum);
        System.out.println(sb);
    }
}

