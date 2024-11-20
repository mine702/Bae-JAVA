import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[3][n+1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        dp[0][1] = Integer.parseInt(st.nextToken());
        dp[1][1] = 1;
        dp[2][1] = 1;
        int max = 1;
        for (int i = 2; i <= n; i++) {
            dp[0][i] = Integer.parseInt(st.nextToken());
            if (dp[0][i] >= dp[0][i-1]) {
                dp[1][i] = dp[1][i-1]+1;
            } else {
                dp[1][i] = 1;
            }
            if (dp[0][i] <= dp[0][i-1]) {
                dp[2][i] = dp[2][i-1]+1;
            } else {
                dp[2][i] = 1;
            }
            max = Math.max(max, Math.max(dp[1][i], dp[2][i]));
        }
        System.out.print(max);
    }
}