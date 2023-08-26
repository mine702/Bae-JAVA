import java.io.*;
import java.util.*;

public class Solution {

	public static int N, M, R, C, L;
	public static int[][] map;
	public static int ans;
	public static boolean[][] isCheck;

	// 상하좌우
	public static int[][] locations1 = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int[][] locations2 = { { -1, 0 }, { 1, 0 } };
	public static int[][] locations3 = { { 0, -1 }, { 0, 1 } };
	public static int[][] locations4 = { { -1, 0 }, { 0, 1 } };
	public static int[][] locations5 = { { 1, 0 }, { 0, 1 } };
	public static int[][] locations6 = { { 1, 0 }, { 0, -1 } };
	public static int[][] locations7 = { { -1, 0 }, { 0, -1 } };

	public static int[][] impossible1 = { { 3, 4, 7 }, { 3, 5, 6 }, { 2, 6, 7 }, { 2, 4, 5 } };
	public static int[][] impossible2 = { { 3, 4, 7 }, { 3, 5, 6 } };
	public static int[][] impossible3 = { { 2, 6, 7 }, { 2, 4, 5 } };
	public static int[][] impossible4 = { { 3, 4, 7 }, { 2, 4, 5 } };
	public static int[][] impossible5 = { { 3, 5, 6 }, { 2, 4, 5 } };
	public static int[][] impossible6 = { { 3, 5, 6 }, { 2, 6, 7 } };
	public static int[][] impossible7 = { { 3, 4, 7 }, { 2, 6, 7 } };

	public static class Pipe {
		int pipeNum;
		int Y;
		int X;
		int count;

		public Pipe(int pipeNum, int y, int x, int count) {
			super();
			this.pipeNum = pipeNum;
			Y = y;
			X = x;
			this.count = count;
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int testN = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testN; t++) {
			st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			map = new int[N][M];
			isCheck = new boolean[N][M];
			ans = 0;
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			BFS(R, C);
			sb.append("#" + t + " " + ans + "\n");
		}
		System.out.print(sb);
	}

	private static void BFS(int startY, int startX) {
		Queue<Pipe> queue = new ArrayDeque<>();
		queue.add(new Pipe(map[startY][startX], startY, startX, 1));
		isCheck[startY][startX] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			Pipe pipe = queue.poll();
			int pipeNum = pipe.pipeNum;
			int Y = pipe.Y;
			int X = pipe.X;
			int count = pipe.count;
			if (count > L)
				continue;

			ans++;

			if (pipeNum == 1) {
				for (int i = 0; i < locations1.length; i++) {
					int offerY = Y + locations1[i][0];
					int offerX = X + locations1[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible1[i][0] && next != impossible1[i][1] && next != impossible1[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			} else if (pipeNum == 2) {
				for (int i = 0; i < locations2.length; i++) {
					int offerY = Y + locations2[i][0];
					int offerX = X + locations2[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible2[i][0] && next != impossible2[i][1] && next != impossible2[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			} else if (pipeNum == 3) {
				for (int i = 0; i < locations3.length; i++) {
					int offerY = Y + locations3[i][0];
					int offerX = X + locations3[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible3[i][0] && next != impossible3[i][1] && next != impossible3[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			} else if (pipeNum == 4) {
				for (int i = 0; i < locations4.length; i++) {
					int offerY = Y + locations4[i][0];
					int offerX = X + locations4[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible4[i][0] && next != impossible4[i][1] && next != impossible4[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			} else if (pipeNum == 5) {
				for (int i = 0; i < locations5.length; i++) {
					int offerY = Y + locations5[i][0];
					int offerX = X + locations5[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible5[i][0] && next != impossible5[i][1] && next != impossible5[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			} else if (pipeNum == 6) {
				for (int i = 0; i < locations6.length; i++) {
					int offerY = Y + locations6[i][0];
					int offerX = X + locations6[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible6[i][0] && next != impossible6[i][1] && next != impossible6[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			} else {
				for (int i = 0; i < locations7.length; i++) {
					int offerY = Y + locations7[i][0];
					int offerX = X + locations7[i][1];
					if (offerY >= N || offerY < 0 || offerX >= M || offerX < 0) {
						continue;
					}
					int next = map[offerY][offerX];
					if (!isCheck[offerY][offerX] && next != 0) {
						if (next != impossible7[i][0] && next != impossible7[i][1] && next != impossible7[i][2]) {
							queue.add(new Pipe(next, offerY, offerX, count + 1));
							isCheck[offerY][offerX] = true;
						}
					}
				}
			}

		}
	}

}