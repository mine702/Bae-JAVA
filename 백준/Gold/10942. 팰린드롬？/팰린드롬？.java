import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];
		boolean[][] dp = new boolean[N + 1][N + 1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 길이가 1인 경우, 항상 팰린드롬
		for (int i = 1; i <= N; i++) {
			dp[i][i] = true;
		}

		// 길이가 2인 경우
		for (int i = 1; i < N; i++) {
			if (arr[i] == arr[i + 1]) {
				dp[i][i + 1] = true;
			}
		}

		// 길이가 3 이상인 경우
		for (int len = 3; len <= N; len++) {
			for (int i = 1; i <= N - len + 1; i++) {
				int j = i + len - 1;
				if (arr[i] == arr[j] && dp[i + 1][j - 1]) {
					dp[i][j] = true;
				}
			}
		}

		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());

			sb.append(dp[S][E] ? "1\n" : "0\n");
		}

		System.out.println(sb);
	}
}