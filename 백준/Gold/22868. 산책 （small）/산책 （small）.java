import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static List<Integer>[] list;

	public static class Nodes implements Comparable<Nodes> {
		String nodes;
		int cnt;

		public Nodes(String nodes, int cnt) {
			this.nodes = nodes;
			this.cnt = cnt;
		}

		@Override
		public int compareTo(Nodes o) {
			if (this.cnt == o.cnt) {
				String[] nodes1 = this.nodes.split(" ");
				String[] nodes2 = o.nodes.split(" ");
				for (int i = 0; i < nodes1.length; i++) {
					int node1 = Integer.parseInt(nodes1[i]);
					int node2 = Integer.parseInt(nodes2[i]);
					if (node1 != node2) {
						return node1 - node2;
					}
				}
			}
			return this.cnt - o.cnt;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		list = new ArrayList[N + 1];
		for (int i = 1; i < list.length; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			list[A].add(B);
			list[B].add(A);
		}
		for (int i = 1; i < list.length; i++) {
			Collections.sort(list[i]);
		}
		st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		if (S == E) {
			sb.append(0);
		} else {
			String walk = BFS(S, E, N, " ");
			String walkBack = BFS(E, S, N, walk);
			String[] walks = walk.split(" ");
			String[] walkBacks = walkBack.split(" ");
			int count = walks.length + walkBacks.length - 2;
			sb.append(count);
		}
		System.out.println(sb);
	}

	private static String BFS(int S, int E, int N, String node) {
		Queue<Nodes> queue = new PriorityQueue<>();
		boolean[] isCheck = new boolean[N + 1];
		String[] walkNodes = node.split(" ");
		for (int i = 0; i < walkNodes.length; i++) {
			int num = Integer.parseInt(walkNodes[i]);
			if (num == S || num == E)
				continue;
			isCheck[Integer.parseInt(walkNodes[i])] = true;
		}
		queue.add(new Nodes(String.valueOf(S), 0));
		isCheck[S] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			Nodes nodes = queue.poll();
			String[] nextNodes = nodes.nodes.split(" ");
			int nextNode = Integer.parseInt(nextNodes[nextNodes.length - 1]);
			if (nextNode == E)
				return nodes.nodes;

			for (int i = 0; i < list[nextNode].size(); i++) {
				int next = list[nextNode].get(i);
				if (isCheck[next])
					continue;
				isCheck[next] = true;
				queue.add(new Nodes(nodes.nodes + " " + String.valueOf(next), nodes.cnt + 1));
			}
		}
		return "";
	}

}