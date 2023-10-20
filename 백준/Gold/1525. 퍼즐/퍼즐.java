import java.io.*;
import java.util.*;

public class Main {

	// 문자열중 0문자 인덱스가 0일때 1칸과 3칸 가면된다
	public static int[][] locations = { { 3, 1 }, { 3, -1, 1 }, { 3, -1 }, { -3, 3, 1 }, { -3, 3, -1, 1 },
			{ -3, 3, -1 }, { -3, 1 }, { -3, -1, 1 }, { -3, -1 } };
	public static HashMap<String, Integer> hashmap = new HashMap<>();

	public static class Nodes {
		String nodes;
		int count;

		public Nodes(String nodes, int count) {
			this.nodes = nodes;
			this.count = count;
		}

	}

	// 0의 위치에 따라 0 이동값을 바꿈
	// 1 0 3
	// 4 2 5
	// 7 8 6
	// 103425786 문자열로 변환 하면 이건데
	// 0을 for 문을 사용해서 찾고 0 위치가 0 ~ 2 이면 상 불가
	// 3 ~ 5 이면 상 하 가능
	// 6 ~ 8 이면 하 불가
	// 여기서 중간값 일때만 양 옆 가능 하고 나머지는 안됨

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String fNodes = "";
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				fNodes += st.nextToken();
			}
		}
		if (fNodes.equals("123456780"))
			sb.append(0);
		else
			sb.append(BFS(fNodes));
		System.out.println(sb);
	}

	private static int BFS(String fNodes) {
		Queue<Nodes> queue = new ArrayDeque<>();
		queue.add(new Nodes(fNodes, 0));
		hashmap.put(fNodes, 1);
		while (true) {
			if (queue.isEmpty())
				break;
			Nodes nodes = queue.poll();
			String node = nodes.nodes;
			int size = nodes.count;
			for (int i = 0; i < node.length(); i++) {
				if (node.charAt(i) == '0') {
					for (int j = 0; j < locations[i].length; j++) {
						StringBuilder sb1 = new StringBuilder(node);
						sb1.setCharAt(i, node.charAt(i + locations[i][j]));
						sb1.setCharAt(i + locations[i][j], '0');
						String nodeClone = sb1.toString();
						if (hashmap.containsKey(nodeClone))
							continue;
						if (nodeClone.equals("123456780")) {
							return size + 1;
						}
						hashmap.put(nodeClone, 1);
						queue.add(new Nodes(nodeClone, size + 1));
					}
				}
			}
		}
		return -1;
	}

}
