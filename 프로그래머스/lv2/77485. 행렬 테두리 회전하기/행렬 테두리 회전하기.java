import java.util.*;
class Solution {
	public static int[][] map;
	public static int[][] locations = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

	public static int[] solution(int rows, int columns, int[][] queries) {
		int[] answer = new int[queries.length];
		map = new int[rows][columns];
		int num = 1;
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = num++;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			int x1 = queries[i][0] - 1;
			int y1 = queries[i][1] - 1;
			int x2 = queries[i][2] - 1;
			int y2 = queries[i][3] - 1;

			answer[i] = turn(x1, y1, x2, y2);
		}
		return answer;
	}

	public static int turn(int x1, int y1, int x2, int y2) {
		int answer = Integer.MAX_VALUE;
		int num = map[x1][y1];
		int x = x1;
		int y = y1;
		for (int i = 0; i < locations.length; i++) {
			while (true) {
				x += locations[i][0];
				y += locations[i][1];
				if (x < x1 || x > x2 || y < y1 || y > y2) {
					x -= locations[i][0];
					y -= locations[i][1];
					break;
				}
				int num2 = map[x][y];
				answer = Math.min(answer, num2);
				map[x][y] = num;
				num = num2;
			}
		}
		return answer;
	}
}