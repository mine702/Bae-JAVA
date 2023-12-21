import java.util.*;
import java.io.*;

public class Main {
	static int N;
	static int[] nums = new int[26];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				nums[c - 'A'] += (int) Math.pow(10, str.length() - 1 - j);
			}
		}

		Arrays.sort(nums);

		int num = 9;
		int turn = 25;
		int answer = 0;
		while (nums[turn] != 0) {
			answer += nums[turn] * num;
			turn--;
			num--;
		}
		sb.append(answer);
		System.out.print(sb);
	}
}