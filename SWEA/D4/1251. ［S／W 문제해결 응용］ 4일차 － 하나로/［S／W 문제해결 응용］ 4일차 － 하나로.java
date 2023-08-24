import java.io.*;
import java.util.*;

public class Solution {

	public static class IsLand {
		int x;
		int y;

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}
	}

	public static class Tunnel implements Comparable<Tunnel> {
		int Node;
		double sum;

		public Tunnel(int node, double sum) {
			super();
			Node = node;
			this.sum = sum;
		}

		@Override
		public int compareTo(Tunnel o) {
			return Double.compare(this.sum, o.sum);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int testN = Integer.parseInt(br.readLine());
		for (int t = 1; t <= testN; t++) {

			int N = Integer.parseInt(br.readLine());
			IsLand[] map = new IsLand[N];
			ArrayList<Tunnel>[] al = new ArrayList[N];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int X = Integer.parseInt(st.nextToken());
				map[i] = new IsLand();
				map[i].setX(X);
			}
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int Y = Integer.parseInt(st.nextToken());
				map[i].setY(Y);
			}

			double E = Double.parseDouble(br.readLine());

			for (int i = 0; i < N; i++) {
				al[i] = new ArrayList<>();
				for (int j = 0; j < N; j++) {
					if (i != j) {
						double x = Math.abs(map[i].getX() - map[j].getX());
						double y = Math.abs(map[i].getY() - map[j].getY());
						double sum = Math.pow(x, 2) + Math.pow(y, 2);
						al[i].add(new Tunnel(j, sum));
					}
				}
			}

			PriorityQueue<Tunnel> pq = new PriorityQueue<>();
			double sum = 0.0;
			boolean[] isCheck = new boolean[N];
			pq.add(new Tunnel(0, 0L));
			while (true) {
				if (pq.isEmpty())
					break;
				Tunnel tunnel = pq.poll();
				int node = tunnel.Node;
				if (isCheck[node])
					continue;
				sum += tunnel.sum;
				isCheck[node] = true;

				for (int i = 0; i < al[node].size(); i++) {
					Tunnel nodes = al[node].get(i);
					if (isCheck[nodes.Node])
						continue;
					pq.add(nodes);
				}

			}
			Long ans = Math.round(sum * E);
			sb.append("#" + t + " " + ans + "\n");

		}
		System.out.print(sb);

	}
}