import java.util.*;
import java.io.*;

public class Main {

	public static int answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		int[][] map = new int[N][N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		game(map, 0);
		sb.append(answer);
		System.out.println(sb);
	}

	private static void game(int[][] map, int cnt) {

		if (cnt == 5) {
			blockCount(map);
			return;
		}

		boolean isCheck = false;
		for (int i = 0; i < 4; i++) {
			int[][] mapClone = new int[map.length][];
			for (int j = 0; j < map.length; j++) {
				mapClone[j] = map[j].clone();
			}

			moveBlock(mapClone, i);
			if (blockCheck(map, mapClone)) {
				isCheck = true;
				game(mapClone, cnt + 1);
			}
		}
		if (!isCheck) {
			blockCount(map);
			return;
		}
	}

	private static boolean blockCheck(int[][] map, int[][] mapClone) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] != mapClone[i][j])
					return true;
			}
		}
		return false;
	}

	private static void blockCount(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				answer = Math.max(answer, map[i][j]);
			}
		}
	}

	private static void moveBlock(int[][] map, int location) {

		if (location == 1) {

			for (int i = map.length - 1; i > 0; i--) {
				for (int j = 0; j < map[i].length; j++) {
					int num = map[i][j];
					if (num != 0) {
						for (int k = i - 1; k >= 0; k--) {
							int num2 = map[k][j];
							if (num2 == 0)
								continue;
							else {
								if (num == num2) {
									map[i][j] = num + num2;
									map[k][j] = 0;
									break;
								} else
									break;
							}
						}
					}
				}
			}

			Queue<Integer> queue = new ArrayDeque<>();
			for (int i = 0; i < map.length; i++) {
				for (int j = map.length - 1; j >= 0; j--) {
					if (map[j][i] != 0) {
						queue.add(map[j][i]);
						map[j][i] = 0;
					}
				}

				for (int j = map.length - 1; j >= 0; j--) {
					if (queue.isEmpty())
						break;
					map[j][i] = queue.poll();
				}
			}

		} else if (location == 2) {

			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length - 1; j++) {
					int num = map[i][j];
					if (num != 0) {
						for (int k = j + 1; k < map[i].length; k++) {
							int num2 = map[i][k];
							if (num2 == 0)
								continue;
							else {
								if (num == num2) {
									map[i][j] = num + num2;
									map[i][k] = 0;
									break;
								} else
									break;
							}
						}
					}
				}
			}

			Queue<Integer> queue = new ArrayDeque<>();
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] != 0) {
						queue.add(map[i][j]);
						map[i][j] = 0;
					}
				}

				for (int j = 0; j < map[i].length; j++) {
					if (queue.isEmpty())
						break;
					map[i][j] = queue.poll();
				}
			}

		} else if (location == 3) {

			for (int i = 0; i < map.length; i++) {
				for (int j = map[i].length - 1; j > 0; j--) {
					int num = map[i][j];
					if (num != 0) {
						for (int k = j - 1; k >= 0; k--) {
							int num2 = map[i][k];
							if (num2 == 0)
								continue;
							else {
								if (num == num2) {
									map[i][j] = num + num2;
									map[i][k] = 0;
									break;
								} else
									break;
							}
						}
					}
				}
			}

			Queue<Integer> queue = new ArrayDeque<>();
			for (int i = 0; i < map.length; i++) {
				for (int j = map[i].length - 1; j >= 0; j--) {
					if (map[i][j] != 0) {
						queue.add(map[i][j]);
						map[i][j] = 0;
					}
				}

				for (int j = map[i].length - 1; j >= 0; j--) {
					if (queue.isEmpty())
						break;
					map[i][j] = queue.poll();
				}

			}

		} else {

			for (int i = 0; i < map.length - 1; i++) {
				for (int j = 0; j < map[i].length; j++) {
					int num = map[i][j];
					if (num != 0) {
						for (int k = i + 1; k < map.length; k++) {
							int num2 = map[k][j];
							if (num2 == 0)
								continue;
							else {
								if (num == num2) {
									map[i][j] = num + num2;
									map[k][j] = 0;
									break;
								} else
									break;
							}
						}
					}
				}
			}

			Queue<Integer> queue = new ArrayDeque<>();
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[j][i] != 0) {
						queue.add(map[j][i]);
						map[j][i] = 0;
					}
				}

				for (int j = 0; j < map[i].length; j++) {
					if (queue.isEmpty())
						break;
					map[j][i] = queue.poll();
				}
			}

		}
	}

}