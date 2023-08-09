import java.io.*;
import java.util.*;

public class Main {

	public static int N, M;
	public static ArrayList<int[]> houses = new ArrayList<>();
	public static ArrayList<int[]> stores = new ArrayList<>();
	public static int[] sel;
	public static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		sel = new int[M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num == 1) {
					houses.add(new int[] { i, j });
				} else if (num == 2) {
					stores.add(new int[] { i, j });
				}
			}
		}

		Combination(0, 0);
		sb.append(ans);
		System.out.println(sb);
	}

	private static void Combination(int cnt, int start) {
		if (cnt == M) {
			int sum = 0;
			for (int i = 0; i < houses.size(); i++) {
				int[] house = houses.get(i);
				int dist = Integer.MAX_VALUE;
				for (int j = 0; j < M; j++) {
					int[] store = stores.get(sel[j]);
					int distance = Math.abs(house[0] - store[0]) + Math.abs(house[1] - store[1]);
					dist = Math.min(dist, distance);
				}
				sum += dist;
			}
			ans = Math.min(ans, sum);
			return;
		}
		for (int i = start; i < stores.size(); i++) {
			sel[cnt] = i;
			Combination(cnt + 1, i + 1);
		}
	}
}