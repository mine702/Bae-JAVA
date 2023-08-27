import java.util.*;

import java.io.*;

public class Solution {

	public static int M, A;
	public static int[][] map;
	public static int[] Amove, Bmove, powers;
	public static HashMap<Location, Integer>[] hm;
	public static int sum;
	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static class Location {
		int Y;
		int X;

		public Location(int y, int x) {
			super();
			Y = y;
			X = x;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Location)
				if (this.X == ((Location) obj).X)
					if (this.Y == ((Location) obj).Y)
						return true;

			return false;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + X;
			result = prime * result + Y;
			return result;
		}

	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			map = new int[11][11];
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			A = Integer.parseInt(st.nextToken());

			Amove = new int[M + 1];
			Bmove = new int[M + 1];
			hm = new HashMap[A];
			powers = new int[A];

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= M; i++) {
				Amove[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= M; i++) {
				Bmove[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < A; i++) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				int C = Integer.parseInt(st.nextToken());
				int P = Integer.parseInt(st.nextToken());
				hm[i] = new HashMap<>();
				powers[i] = P;
				makeBt(X, Y, C, P, i);
			}
			sum = 0;
			mapMove();

			sb.append("#" + tc + " " + sum + "\n");
		}
		System.out.println(sb);
	}

	private static void mapMove() {
		int startAY = 1;
		int startAX = 1;
		int startBY = 10;
		int startBX = 10;
		for (int i = 0; i <= M; i++) {
			@SuppressWarnings("unchecked")
			boolean[] isCheck = new boolean[A];
			int[] moves = new int[2];

			moves[0] = Amove[i];
			moves[1] = Bmove[i];
			for (int j = 0; j < 2; j++) {
				int location = moves[j];
				if (location == 1) {
					if (j == 0) {
						startAY -= 1;
					} else {
						startBY -= 1;
					}
				} else if (location == 2) {
					if (j == 0) {
						startAX += 1;
					} else {
						startBX += 1;
					}
				} else if (location == 3) {
					if (j == 0) {
						startAY += 1;
					} else {
						startBY += 1;
					}
				} else if (location == 4) {
					if (j == 0) {
						startAX -= 1;
					} else {
						startBX -= 1;
					}
				}
			}
			boolean Check = true;
			ArrayList<Integer> aChose = new ArrayList<>();
			ArrayList<Integer> bChose = new ArrayList<>();
			if (map[startAY][startAX] != 0) {
				for (int j = 0; j < A; j++) {
					if (hm[j].get(new Location(startAY, startAX)) != null) {
						isCheck[j] = true;
						aChose.add(j);
					}
				}
			}
			if (map[startBY][startBX] != 0) {
				for (int j = 0; j < A; j++) {
					if (hm[j].get(new Location(startBY, startBX)) != null) {
						bChose.add(j);
						if (isCheck[j])
							Check = false;
					}
				}
			}
			if (Check) {
				int Asum = 0;
				int Bsum = 0;
				for (int j = 0; j < aChose.size(); j++) {
					Asum = Math.max(Asum, powers[aChose.get(j)]);
				}
				for (int j = 0; j < bChose.size(); j++) {
					Bsum = Math.max(Bsum, powers[bChose.get(j)]);
				}
				sum += Asum + Bsum;
			} else {
				int maxSum = 0;
				for (int j = 0; j < aChose.size(); j++) {
					boolean[] useCheck = new boolean[A];
					int ac = aChose.get(j);
					useCheck[ac] = true;
					int Asum = powers[ac];
					int Bsum = 0;
					for (int k = 0; k < bChose.size(); k++) {
						int bc = bChose.get(k);
						if (useCheck[bc])
							continue;
						Bsum = Math.max(Bsum, powers[bc]);
					}
					maxSum = Math.max(maxSum, Asum + Bsum);
				}
				sum += maxSum;
			}

		}
	}

	private static void makeBt(int X, int Y, int C, int P, int num) {
		boolean[][] isCheck = new boolean[11][11];
		map[Y][X] = 1;
		hm[num].put(new Location(Y, X), num);
		Queue<int[]> queue = new ArrayDeque<>();
		queue.add(new int[] { Y, X, 0 });
		isCheck[Y][X] = true;
		while (true) {
			if (queue.isEmpty())
				break;
			int[] nums = queue.poll();
			int y = nums[0];
			int x = nums[1];
			int size = nums[2];
			if (size >= C)
				continue;
			for (int i = 0; i < locations.length; i++) {
				int offerY = y + locations[i][0];
				int offerX = x + locations[i][1];

				if (offerY > 10 || offerY < 1 || offerX > 10 || offerX < 1)
					continue;
				if (!isCheck[offerY][offerX]) {
					map[offerY][offerX] = 1;
					hm[num].put(new Location(offerY, offerX), num);
					queue.add(new int[] { offerY, offerX, size + 1 });
					isCheck[offerY][offerX] = true;
				}
			}
		}
	}

}