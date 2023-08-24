import java.util.*;
import java.io.*;

public class Main {

	static int[][] map;
	static int[] paper = { 0, 5, 5, 5, 5, 5 };
	static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		map = new int[10][10];
		for (int i = 0; i < map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		DFS(0, 0, 0);

		if (ans == Integer.MAX_VALUE)
			sb.append(-1);
		else
			sb.append(ans);
		System.out.println(sb);
	}

	private static void DFS(int y, int x, int cnt) {
		if (y >= 9 && x > 9) {
			ans = Math.min(ans, cnt);
			return;
		}

		if (ans <= cnt) {
			return;
		}
		if (x > 9) {
			DFS(y + 1, 0, cnt);
			return;
		}

		if (map[y][x] == 1) {
			for (int i = 5; i >= 1; i--) {
				if (paper[i] > 0 && isAttach(y, x, i)) {
					attach(y, x, i, 0);
					paper[i]--;
					DFS(y, x + 1, cnt + 1);
					attach(y, x, i, 1);
					paper[i]++;
				}
			}
		} else {
			DFS(y, x + 1, cnt);
		}
	}

	private static void attach(int y, int x, int size, int state) {
		for (int i = y; i < y + size; i++) {
			for (int j = x; j < x + size; j++) {
				map[i][j] = state;
			}
		}
	}

	private static boolean isAttach(int y, int x, int size) {
		for (int i = y; i < y + size; i++) {
			for (int j = x; j < x + size; j++) {
				if (i < 0 || i >= 10 || j < 0 || j >= 10) {
					return false;
				}
				if (map[i][j] != 1) {
					return false;
				}
			}
		}
		return true;
	}

}
