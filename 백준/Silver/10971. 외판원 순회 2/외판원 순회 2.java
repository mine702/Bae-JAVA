import java.util.*;
import java.io.*;

public class Main {

	public static int N;
	public static int[][] cost;
	public static int[][] W;
	public static int[] numbers;
	public static boolean[] isCheck;
	public static int ans = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		W = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				W[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		numbers = new int[N];
		isCheck = new boolean[N];

		permutation(0);
		sb.append(ans);
		System.out.println(sb);
	}

	private static void permutation(int cnt) {
		if (cnt == N) {

			int sum = 0;
			int startNode = numbers[0];

			for (int i = 1; i < cnt; i++) {
				int nextNode = numbers[i];
				int result = W[startNode][nextNode];
				if (result == 0)
					return;
				sum += result;
				startNode = nextNode;
			}
			int returnNum = W[startNode][numbers[0]];
			if(returnNum == 0)
				return;
			sum += returnNum;
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
