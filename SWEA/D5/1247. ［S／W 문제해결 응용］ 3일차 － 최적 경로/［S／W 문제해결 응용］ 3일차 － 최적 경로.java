import java.io.*;
import java.util.*;

public class Solution {

	public static int N;
	public static int[][] input;
	public static int[] start;
	public static int[] end;
	public static int ans;
	public static boolean[] isCheck;
	public static int[] numbers;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 1; i <= T; i++) {
			ans = Integer.MAX_VALUE;
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			start = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			end = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			input = new int[N][];
			isCheck = new boolean[N];
			numbers = new int[N];
			for (int j = 0; j < N; j++) {
				input[j] = new int[] { Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
			}
			permutation(0);
			sb.append("#" + i + " " + ans + "\n");
		}

		System.out.println(sb);
	}

	private static void permutation(int cnt) {
		if (cnt == N) {
			int sum = 0;
			for (int i = 0; i < N; i++) {
				if (i == 0) {
					sum += Math.abs(start[0] - input[numbers[i]][0]);
					sum += Math.abs(start[1] - input[numbers[i]][1]);
				} else {
					sum += Math.abs(input[numbers[i - 1]][0] - input[numbers[i]][0]);
					sum += Math.abs(input[numbers[i - 1]][1] - input[numbers[i]][1]);
				}
			}
			sum += Math.abs(input[numbers[cnt - 1]][0] - end[0]);
			sum += Math.abs(input[numbers[cnt - 1]][1] - end[1]);
			ans = Math.min(ans, sum);
			return;
		}
		for (int i = 0; i < N; i++) {
			if (isCheck[i])
				continue;
			numbers[cnt] = i;
			isCheck[i] = true;
			permutation(cnt + 1);
			isCheck[i] = false;
		}
	}

}