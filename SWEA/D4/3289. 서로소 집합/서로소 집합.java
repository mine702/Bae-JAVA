import java.io.*;
import java.util.*;

public class Solution {

	public static int n, m;
	public static int[] parents;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());

			parents = new int[n];

			make();
			String result = "";
			for (int i = 0; i < m; i++) {
				st = new StringTokenizer(br.readLine());
				int order = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken()) - 1;
				int b = Integer.parseInt(st.nextToken()) - 1;
				if (order == 0) {
					Union(a, b);
				} else {
					if (find_set(a, b))
						result += "1";
					else
						result += "0";
				}
			}
			sb.append("#" + tc + " " + result + "\n");

		}
		System.out.println(sb);
	}

	private static int find(int a) {
		if (a == parents[a])
			return a;
		else {
			return parents[a] = find(parents[a]);
		}
	}

	private static boolean find_set(int a, int b) {
		if (find(a) == find(b))
			return true;
		else
			return false;
	}

	private static void Union(int a, int b) {
		int left = find(a);
		int right = find(b);
		if (left == right)
			return;
		else {
			parents[right] = left;
		}
	}

	private static void make() {
		for (int i = 0; i < n; i++)
			parents[i] = i;
	}

}