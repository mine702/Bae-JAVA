import java.io.*;
import java.util.*;

public class Main {

	public static class Nodes implements Comparable<Nodes> {
		int size;
		int price;

		public Nodes(int size, int price) {
			this.size = size;
			this.price = price;
		}

		@Override
		public int compareTo(Nodes o) {
			if (this.size == o.size) {
				return this.price - o.price;
			}
			return this.size - o.size;
		}
	}

	public static List<Nodes> list = new ArrayList<>();
	public static List<Integer> bag = new ArrayList<>();
	public static int start = 0;
	public static long ans = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());
			list.add(new Nodes(M, V));
		}

		Collections.sort(list);

		for (int i = 0; i < K; i++) {
			bag.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(bag);

		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

		for (int i = 0; i < K; i++) {
			while (start < N && list.get(start).size <= bag.get(i)) {
				pq.offer(list.get(start++).price);
			}
			if (!pq.isEmpty()) {
				ans += pq.poll();
			}
		}

		sb.append(ans);
		System.out.println(sb);
	}
}