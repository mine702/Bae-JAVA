import java.io.*;
import java.util.*;

public class Main {

	public static class Nodes implements Comparable<Nodes> {
		int a;
		int b;
		int price;

		public Nodes(int a, int b, int price) {
			this.a = a;
			this.b = b;
			this.price = price;
		}

		@Override
		public int compareTo(Nodes o) {
			return this.price - o.price;
		}
	}

	public static List<Nodes> list;
	public static int[] parents;
	public static int answer = 0;

	public static void Kruskal() {
		for (int i = 0; i < list.size(); i++) {
			Nodes nodes = list.get(i);
			if (parents[find(nodes.a)] == parents[find(nodes.b)])
				continue;
			union(nodes.a, nodes.b);
			answer += nodes.price;
		}
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (a > b) {
			parents[a] = b;
		} else {
			parents[b] = a;
		}
	}

	public static int find(int node) {
		if (parents[node] == node)
			return node;
		else
			return find(parents[node]);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		parents = new int[N + 1];
		list = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			parents[i] = i;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(st.nextToken());
			list.add(new Nodes(a, b, price));
		}

		Collections.sort(list);

		Kruskal();

		sb.append(answer);
		System.out.println(sb);
	}

}