import java.util.*;
import java.io.*;

public class Main {

	public static int N, K;
	public static int[] dp;
	public static int[] nums;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		dp = new int[K + 1];

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			for (int j = 1; j < dp.length; j++) {
				if (j - num > 0) {
					dp[j] = dp[j] + dp[j - num];
				} else if (j - num == 0) {
					dp[j]++;
				}
			}
		}
		sb.append(dp[K]);
		System.out.println(sb);
	}
}