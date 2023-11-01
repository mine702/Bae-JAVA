import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class Main {

	public static class Nodes implements Comparable<Nodes> {
		int nextNode;
		int size;

		public Nodes(int nextNode, int size) {
			this.nextNode = nextNode;
			this.size = size;
		}

		@Override
		public int compareTo(Nodes o) {
			return this.size - o.size;
		}

	}

	public static List<Nodes>[] adjacentlist;
	public static List<Integer> sizeList = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		adjacentlist = new ArrayList[N + 1];
		for(int i = 0 ; i < adjacentlist.length; i++) {
			adjacentlist[i] = new ArrayList<>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			adjacentlist[A].add(new Nodes(B, C));
			adjacentlist[B].add(new Nodes(A, C));
		}

		Prim();
		Collections.sort(sizeList);
		int sum = 0;
		for(int i = 0 ; i < sizeList.size() - 1; i++) {
			sum += sizeList.get(i);
		}
		sb.append(sum);
		System.out.println(sb);
	}

	private static void Prim() {
		
		int cnt = 0;
		boolean[] isCheck = new boolean[adjacentlist.length];
		Queue<Nodes> queue = new PriorityQueue<>();
		queue.add(new Nodes(1, 0));
		while (true) {
			if (queue.isEmpty() || cnt == adjacentlist.length - 1)
				break;
			Nodes node = queue.poll();
			int nextNode = node.nextNode;
			int size = node.size;
			if (isCheck[nextNode])
				continue;
			isCheck[nextNode] = true;
			cnt++;
			sizeList.add(size);
			for (int i = 0; i < adjacentlist[nextNode].size(); i++) {
				Nodes nodes = adjacentlist[nextNode].get(i);
				if (isCheck[nodes.nextNode])
					continue;
				queue.add(nodes);
			}
		}
	}
}
