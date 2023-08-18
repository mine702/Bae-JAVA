import java.io.*;
import java.util.*;

public class Main {

	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int R, C;
	public static int[][] map;
	public static int ans = Integer.MIN_VALUE;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new int[R + 2][C + 2];

		// map 을 인트값으로 바꿔서 보기 나 널값 편하게 체크 하려고 대문자 - 64 해주면
		// A = 1 이 나오고 나머지 빈칸은 0이 나온다

		for (int i = 1; i <= R; i++) {
			String str = br.readLine();
			for (int j = 1; j <= C; j++) {
				map[i][j] = str.charAt(j - 1) - 64;
			}
		}
		// dfs 로 구현 스타트 지점에서 사방 탐색 해서 카운트 세주는거 만약 끝까지가면 끝
		boolean[] isCheck = new boolean[26];
		isCheck[map[1][1] - 1] = true;
		DFS(1, 1, isCheck, 1);
		sb.append(ans);
		System.out.println(sb);
	}

	private static void DFS(int startY, int startX, boolean[] isCheck, int count) {
		for (int i = 0; i < locations.length; i++) {
			int y = startY + locations[i][0];
			int x = startX + locations[i][1];
			if (map[y][x] != 0 && !isCheck[map[y][x] - 1]) {
				isCheck[map[y][x] - 1] = true;
				DFS(y, x, isCheck, count + 1);
				isCheck[map[y][x] - 1] = false;
			}
		}
		ans = Math.max(ans, count);
	}

}