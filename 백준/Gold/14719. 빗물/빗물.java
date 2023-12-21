import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());

		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		int[] nums = new int[W];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < W; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int answer = 0;
		for (int i = 1; i < W - 1; i++) {
			int left = 0;
			int right = 0;

			for (int j = 0; j < i; j++) {
				left = Math.max(left, nums[j]);
			}

			for (int j = i + 1; j < W; j++) {
				right = Math.max(right, nums[j]);
			}

			if (nums[i] < left && nums[i] < right)
				answer += Math.min(left, right) - nums[i];
		}
		sb.append(answer);
		System.out.println(sb);
	}
}