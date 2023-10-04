import java.io.*;
import java.util.*;

public class Solution {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			int N = Integer.parseInt(br.readLine());
			int M = Integer.parseInt(br.readLine());
			ArrayList<Integer>[] upper = new ArrayList[N + 1];
			ArrayList<Integer>[] down = new ArrayList[N + 1];
			for (int j = 1; j <= N; j++) {
				upper[j] = new ArrayList<>();
				down[j] = new ArrayList<>();
			}
			for (int j = 0; j < M; j++) {
				st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				upper[a].add(b);
				down[b].add(a);
			}
			int count = 0;
			for (int j = 1; j <= N; j++) {
				boolean[] upperCheck = BFS(upper, j, N + 1);
				boolean[] downCheck = BFS(down, j, N + 1);
				boolean answer = true;
				for (int k = 1; k <= N; k++) {
					if (!(upperCheck[k] || downCheck[k]))
						answer = false;
				}
				if (answer)
					count++;

			}
			sb.append("#" + i + " " + count + "\n");
		}
		System.out.print(sb);
	}

	private static boolean[] BFS(ArrayList<Integer>[] upper, int j, int N) {
		boolean[] isCheck = new boolean[N];
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(j);
		isCheck[j] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			int num = queue.poll();
			for (int i = 0; i < upper[num].size(); i++) {
				int number = upper[num].get(i);
				if (isCheck[number])
					continue;
				queue.add(number);
				isCheck[number] = true;
			}
		}

		return isCheck;
	}
}