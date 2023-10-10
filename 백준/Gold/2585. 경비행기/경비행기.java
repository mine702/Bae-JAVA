import java.io.*;
import java.util.*;

public class Main {

	public static int[][] AdjacentList;
	public static Nodes[] list;

	public static class Nodes {
		int y;
		int x;

		public Nodes(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}

	public static class NodeInfos {
		int nodeN;
		int count;

		public NodeInfos(int nodeN, int count) {
			super();
			this.nodeN = nodeN;
			this.count = count;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		AdjacentList = new int[N + 2][N + 2];
		list = new Nodes[N + 2];
		list[0] = new Nodes(0, 0);
		list[list.length - 1] = new Nodes(10000, 10000);
		for (int i = 1; i < list.length - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			list[i] = new Nodes(y, x);
		}

		for (int i = 0; i < AdjacentList.length; i++) {
			Nodes node = list[i];
			int y = node.y;
			int x = node.x;

			for (int j = i + 1; j < list.length; j++) {
				Nodes node2 = list[j];
				int y2 = node2.y;
				int x2 = node2.x;
				int size = (int) Math.ceil(Math.sqrt((long) Math.pow(y - y2, 2) + (long) Math.pow(x - x2, 2)));
				if (size % 10 > 0)
					size = size / 10 + 1;
				else
					size = size / 10;
				AdjacentList[i][j] = size;
				AdjacentList[j][i] = size;
			}
		}

		double start = Math.ceil(1415 / (K + 2));
		double end = 1415;
		while (start <= end) {
			int mid = (int) ((start + end) / 2);
			if (Operation(0, mid, K)) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		sb.append((int) start);
		System.out.println(sb);
	}

	private static boolean Operation(int Nodes, int start, int K) {
		Queue<NodeInfos> queue = new LinkedList<>();
		boolean[] isCheck = new boolean[list.length];
		queue.add(new NodeInfos(Nodes, 0));
		isCheck[0] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			NodeInfos node = queue.poll();
			int nodeN = node.nodeN;
			int count = node.count;
			if (nodeN == list.length - 1) {
				return true;
			}
			if (count == K + 1)
				continue;

			for (int i = 0; i < AdjacentList[nodeN].length; i++) {
				int nodeSize = AdjacentList[nodeN][i];
				if (nodeSize <= start && !isCheck[i]) {
					isCheck[i] = true;
					queue.add(new NodeInfos(i, count + 1));
				}
			}
		}
		return false;
	}
}
