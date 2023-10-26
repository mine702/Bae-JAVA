import java.io.*;
import java.util.*;

public class Main {

	public static class Nodes {
		int time;
		ArrayList<Integer> list;

		public Nodes(int time, ArrayList<Integer> list) {
			this.time = time;
			this.list = list;
		}

	}

	public static Nodes[] nodes;
	public static int[] dp3;

	// dp3 가 빈값이면 돌리고 아니면 하면되
	private static void DFS(int start) {
		if (nodes[start].list.size() == 0) {
			dp3[start] = nodes[start].time;
		} else {
			int max = 0;
			for (int i = 0; i < nodes[start].list.size(); i++) {
				int nextNode = nodes[start].list.get(i);
				if (dp3[nextNode] == -1) {
					DFS(nextNode);
				}
				max = Math.max(max, dp3[nextNode]);
			}
			dp3[start] = nodes[start].time + max;
			return;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		nodes = new Nodes[N + 1];
		dp3 = new int[N + 1];
		Arrays.fill(dp3, -1);
		for (int tc = 1; tc <= N; tc++) {
			st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<>();
			int time = Integer.parseInt(st.nextToken());
			while (true) {
				int num = Integer.parseInt(st.nextToken());
				if (num == -1)
					break;
				list.add(num);
			}
			nodes[tc] = new Nodes(time, list);
		}
		for (int i = 1; i <= N; i++) {
			DFS(i);
			sb.append(dp3[i] + "\n");
		}
		System.out.println(sb);
	}

}