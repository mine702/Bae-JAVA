import java.util.*;
class Solution {
    	public static int[][] dp;
	public static List<Node>[] adjacentList;
	public static int[][] faresClone;

	public static class Node {
		int node;
		int size;

		public Node(int node, int size) {
			super();
			this.node = node;
			this.size = size;
		}

	}

	public static int solution(int n, int s, int a, int b, int[][] fares) {
		int answer = Integer.MAX_VALUE;
		adjacentList = new ArrayList[n + 1];
		dp = new int[n + 1][3];
		faresClone = fares;
		for (int i = 1; i < adjacentList.length; i++) {
			Arrays.fill(dp[i], Integer.MAX_VALUE);
			adjacentList[i] = new ArrayList<>();
		}
		for (int i = 0; i < fares.length; i++) {
			int start = fares[i][0];
			int end = fares[i][1];
			int size = fares[i][2];
			adjacentList[start].add(new Node(end, size));
			adjacentList[end].add(new Node(start, size));
		}

		for (int i = 0; i < 3; i++) {
			if (i == 0) {
				dp[a][i] = 0;
				makeDP(i, a);
			} else if (i == 1) {
				dp[b][i] = 0;
				makeDP(i, b);
			} else if (i == 2) {
				dp[s][i] = 0;
				makeDP(i, s);
			}
		}
		for (int i = 1; i < dp.length; i++) {
			int sum = dp[i][0] + dp[i][1] + dp[i][2];
			answer = Math.min(sum, answer);
		}
		return answer;
	}

	public static void makeDP(int cnt, int endValue) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(endValue);
		while (true) {
			if (queue.isEmpty())
				break;
			int num = queue.poll();
			for (int i = 0; i < adjacentList[num].size(); i++) {
				Node nodes = adjacentList[num].get(i);
				int nums = nodes.node;
				int sizes = nodes.size;
				int sumSize = dp[num][cnt] + sizes;
				if (dp[nums][cnt] > sumSize) {
					dp[nums][cnt] = sumSize;
					queue.add(nums);
				} else {
					continue;
				}
			}
		}
	}
}