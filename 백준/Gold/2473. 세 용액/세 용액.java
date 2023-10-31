import java.io.*;
import java.util.*;
import java.util.logging.Logger;

public class Main {

	public static List<Long> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Long.parseLong(st.nextToken()));
		}

		Collections.sort(list);
		long answer = Long.MAX_VALUE;
		long[] numbers = new long[3];
		
		for (int i = 0; i < N; i++) {
			int left = i + 1;
			int right = N - 1;

			while (left < right) {
				long sum = list.get(i) + list.get(left) + list.get(right);

				long answers = Math.abs(sum);

				if (answers < answer) {
					answer = answers;
					numbers[0] = list.get(i);
					numbers[1] = list.get(left);
					numbers[2] = list.get(right);
				}

				if (sum > 0) {
					right--;
				} else {
					left++;
				}
			}
		}
		sb.append(numbers[0] + " " + numbers[1] + " " + numbers[2]);
		System.out.println(sb);
	}
}