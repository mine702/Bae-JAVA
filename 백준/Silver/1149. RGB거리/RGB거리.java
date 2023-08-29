import java.util.*;
import java.io.*;

public class Main {

	public static int N;
	public static int[][] cost;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		cost = new int[N][3];
		for (int i = 0; i < cost.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				cost[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 1; i < cost.length; i++) {
			int red = cost[i - 1][0];
			int green = cost[i - 1][1];
			int blue = cost[i - 1][2];

			cost[i][0] += Math.min(green, blue);
			cost[i][1] += Math.min(red, blue);
			cost[i][2] += Math.min(red, green);
		}
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 3; i++) {
			ans = Math.min(cost[N - 1][i], ans);
		}

		sb.append(ans);
		System.out.println(sb);
	}
}
