import java.util.*;
import java.io.*;

public class Main {

	public static int[] students;
	static int count = 0;
	public static boolean[] teamCheck;
	public static boolean[] isCheck;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine());
			students = new int[N + 1];
			teamCheck = new boolean[N + 1];
			isCheck = new boolean[N + 1];
			count = 0;

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= N; i++) {
				students[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 1; i <= N; i++)
				DFS(i);

			sb.append(N - count + "\n");
		}
		System.out.println(sb);
	}

	static void DFS(int start) {
		if (isCheck[start])
			return;
		isCheck[start] = true;
		int nextNode = students[start];

		if (isCheck[nextNode] != true)
			DFS(nextNode);
		else {
			if (teamCheck[nextNode] != true) {
				count++;
				for (int i = nextNode; i != start; i = students[i])
					count++;
			}
		}
		teamCheck[start] = true;
	}
}