import java.io.*;
import java.util.*;

public class Main {

	public static boolean[] isCheck;
	public static int[] nums;
	public static StringBuilder sb = new StringBuilder();
	public static int N;
	public static int M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		isCheck = new boolean[10001];
		nums = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			isCheck[Integer.parseInt(st.nextToken())] = true;
		}
		Combination(0);
		System.out.println(sb);
	}

	public static void Combination(int cnt) {
		if (cnt == M) {
			for (int num : nums) {
				sb.append(num + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < isCheck.length; i++) {
			if (isCheck[i]) {
				nums[cnt] = i;
				Combination(cnt + 1);
			}
		}
	}
}