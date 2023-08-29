import java.util.*;
import java.io.*;

public class Main {

	public static long[] dp;
	public static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		dp = new long[N + 2];
		dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i <= N; i++) {
			Dynamic(i);
		}
		sb.append(dp[N]);
		System.out.println(sb);
	}

	private static void Dynamic(int num) {
		dp[num] = (dp[num - 1] + (dp[num - 2] * 2)) % 10007;
	}

}