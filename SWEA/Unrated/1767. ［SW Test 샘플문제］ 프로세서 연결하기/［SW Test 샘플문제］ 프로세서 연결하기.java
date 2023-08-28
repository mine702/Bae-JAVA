import java.io.*;
import java.util.*;

public class Solution {

	static int N, max, totalCnt, min, map[][];
	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
	static ArrayList<int[]> list;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			N = Integer.parseInt(in.readLine());
			map = new int[N][N];
			max = 0;
			min = Integer.MAX_VALUE;
			totalCnt = 0;
			list = new ArrayList<int[]>();

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine(), " ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					if ((i == 0 || i == N - 1 || j == 0 || j == N - 1) && map[i][j] == 1)
						continue;
					if (map[i][j] == 1) {
						list.add(new int[] { i, j });
						totalCnt++;
					}
				}
			}
			go(0, 0);
			System.out.println("#" + tc + " " + min);
		}
	}

	private static void go(int index, int coreCnt) {

		if (coreCnt + (totalCnt - index) < max)
			return;

		if (index == totalCnt) {
			int res = getLength();
			if (max < coreCnt) {
				max = coreCnt;
				min = res;
			} else if (max == coreCnt) {
				if (min > res) {
					min = res;
				}
			}
			return;
		}

		int[] cur = list.get(index);
		int r = cur[0];
		int c = cur[1];

		for (int d = 0; d < 4; d++) {
			if (!isAvailable(r, c, d))
				continue;
			setStatus(r, c, d, 2);
			go(index + 1, coreCnt + 1);
			setStatus(r, c, d, 0);
		}
		go(index + 1, coreCnt);
	}

	private static int getLength() {
		int lCnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 2) {
					lCnt++;
				}
			}
		}
		return lCnt;
	}

	private static void setStatus(int r, int c, int d, int status) {
		int nr = r;
		int nc = c;

		while (true) {
			nr += dr[d];
			nc += dc[d];
			if (nr < 0 || nr >= N || nc < 0 || nc >= N)
				break;
			map[nr][nc] = status;
		}
	}

	private static boolean isAvailable(int r, int c, int d) {
		int nr = r;
		int nc = c;

		while (true) {
			nr += dr[d];
			nc += dc[d];
			if (nr < 0 || nr >= N || nc < 0 || nc >= N)
				break;
			if (map[nr][nc] != 0)
				return false;
		}
		return true;
	}
}
