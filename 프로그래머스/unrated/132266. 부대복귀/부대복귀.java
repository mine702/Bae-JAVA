import java.util.*;
class Solution {
    public static List<Integer>[] list;

	public static int[] dp;

	public static int[] solution(int n, int[][] roads, int[] sources, int destination) {
		int[] answer = new int[sources.length];

		list = new ArrayList[n + 1];
		dp = new int[n + 1];
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<>();
		}
		for (int i = 0; i < roads.length; i++) {
			int start = roads[i][0];
			int end = roads[i][1];
			list[start].add(end);
			list[end].add(start);
		}
		BFS(destination);
		for (int i = 0; i < sources.length; i++) {
			int num =  sources[i];
			if(num == destination) {
				answer[i] = 0;
			}else {
				int result = dp[num];
				if(result == 0) {
					answer[i] = -1;
				}else {
					answer[i] = result;
				}
			}
		}
		return answer;
	}

	public static class Nodes {
		int node;
		int size;

		public Nodes(int node, int size) {
			super();
			this.node = node;
			this.size = size;
		}
	}

	// dp 사용해서 목적지에서 1,2,3 까지 갈 수 있는 거리 구할거야
	// 더해가면서 못가면 0이 겠지
	public static void BFS(int destination) {
		Queue<Nodes> queue = new ArrayDeque<>();
		boolean[] isCheck = new boolean[list.length];
		isCheck[destination] = true;
		queue.add(new Nodes(destination, 0));
		while (true) {
			if (queue.isEmpty()) {
				break;
			}
			Nodes nodes = queue.poll();
			int node = nodes.node;
			int size = nodes.size;
			for (int i = 0; i < list[node].size(); i++) {
				int nextNode = list[node].get(i);
				if (isCheck[nextNode])
					continue;
				dp[nextNode] = size + 1;
				queue.add(new Nodes(nextNode, size + 1));
				isCheck[nextNode] = true;
			}
		}
	}
}