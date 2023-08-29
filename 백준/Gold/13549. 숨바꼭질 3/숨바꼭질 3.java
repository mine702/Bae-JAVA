import java.util.*;
import java.io.*;

public class Main {

	public static int N;
	public static int K;
	public static int ans = Integer.MAX_VALUE;

	public static class Node implements Comparable<Node> {
		int location;
		int time;

		public Node(int location, int time) {
			super();
			this.location = location;
			this.time = time;
		}

		@Override
		public int compareTo(Node o) {
			return this.time - o.time;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		if (N == K)
			ans = 0;
		else
			BFS();

		sb.append(ans);
		System.out.println(sb);
	}

	private static void BFS() {
		int[] isCheck = new int[200002];
		Arrays.fill(isCheck, Integer.MAX_VALUE);

		PriorityQueue<Node> queue = new PriorityQueue<>();
		queue.add(new Node(N, 0));
		isCheck[N] = 0;
		while (true) {
			if (queue.isEmpty())
				break;

			Node node = queue.poll();
			int location = node.location;
			int time = node.time;
			if (time >= ans)
				continue;
			if (location == K) {
				ans = Math.min(ans, time);
				continue;
			}

			int index1 = location + 1;
			int index2 = location - 1;
			int index3 = location * 2;

			if (index1 < isCheck.length / 2 + 1) {
				if (isCheck[index1] > time + 1) {
					queue.add(new Node(index1, time + 1));
					isCheck[index1] = time + 1;
				}
			}
			if (index2 >= 0) {
				if (isCheck[index2] > time - 1) {
					queue.add(new Node(index2, time + 1));
					isCheck[index2] = time + 1;
				}
			}
			if (index3 < isCheck.length) {
				if (isCheck[index3] > time) {
					queue.add(new Node(index3, time));
					isCheck[index3] = time;
				}
			}
		}
	}
}
