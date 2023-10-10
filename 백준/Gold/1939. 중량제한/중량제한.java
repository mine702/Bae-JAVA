import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static class Nodes {
		int node;
		long size;

		public Nodes(int node, long size) {
			this.node = node;
			this.size = size;
		}

	}

	public static List<Nodes>[] list;

	private static boolean BFS(int factory1, int factory2, long mid) {
		Queue<Integer> queue = new ArrayDeque<>();
		boolean[] isCheck = new boolean[list.length];
		queue.add(factory1);
		isCheck[factory1] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			int node = queue.poll();
			if (node == factory2)
				return true;
			for (int i = 0; i < list[node].size(); i++) {
				Nodes nodes = list[node].get(i);
				if (mid <= nodes.size && !isCheck[nodes.node]) {
					isCheck[nodes.node] = true;
					queue.add(nodes.node);
				}
			}
		}

		return false;
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
			long C = Long.parseLong(st.nextToken());
			list[A].add(new Nodes(B, C));
			list[B].add(new Nodes(A, C));
		}
		st = new StringTokenizer(br.readLine());
		int factory1 = Integer.parseInt(st.nextToken());
		int factory2 = Integer.parseInt(st.nextToken());
		long start = 1;
		long end = 1000000000;
		while (start <= end) {
			long mid = (start + end) / 2;
			if (BFS(factory1, factory2, mid)) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		sb.append(end);
		System.out.println(sb);
	}

}
