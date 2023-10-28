import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];

		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(nums);

		int num = (int) Math.round(N * 0.15);

		double sum = 0;
		for (int i = num; i < N - num; i++) {
			sum += nums[i];
		}
		sb.append((int) Math.round(sum / (N - 2 * num)));
		System.out.println(sb);
	}
}
