import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		long[] dp = new long[21];
		String[] names = new String[N];
		long count = 0;
		for (int i = 0; i < N; i++) {
			String name = br.readLine();
			names[i] = name;
			count += dp[name.length()];
			dp[name.length()]++;
			if (i >= K) {
				String deleteName = names[i - K];
				dp[deleteName.length()]--;
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
}