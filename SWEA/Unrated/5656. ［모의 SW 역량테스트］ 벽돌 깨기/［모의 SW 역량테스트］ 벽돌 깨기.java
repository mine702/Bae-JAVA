import java.util.*;
import java.io.*;

public class Solution {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static StringBuilder sb = new StringBuilder();
	static int N, R, C;
	static int[][] graph = new int[15][12];
	static int[][] clonedGraph = new int[15][12];
	static ArrayDeque<int[]> queue = new ArrayDeque<>();
	static int[] map = new int[4];
	static int[] dr = { 0, 0, -1, 1 };
	static int[] dc = { -1, 1, 0, 0 };

	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());

		int answer;
		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());

			for (int i = R - 1; 0 <= i; i--) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < C; j++) {
					graph[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			answer = Integer.MAX_VALUE;
			for (int s3 = 0; s3 < C; s3++) {
				map[3] = s3;
				for (int s2 = 0; s2 < C; s2++) {
					map[2] = s2;
					for (int s1 = 0; s1 < C; s1++) {
						map[1] = s1;
						for (int s0 = 0; s0 < C; s0++) {
							map[0] = s0;
							makeMapClone(graph, clonedGraph);
							for (int i = 0; i < N; i++) {
								checkBlock(map[i]);
								breakBlock();
							}
							answer = Math.min(answer, countBricks());
							makeMapClone(clonedGraph, graph);
						}
						if (N < 2)
							break;
					}
					if (N < 3)
						break;
				}
				if (N < 4)
					break;
			}

			sb.append("#").append(test_case).append(" ").append(answer).append("\n");
		}
		System.out.print(sb);
	}

	static void checkBlock(int c) {
		queue.clear();
		for (int i = R - 1; 0 <= i; i--) {
			if (graph[i][c] == 0)
				continue;
			queue.offer(new int[] { graph[i][c], i, c });
			graph[i][c] = 0;

			while (!queue.isEmpty()) {
				int[] cur = queue.poll();
				for (int d = 0; d < 4; d++) {
					for (int l = 1; l < cur[0]; l++) {
						int nR = cur[1] + dr[d] * l;
						int nC = cur[2] + dc[d] * l;
						if (nR < 0 || R <= nR || nC < 0 || C <= nC)
							continue;
						if (graph[nR][nC] > 1)
							queue.offer(new int[] { graph[nR][nC], nR, nC });
						graph[nR][nC] = 0;
					}
				}
			}

			break;
		}
	}

	static void breakBlock() {
		for (int j = 0; j < C; j++) {
			for (int i = 0; i < R; i++) {
				if (graph[i][j] != 0)
					continue;

				for (int k = i + 1; k < R; k++) {
					if (graph[k][j] != 0) {
						graph[i][j] = graph[k][j];
						graph[k][j] = 0;
						break;
					}
				}
			}
		}
	}

	static int countBricks() {
		int bricks = 0;

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (graph[i][j] != 0)
					bricks++;
			}
		}
		return bricks;
	}

	static void makeMapClone(int[][] from, int[][] to) {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				to[i][j] = from[i][j];
			}
		}
	}

}