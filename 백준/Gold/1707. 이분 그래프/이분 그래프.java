import java.util.*;
import java.io.*;

public class Main {

	public static ArrayList<Integer>[] list;
	public static boolean answer;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int K = Integer.parseInt(br.readLine());

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			list = new ArrayList[V + 1];
			answer = true;
			for (int j = 1; j < list.length; j++) {
				list[j] = new ArrayList<>();
			}
			for (int j = 0; j < E; j++) {
				st = new StringTokenizer(br.readLine());
				int u = Integer.parseInt(st.nextToken());
				int v = Integer.parseInt(st.nextToken());

				list[u].add(v);
				list[v].add(u);
			}
			BFS(V);
			if (answer)
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}
		System.out.println(sb);
	}

	private static void BFS(int nodes) {
		int start = 1;
		int[] nums = new int[nodes + 1];
		while (true) {
			Queue<Integer> queue = new ArrayDeque<>();
			boolean check = true;
			for (int i = start; i < nums.length; i++) {
				if (nums[i] == 0) {
					start = i;
					check = false;
					break;
				}
			}

			if (check || !answer)
				break;

			queue.add(start);
			nums[start] = 1;

			while (true) {
				if (queue.isEmpty() || !answer)
					break;
				int node = queue.poll();
				int color = nums[node];
				for (int i = 0; i < list[node].size(); i++) {
					int number = list[node].get(i);
					if (nums[number] == 0) {
						int nextColor = 0;
						if (color == 1)
							nextColor = 2;
						else
							nextColor = 1;
						nums[number] = nextColor;
						queue.add(number);
					} else {
						if (nums[number] == color) {
							answer = false;
							break;
						}
					}
				}
			}
		}
	}

}
