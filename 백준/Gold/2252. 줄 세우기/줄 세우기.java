import java.io.*;
import java.util.*;

public class Main {

	public static int N, M;
	public static int[] dep;
	public static ArrayList<Integer>[] al;
	public static ArrayList<Integer> ans = new ArrayList<>();
	public static boolean[] isCheck;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		dep = new int[N + 1];
		al = new ArrayList[N + 1];
		isCheck = new boolean[N + 1];
		for (int i = 1; i <= N; i++) {
			al[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			dep[num2]++;
			al[num1].add(num2);
		}
		DFS();
		for (int num : ans)
			sb.append(num + " ");
		System.out.println(sb);
	}

	private static void DFS() {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for (int i = 1; i < N + 1; i++) {
			if (dep[i] == 0) {
				queue.add(i);
				isCheck[i] = true;
			}
		}
		while (true) {
			if (queue.isEmpty())
				return;
			
			int num = queue.poll();
			ans.add(num);
			for (int number : al[num]) {
				dep[number]--;
			}
			for (int i = 1; i < N + 1; i++) {
				if (dep[i] == 0 && !isCheck[i]) {
					queue.add(i);
					isCheck[i] = true;
				}
			}
		}
	}

}