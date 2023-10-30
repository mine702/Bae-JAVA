import java.io.*;
import java.util.*;

public class Main {

	public static boolean[] nums;
	public static List<Integer> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int answer = 0;
		int num = Integer.parseInt(br.readLine());
		nums = new boolean[num + 1];
		nums[0] = nums[1] = true;

		if (num != 1) {
			for (int i = 2; i * i <= num; i++) {
				if (!nums[i]) {
					for (int j = i * i; j <= num; j += i)
						nums[j] = true;
				}
			}

			for (int i = 1; i <= num; i++) {
				if (!nums[i]) {
					list.add(i);
				}
			}
			int start = 0;
			int end = 0;
			int sum = list.get(0);
			while (true) {
				if (start > end)
					break;

				if (sum < num) {
					end++;
					if (list.size() == end)
						break;
					sum += list.get(end);
				} else if (sum > num) {
					if (list.size() == start + 1)
						break;
					sum -= list.get(start);
					start++;
				} else {
					answer++;
					end++;
					if (list.size() == end)
						break;
					sum += list.get(end);
				}
			}
		}
		sb.append(answer);
		System.out.println(sb);
	}
}