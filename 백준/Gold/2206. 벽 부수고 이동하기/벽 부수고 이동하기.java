import java.util.*;
import java.io.*;

public class Main {

	public static int N, M;
	public static int[][] map;
	public static int[][][] mapCheck;
	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N + 1][M + 1];
		for (int i = 1; i <= N; i++) {
			String input = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j + 1] = input.charAt(j) - '0';
			}
		}
		BFS(1, 1);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < 2; i++) {
			int num = mapCheck[i][N][M];
			if (num != 0)
				ans = Math.min(ans, num);
		}
		if (ans == Integer.MAX_VALUE)
			sb.append(-1);
		else
			sb.append(ans);
		System.out.println(sb);
	}

	private static void BFS(int startY, int startX) {
		mapCheck = new int[2][N + 1][M + 1];
		Queue<int[]> queue = new ArrayDeque<>();
		queue.add(new int[] { startY, startX, 0 });
		if (map[startY][startX] == 1)
			mapCheck[1][startY][startX] = 1;
		else
			mapCheck[0][startY][startX] = 1;
		while (true) {
			if (queue.isEmpty())
				return;
			int[] nums = queue.poll();
			int Y = nums[0];
			int X = nums[1];
			int block = nums[2];
			int count = mapCheck[block][Y][X];

			for (int i = 0; i < locations.length; i++) {
				int blockSet = nums[2];
				int offerY = Y + locations[i][0];
				int offerX = X + locations[i][1];
				if (offerY < 1 || offerY > N || offerX < 1 || offerX > M)
					continue;
				if (map[offerY][offerX] == 1) {
					if (block == 1)
						continue;
					blockSet += 1;
				}
				int number = mapCheck[block][offerY][offerX];
				if (number != 0) {
					if (number > count + 1) {
						queue.add(new int[] { offerY, offerX, blockSet });
						mapCheck[blockSet][offerY][offerX] = count + 1;
					}
				} else {
					queue.add(new int[] { offerY, offerX, blockSet });
					mapCheck[blockSet][offerY][offerX] = count + 1;
				}
			}
		}
	}
}