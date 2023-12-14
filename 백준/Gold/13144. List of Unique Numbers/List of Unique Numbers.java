import java.util.*;
import java.io.*;

public class Main {

	public static int[] nums;
	public static boolean[] isCheck = new boolean[100001];
	public static long answer = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		nums = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int pointer1 = 0;
		int pointer2 = 0;

		int size = 0;

		while (true) {
			if (pointer2 >= N)
				break;
			if (isCheck[nums[pointer2]]) {
				answer += size--;
				isCheck[nums[pointer1++]] = false;
			} else {
				isCheck[nums[pointer2++]] = true;
				size++;
			}
		}
		for (int i = 1; i <= size; i++) {
			answer += i;
		}
		sb.append(answer);
		System.out.println(sb);
	}
}