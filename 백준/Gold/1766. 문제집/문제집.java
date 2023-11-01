import java.io.*;
import java.util.*;

public class Main {

	public static List<Integer>[] list;
	public static int[] nums;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		list = new ArrayList[N + 1];
		nums = new int[N + 1];
		for (int i = 0; i < list.length; i++) {
			list[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			nums[B]++;
			list[A].add(B);
		}
		List<Integer> lists = phaseAlignment();
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i) + " ");
		}
		System.out.println(sb);
	}

	private static List<Integer> phaseAlignment() {
		List<Integer> numList = new ArrayList<>();
		Queue<Integer> queue = new PriorityQueue<Integer>();
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == 0)
				queue.add(i);
		}
		while (true) {
			if (queue.isEmpty())
				break;
			int num = queue.poll();
			numList.add(num);
			for (int i = 0; i < list[num].size(); i++) {
				int number = list[num].get(i);
				nums[number]--;
				if (nums[number] == 0)
					queue.add(number);
			}
		}

		return numList;
	}
}