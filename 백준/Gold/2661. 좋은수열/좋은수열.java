import java.util.*;
import java.io.*;

public class Main {

	public static int N;
	public static String answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());

		backtracking("");
		sb.append(answer);
		System.out.println(sb);
	}

	public static void backtracking(String nums) {
		if (answer != null)
			return;

		if (nums.length() == N) {
			answer = nums;
			return;
		}
		for (int i = 1; i <= 3; i++) {
			if (isCheck(nums + i))
				backtracking(nums + i);
		}
	}

	public static boolean isCheck(String nums) {
		for (int i = 1; i <= nums.length() / 2; i++) {
			String front = nums.substring(nums.length() - i * 2, nums.length() - i);
			String back = nums.substring(nums.length() - i, nums.length());
			if (front.equals(back))
				return false;
		}
		return true;
	}
}