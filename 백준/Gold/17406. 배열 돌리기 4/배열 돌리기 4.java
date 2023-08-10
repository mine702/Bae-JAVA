import java.io.*;
import java.util.*;

public class Main {

	public static int N, M, K;
	public static int[] numbers;
	public static int[][] input, map;
	public static boolean[] isCheck;
	public static int[][] location = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
	public static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		map = new int[N + 1][M + 1];
		input = new int[K][3];
		numbers = new int[K];
		isCheck = new boolean[K];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			input[i] = new int[] { r, c, s };
		}
		permutation(0);
		sb.append(ans);
		System.out.println(sb);
	}

	public static void Spinning(int startX, int startY, int endX, int endY, int[][] mapClone) {
		int maxCount = Math.min(endY - startY + 1, endX - startX + 1) / 2;
		for (int i = 0; i < maxCount; i++) {
			int y1 = startY + i;
			int x1 = startX + i;
			int y2 = endY - i;
			int x2 = endX - i;
			int y = y1;
			int x = x1;
			int num = mapClone[y][x];
			for (int j = 0; j < location.length; j++) {
				while (true) {
					y = y + location[j][0];
					x = x + location[j][1];
					if (y > y2 || y < y1 || x > x2 || x < x1) {
						y -= location[j][0];
						x -= location[j][1];
						break;
					}
					int num1 = mapClone[y][x];
					mapClone[y][x] = num;
					num = num1;
				}
			}
		}
	}

	public static void permutation(int cnt) {
		if (cnt == K) {
			int[][] mapClone = new int[N + 1][M + 1];
			for (int i = 0; i < map.length; i++)
				System.arraycopy(map[i], 0, mapClone[i], 0, map[i].length);

			for (int i = 0; i < K; i++) {
				int r = input[numbers[i]][0];
				int c = input[numbers[i]][1];
				int s = input[numbers[i]][2];
				int startY = r - s;
				int startX = c - s;
				int endY = r + s;
				int endX = c + s;
				Spinning(startX, startY, endX, endY, mapClone);
			}

			int minSum = Integer.MAX_VALUE;
			for (int i = 1; i <= N; i++) {
				int sum = 0;
				for (int j = 1; j <= M; j++) {
					sum += mapClone[i][j];
				}
				minSum = Math.min(minSum, sum);
			}
			ans = Math.min(minSum, ans);
			return;
		}
		for (int i = 0; i < input.length; i++) {
			if (isCheck[i])
				continue;
			numbers[cnt] = i;
			isCheck[i] = true;
			permutation(cnt + 1);
			isCheck[i] = false;
		}
	}
}