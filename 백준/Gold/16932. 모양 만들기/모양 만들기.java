import java.util.*;
import java.io.*;

public class Main {

	public static int N;
	public static int M;
	public static int[][] map;
	public static int[][] locations = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
	public static HashMap<Integer, Integer> hashmap = new HashMap<>();
	public static int num = 2;
	public static int answer = 0;

	public static class Nodes {
		int Y;
		int X;

		public Nodes(int y, int x) {
			super();
			Y = y;
			X = x;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		map = new int[N][M];
		List<Nodes> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int nums = Integer.parseInt(st.nextToken());
				map[i][j] = nums;
				if (nums == 0)
					list.add(new Nodes(i, j));
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					makeMap(i, j);
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			int y = list.get(i).Y;
			int x = list.get(i).X;
			int nums = isCheck(y, x);
			answer = Math.max(answer, nums);
		}

		sb.append(answer);
		System.out.println(sb);
	}

	private static int isCheck(int y, int x) {
		Set<Integer> checked = new HashSet<>();
		int size = 1;
		for (int i = 0; i < 4; i++) {
			int offerY = y + locations[i][0];
			int offerX = x + locations[i][1];

			if (offerY < 0 || offerY >= N || offerX < 0 || offerX >= M)
				continue;

			if (map[offerY][offerX] == 0)
				continue;

			if (checked.contains(map[offerY][offerX]))
				continue;

			checked.add(map[offerY][offerX]);
			size += hashmap.get(map[offerY][offerX]);
		}
		return size;
	}

	private static void makeMap(int y, int x) {
		Queue<Nodes> queue = new LinkedList<>();
		queue.add(new Nodes(y, x));
		map[y][x] = num;
		int size = 1;
		while (true) {
			if (queue.isEmpty())
				break;

			Nodes node = queue.poll();
			for (int i = 0; i < 4; i++) {
				int offerY = node.Y + locations[i][0];
				int offerX = node.X + locations[i][1];

				if (offerY < 0 || offerY >= N || offerX < 0 || offerX >= M)
					continue;

				if (map[offerY][offerX] != 1)
					continue;

				map[offerY][offerX] = num;
				queue.add(new Nodes(offerY, offerX));
				size++;
			}
		}

		hashmap.put(num++, size);
	}

}