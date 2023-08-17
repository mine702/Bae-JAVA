import java.io.*;
import java.util.*;

public class Solution {

	static int N, M, C; // 통크기, 각일꾼의 선택 할 수 있는 벌꿀통수, 꿀의최대양
	static int[][] map = new int[10][10];

	static class Honey implements Comparable<Honey> {
		int r, c, profit;

		public Honey(int r, int c, int profit) {
			this.r = r;
			this.c = c;
			this.profit = profit;
		}

		@Override
		public int compareTo(Honey o) {
			return o.profit - profit;
		}
	}

	static PriorityQueue<Honey> pq;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			pq = new PriorityQueue<>();
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < N; k++) {
					map[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			setMaxProfit();
			System.out.println("#" + i + " " + getMaxProfit());
		}
	}

	private static int getMaxProfit() {
		Honey first = pq.poll(); // r : 0, c : 0 ,, r : 0, c : 1 M이 2일 경우 처리하면 안됨..
		while (!pq.isEmpty()) {
			Honey h = pq.poll();
			if (first.r != h.r) {
				return first.profit + h.profit;
			}
			if (Math.abs(first.c - h.c) >= M) {
				return first.profit + h.profit;
			}
		}
		return -1;
	}

	private static void setMaxProfit() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= N - M; j++) {
				pq.add(new Honey(i, j, calMaxCost(i, j, 0, 0, 0)));
			}
		}
	}

	private static int calMaxCost(int r, int c, int cnt, int sumHoney, int sumCost) { // r, c 의 위치에서의 부분집합 구하기
		if (sumHoney > C)
			return 0;
		if (cnt == M) {
			return sumCost;
		}
		return Math.max(calMaxCost(r, c + 1, cnt + 1, sumHoney, sumCost),
				calMaxCost(r, c + 1, cnt + 1, sumHoney + map[r][c], sumCost + map[r][c] * map[r][c]));
	}

}