import java.util.*;
class Solution {
    public static class Node implements Comparable<Node> {
		int x;
		int y;
		int time;
		String route;

		Node(int x, int y, int time, String route) {
			this.x = x;
			this.y = y;
			this.time = time;
			this.route = route;
		}

		public String toString() {
			return route;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.route.compareTo(o.route);
		}
	}

	static int[] dx = { 1, 0, 0, -1 }, dy = { 0, -1, 1, 0 };

	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	
	public String solution(int n, int m, int x, int y, int r, int c, int k) {
		PriorityQueue<Node> q = new PriorityQueue<>();
		q.offer(new Node(x - 1, y - 1, 0, ""));
		boolean[][] v = new boolean[n][m];
		v[x - 1][y - 1] = true;
		while (!q.isEmpty()) {
			Node now = q.poll();
			if (now.x == r - 1 && now.y == c - 1 && now.time == k)
				return now.route;
			if (now.time > k)
				continue;
			if (!ispossible(now.x, now.y, r - 1, c - 1, k - now.time))
				continue;
			for (int d = 0; d < 4; d++) {
				int nx = now.x + dx[d];
				int ny = now.y + dy[d];
				if (nx < 0 || ny < 0 || nx >= n || ny >= m)
					continue;
				String Nroute = "";
				if (d == 0)
					Nroute = now.route + "d";
				else if (d == 1)
					Nroute = now.route + "l";
				else if (d == 2)
					Nroute = now.route + "r";
				else
					Nroute = now.route + "u";
				q.offer(new Node(nx, ny, now.time + 1, Nroute));
			}
		}
		return "impossible";
	}

	boolean ispossible(int x, int y, int r, int c, int time) {
		int rest = Math.abs(r - x) + Math.abs(c - y);
		if (rest > time)
			return false;
		if ((rest % 2) - (time % 2) == 0)
			return true;
		return false;
	}
}