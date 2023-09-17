import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] nums = new int[N + 1];
		for (int i = 1; i < nums.length; i++) {
			nums[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int sum = Math.abs(start - end) / 2 + 1;
			for (int j = 0; j < sum; j++) {
				int num1 = nums[start + j];
				int num2 = nums[end - j];
				nums[start + j] = num2;
				nums[end - j] = num1;
			}
		}
		for (int i = 1; i < nums.length; i++) {
			sb.append(nums[i] + " ");
		}
		System.out.println(sb);
	}
}