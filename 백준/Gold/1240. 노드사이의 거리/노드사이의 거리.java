import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main {

	public static ArrayList<Nodes>[] list;

	public static class Nodes {
		int nextN;
		int size;

		public Nodes(int nextN, int size) {
			this.nextN = nextN;
			this.size = size;
		}

	}

	public static class NodeSize {
		int nextN;
		int sumSizes;

		public NodeSize(int nextN, int sumSizes) {
			this.nextN = nextN;
			this.sumSizes = sumSizes;
		}

	}

	public static int sizeCheck(int start, int end) {
		int sumSize = 0;
		boolean[] isCheck = new boolean[list.length];
		Queue<NodeSize> queue = new ArrayDeque<>();
		queue.add(new NodeSize(start, 0));
		isCheck[start] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			NodeSize nodeSize = queue.poll();

			int nextN = nodeSize.nextN;
			int sumSizes = nodeSize.sumSizes;

			if (nextN == end) {
				sumSize = sumSizes;
				break;
			}
			for (int i = 0; i < list[nextN].size(); i++) {
				Nodes nodes = list[nextN].get(i);
				int node = nodes.nextN;
				int size = nodes.size;
				if (isCheck[node])
					continue;
				isCheck[node] = true;
				queue.add(new NodeSize(node, sumSizes + size));
			}
		}
		return sumSize;
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

		for (int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int size = Integer.parseInt(st.nextToken());
			list[A].add(new Nodes(B, size));
			list[B].add(new Nodes(A, size));
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int answer = sizeCheck(A, B);
			sb.append(answer + "\n");
		}
		System.out.println(sb);
	}

}