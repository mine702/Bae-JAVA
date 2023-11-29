import java.io.*;
import java.util.*;

class Solution {
    public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
	public static Map<Integer, Integer> map = new HashMap<>();
	public static int[][] mapCheck;
	public static int[][] landClone;
	public static int num = 0;

	public static int solution(int[][] land) {
		landClone = land;
		mapCheck = new int[land.length][land[0].length];

		for (int i = 0; i < land.length; i++) {
			for (int j = 0; j < land[i].length; j++) {
				if (land[i][j] != 0 && mapCheck[i][j] == 0) {
					BFS(i, j);
				}
			}
		}

		int answer = 0;

		for (int i = 0; i < land[0].length; i++) {
			int sum = 0;
			Set<Integer> check = new HashSet<>();
			for (int j = 0; j < land.length; j++) {
				check.add(mapCheck[j][i]);
			}

			for (Integer num : check) {
				if (num != 0)
					sum += map.get(num);
			}
			answer = Math.max(answer, sum);
		}
		return answer;
	}

	public static void BFS(int startY, int startX) {
		num++;
		int sum = 1;
		Queue<int[]> queue = new ArrayDeque<>();
		mapCheck[startY][startX] = num;
		queue.add(new int[] { startY, startX });
		while (true) {
			if (queue.isEmpty())
				break;
			int[] location = queue.poll();
			int y = location[0];
			int x = location[1];

			for (int i = 0; i < locations.length; i++) {
				int offerY = y + locations[i][0];
				int offerX = x + locations[i][1];

				if (offerY < 0 || offerX < 0 || offerY >= landClone.length || offerX >= landClone[0].length)
					continue;

				if (mapCheck[offerY][offerX] != 0 || landClone[offerY][offerX] == 0)
					continue;

				mapCheck[offerY][offerX] = num;
				sum++;
				queue.add(new int[] { offerY, offerX });
			}
		}
		map.put(num, sum);
	}
}