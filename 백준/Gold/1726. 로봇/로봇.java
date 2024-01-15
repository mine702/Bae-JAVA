import java.io.*;
import java.util.*;

public class Main {

	public static int[][] map;
	public static boolean[][][] isCheck;
	public static int[][] locations = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
	public static int endY, endX, endD;
	public static int answer = 0;

	public static class Node {
		int Y;
		int X;
		int D;
		int count;

		public Node(int Y, int X, int D, int count) {
			this.Y = Y;
			this.X = X;
			this.D = D;
			this.count = count;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		map = new int[M][N];
		isCheck = new boolean[4][M][N];

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		st = new StringTokenizer(br.readLine());

		int startY = Integer.parseInt(st.nextToken());
		int startX = Integer.parseInt(st.nextToken());
		int startD = Integer.parseInt(st.nextToken());

		Node node = new Node(startY - 1, startX - 1, startD - 1, 0);

		st = new StringTokenizer(br.readLine());

		endY = Integer.parseInt(st.nextToken()) - 1;
		endX = Integer.parseInt(st.nextToken()) - 1;
		endD = Integer.parseInt(st.nextToken()) - 1;

		bfs(node, M, N);
		sb.append(answer);
		System.out.println(sb);
	}

	public static void bfs(Node startN, int M, int N) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(startN);
		isCheck[startN.D][startN.Y][startN.X] = true;

		while (true) {
			if (queue.isEmpty())
				break;

			Node node = queue.poll();

			if (node.D == endD && node.Y == endY && node.X == endX) {
				answer = node.count;
				break;
			}

			for (int i = 1; i < 4; i++) {
				int offerY = node.Y + locations[node.D][0] * i;
				int offerX = node.X + locations[node.D][1] * i;

				if (offerY < 0 || offerY >= M || offerX < 0 || offerX >= N)
					continue;

				if (map[offerY][offerX] == 1)
					break;

				if (isCheck[node.D][offerY][offerX] == false) {
					isCheck[node.D][offerY][offerX] = true;
					queue.add(new Node(offerY, offerX, node.D, node.count + 1));
				}
			}

			int left = 0;
			int right = 0;

			if (node.D == 0) {
				left = 3;
				right = 2;
			} else if (node.D == 1) {
				left = 2;
				right = 3;
			} else if (node.D == 2) {
				left = 0;
				right = 1;
			} else {
				left = 1;
				right = 0;
			}

			if (isCheck[left][node.Y][node.X] == false) {
				isCheck[left][node.Y][node.X] = true;
				queue.add(new Node(node.Y, node.X, left, node.count + 1));
			}

			if (isCheck[right][node.Y][node.X] == false) {
				isCheck[right][node.Y][node.X] = true;
				queue.add(new Node(node.Y, node.X, right, node.count + 1));
			}
		}
	}
}