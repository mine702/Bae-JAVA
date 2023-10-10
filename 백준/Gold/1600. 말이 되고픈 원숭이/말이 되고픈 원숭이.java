import java.util.*;
import java.io.*;

public class Main {

	public static int[][] map;
	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static int[][] hores = { { -2, -1 }, { -2, 1 }, { -1, -2 }, { -1, 2 }, { 1, -2 }, { 1, 2 }, { 2, -1 },
			{ 2, 1 } };
	public static int answer = Integer.MAX_VALUE;
	public static int W;
	public static int H;

	public static class Nodes implements Comparable<Nodes> {
		int y;
		int x;
		int count;
		int k;

		public Nodes(int y, int x, int count, int k) {
			this.y = y;
			this.x = x;
			this.count = count;
			this.k = k;
		}

		@Override
		public int compareTo(Nodes o) {
			return this.count - o.count;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		map = new int[H][W];
		for (int i = 0; i < map.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		BFS(0, K);

		if (answer == Integer.MAX_VALUE)
			sb.append(-1);
		else
			sb.append(answer);

		System.out.println(sb);
	}

	private static void BFS(int count, int K) {
		Queue<Nodes> queue = new PriorityQueue<>();
		boolean[][][] isCheck = new boolean[K + 1][H][W];
		isCheck[0][0][0] = true;
		queue.add(new Nodes(0, 0, 0, K));
		while (true) {
			if (queue.isEmpty())
				break;
			Nodes node = queue.poll();
			int Y = node.y;
			int X = node.x;
			int cnt = node.count;
			int k = node.k;
			if (Y == H - 1 && X == W - 1) {
				answer = cnt;
				break;
			}
			for (int i = 0; i < locations.length; i++) {
				int offerY = Y + locations[i][0];
				int offerX = X + locations[i][1];

				if (offerY < 0 || offerX < 0 || offerY >= H || offerX >= W)
					continue;
				if (map[offerY][offerX] != 0 || isCheck[k][offerY][offerX])
					continue;
				isCheck[k][offerY][offerX] = true;
				queue.add(new Nodes(offerY, offerX, cnt + 1, k));
			}
			if (k != 0)
				for (int i = 0; i < hores.length; i++) {
					int offerY = Y + hores[i][0];
					int offerX = X + hores[i][1];

					if (offerY < 0 || offerX < 0 || offerY >= H || offerX >= W)
						continue;
					if (map[offerY][offerX] != 0 || isCheck[k - 1][offerY][offerX])
						continue;
					isCheck[k - 1][offerY][offerX] = true;
					queue.add(new Nodes(offerY, offerX, cnt + 1, k - 1));
				}
		}
	}
}
