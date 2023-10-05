import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static class Nodes {
		public int B;
		public int T;

		public Nodes(int b, int t) {
			super();
			B = b;
			T = t;
		}

	}

	public static int[][] dp;
	public static ArrayList<Nodes>[] list;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		dp = new int[N + 1][N + 1];
		list = new ArrayList[N + 1];
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<>();
			Arrays.fill(dp[i], Integer.MAX_VALUE - 100);
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			list[A].add(new Nodes(B, T));
		}
		for (int i = 1; i < N + 1; i++) {
			makeArrival(i, X, N + 1);
		}
		int answer = 0;

		for (int i = 1; i < N + 1; i++) {
			if (i != X) {
				answer = Math.max(answer, dp[i][X] + dp[X][i]);
			}
		}
		sb.append(answer);
		System.out.println(sb);
	}

	private static void makeArrival(int start, int x, int n) {

		Queue<Nodes> queue = new PriorityQueue<>((o1, o2) -> Integer.compare(o1.T, o2.T));
		queue.add(new Nodes(start, 0));
		dp[start][start] = 0;
		while (true) {
			if (queue.isEmpty())
				break;
			Nodes node = queue.poll();
			int nodeB = node.B;
			int cost = node.T;
			for (int i = 0; i < list[nodeB].size(); i++) {
				Nodes nodes = list[nodeB].get(i);
				int nodeN = nodes.B;
				int sumCost = nodes.T;
				if (dp[start][nodeN] < cost + sumCost)
					continue;
				dp[start][nodeN] = cost + sumCost;
				queue.add(new Nodes(nodeN, cost + sumCost));
			}
		}
	}

}