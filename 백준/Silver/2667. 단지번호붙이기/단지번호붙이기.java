import java.io.*;
import java.util.*;

public class Main {
	public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public static int N;
	public static int[][] map;
	public static ArrayList<Integer> al;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		// 이차원 배열 생성 크기 N, N
		map = new int[N + 2][N + 2];

		// 입력 받은거 배열에 넣기
		for (int i = 1; i <= N; i++) {
			String input = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j + 1] = input.charAt(j) - '0';
			}
		}
		al = new ArrayList<>();
		// 이제 BFS 사용해서 탐색 배열에 몇개인지 저장 해야되니까 배열 생성 static 으로
		Search();
		sb.append(al.size() + "\n");
		Collections.sort(al);
		for (int num : al)
			sb.append(num + "\n");
		System.out.println(sb);
	}

	// map 전체 순회 해서 만약 1을 찾으면 bfs 로 넘겨서 끝이 어딘지 확인해
	private static void Search() {
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (map[i][j] == 1)
					BFS(i, j);
			}
		}
	}

	// 받은 인자 값부터 사방탐색 사용하면서 1일경우 count 늘리고 isEmpty 일때까지 해
	private static void BFS(int y, int x) {
		int count = 1;

		Queue<int[]> queue = new ArrayDeque<int[]>();
		queue.add(new int[] { y, x });
		map[y][x] = 0;
		while (true) {
			if (queue.isEmpty())
				break;
			int[] ans = queue.poll();
			// 사방탐색 돌려서 1이면 count 세주고 큐에 넣고 0으로 바꿔
			for (int i = 0; i < locations.length; i++) {
				int y1 = ans[0] + locations[i][0];
				int x1 = ans[1] + locations[i][1];
				if (map[y1][x1] == 1) {
					count++;
					queue.add(new int[] { y1, x1 });
					map[y1][x1] = 0;
				}
			}
		}
		al.add(count);
	}

}