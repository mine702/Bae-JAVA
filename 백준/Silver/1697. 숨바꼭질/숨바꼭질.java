import java.io.*;
import java.util.*;

public class Main {

	public static int N, K;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());

		boolean[] isCheck = new boolean[200002];
		Queue<int[]> queue = new ArrayDeque<>();
		int ans = 0;
		queue.add(new int[] { N, 0 });
		isCheck[N] = true;
		while (true) {
			int[] num = queue.poll();
			if (num[0] == K) {
				ans = num[1];
				break;
			} else {
				if (num[0] - 1 >= 0 && num[0] - 1 < isCheck.length && !isCheck[num[0] - 1]) {
					queue.add(new int[] { num[0] - 1, num[1] + 1 });
					isCheck[num[0] - 1] = true;
				}
				if (num[0] + 1 >= 0 && num[0] + 1 < isCheck.length && !isCheck[num[0] + 1]) {
					queue.add(new int[] { num[0] + 1, num[1] + 1 });
					isCheck[num[0] + 1] = true;
				}
				if (num[0] * 2 >= 0 && num[0] * 2 < isCheck.length && !isCheck[num[0] * 2]) {
					queue.add(new int[] { num[0] * 2, num[1] + 1 });
					isCheck[num[0] * 2] = true;
				}

			}

		}
		sb.append(ans);
		System.out.println(sb);
	}

}