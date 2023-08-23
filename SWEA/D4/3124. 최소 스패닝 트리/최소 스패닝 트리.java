import java.io.*;
import java.util.*;

public class Solution {

	public static int V, E;
	public static ArrayList<Line>[] lines;
	public static boolean[] isCheck;
	public static long total;

	public static class Line implements Comparable<Line> {
		int node;
		int size;

		public Line(int node, int size) {
			super();
			this.node = node;
			this.size = size;
		}

		@Override
		public int compareTo(Line o) {
			return Integer.compare(this.size, o.size);
		}
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int testN = Integer.parseInt(br.readLine());

		for (int t = 1; t <= testN; t++) {
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken());
			E = Integer.parseInt(st.nextToken());

			lines = new ArrayList[V + 1];
			isCheck = new boolean[V + 1];

			for (int i = 1; i <= V; i++) {
				lines[i] = new ArrayList<>();
			}
			for (int i = 0; i < E; i++) {
				st = new StringTokenizer(br.readLine());
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());
				int size = Integer.parseInt(st.nextToken());
				lines[from].add(new Line(to, size));
				lines[to].add(new Line(from, size));
			}
			total = 0;
			Prim(1);
			sb.append("#" + t + " " + total + "\n");
		}
		System.out.print(sb);

	}

	private static void Prim(int start) {
		PriorityQueue<Line> pq = new PriorityQueue<>();
		pq.add(new Line(start, 0));

		while (true) {
			if (pq.isEmpty())
				break;
			Line line = pq.poll();
			int node = line.node;
			int size = line.size;

			if (isCheck[node])
				continue;
			total += size;
			isCheck[node] = true;
			for (Line li : lines[node]) {
				if (!isCheck[li.node])
					pq.add(li);
			}
		}
	}
}