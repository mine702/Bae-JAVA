import java.io.*;
import java.util.*;
import java.util.concurrent.CountDownLatch;

public class Main {

	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int[][] map;
	public static int[][] dp;
	public static int answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		dp = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				map[i][j] = num;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				answer = Math.max(answer, moveMap(i, j));
			}
		}
		sb.append(answer);
		System.out.println(sb);
	}

	private static int moveMap(int startY, int startX) {
		if (dp[startY][startX] != 0)
			return dp[startY][startX];

		dp[startY][startX] = 1;
		
		for (int i = 0; i < locations.length; i++) {
			int offerY = startY + locations[i][0];
			int offerX = startX + locations[i][1];
			if (offerY < 0 || offerX < 0 || offerY >= map.length || offerX >= map.length)
				continue;
			if (map[startY][startX] >= map[offerY][offerX])
				continue;
			dp[startY][startX] = Math.max(dp[startY][startX], moveMap(offerY, offerX) + 1);
		}

		return dp[startY][startX];
	}

}