import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static List<Integer>[] tube;
	public static List<Integer>[] list;

	public static class Nodes {

		int node;
		int cost;

		public Nodes(int node, int cost) {
			this.node = node;
			this.cost = cost;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		tube = new LinkedList[M];
		list = new LinkedList[N + 1];

		for (int i = 1; i < list.length; i++) {
			list[i] = new LinkedList<>();
		}

		for (int i = 0; i < M; i++) {
			tube[i] = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < K; j++) {
				int num = Integer.parseInt(st.nextToken());
				tube[i].add(num);
				list[num].add(i);
			}
		}
		int answer = BFS(1, N, M);
		sb.append(answer);
		System.out.println(sb);
	}

	private static int BFS(int start, int N, int M) {
		boolean[] tubeCheck = new boolean[M];
		boolean[] isCheck = new boolean[N + 1];
		Queue<Nodes> queue = new ArrayDeque<>();
		queue.add(new Nodes(start, 1));
		isCheck[start] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			Nodes nodes = queue.poll();
			int node = nodes.node;
			int cost = nodes.cost;
			if (node == N) {
				return cost;
			}

			for (int i = 0; i < list[node].size(); i++) {
				int tubeN = list[node].get(i);
				if (tubeCheck[tubeN])
					continue;
				tubeCheck[tubeN] = true;
				for (int j = 0; j < tube[tubeN].size(); j++) {
					int nextNode = tube[tubeN].get(j);
					if (isCheck[nextNode])
						continue;
					isCheck[nextNode] = true;
					queue.add(new Nodes(nextNode, cost + 1));
				}
			}
		}
		return -1;
	}
}
