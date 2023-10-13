import java.util.*;
import java.io.*;

@SuppressWarnings("unchecked")
public class Main {

	public static List<Nodes>[] list;
	public static int answer = 0;
	public static int[] Reservation = new int[300001];

	public static class Nodes implements Comparable<Nodes> {
		int t1;
		int t2;
		int cusN;

		public Nodes(int t1, int t2, int cusN) {
			this.t1 = t1;
			this.t2 = t2;
			this.cusN = cusN;
		}

		@Override
		public int compareTo(Nodes o) {
			if (this.t2 == o.t2)
				return this.t1 - o.t1;
			return this.t2 - o.t2;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		list = new ArrayList[300001];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int t1 = Integer.parseInt(st.nextToken());
			int t2 = Integer.parseInt(st.nextToken());
			if (list[t2] == null)
				list[t2] = new ArrayList<>();
			list[t2].add(new Nodes(t1, t2, i));
			if (t1 >= t2) {
				Reservation[t1] = i;
			}
		}
		Position(N);

		sb.append(answer);

		System.out.println(sb);
	}

	private static void Position(int N) {
		int time = 1;
		Queue<Nodes> queue = new PriorityQueue<>();
		while (true) {
			if (N == 0)
				break;
			if (list[time] != null) {
				for (int i = 0; i < list[time].size(); i++) {
					Nodes node = list[time].get(i);
					queue.add(node);
				}
			}

			if (!queue.isEmpty()) {
				Nodes node = queue.peek();
				while (true) {
					if (queue.isEmpty())
						break;

					if (time > node.t1) {
						if (Reservation[node.t1] == node.cusN) {
							Reservation[node.t1] = 0;
							answer = Math.max(answer, node.t1 - node.t2);
							queue.poll();
							node = queue.peek();
							N--;
						} else {
							break;
						}
					} else
						break;
				}
				if (!queue.isEmpty()) {
					if (Reservation[time] == 0) {
						N--;
						Reservation[node.t1] = 0;
						answer = Math.max(answer, time - node.t2);
						queue.poll();
					} else {
						if (Reservation[node.t1] != 0 && time >= node.t1) {
							N--;
							Reservation[node.t1] = 0;
							answer = Math.max(answer, node.t1 - node.t2);
							queue.poll();
						}
					}
				}
			}

			time++;
		}
	}
}
