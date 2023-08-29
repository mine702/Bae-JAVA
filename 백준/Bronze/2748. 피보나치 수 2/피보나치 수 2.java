import java.util.*;
import java.io.*;

public class Main {

	static long totalCnt1, totalCnt2, callCnt1[], callCnt2[], memo[];

	private static long fibo1(int n) {
		
		totalCnt1++;
		callCnt1[n]++;
		if (n < 2)
			return n;
		return fibo1(n - 1) + fibo1(n - 2);
	}

	public static long fibo2(int n) {
		
		totalCnt2++;
		callCnt2[n]++;
		if (memo[n] == -1) {
			memo[n] = fibo2(n - 1) + fibo2(n - 2);
		}
		return memo[n];
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		totalCnt1 = totalCnt2 = 0;
		callCnt1 = new long[N + 1];
		callCnt2 = new long[N + 1];
		memo = new long[N + 1];

		Arrays.fill(memo, -1);
		memo[0] = 0;
		memo[1] = 1;
		System.out.println(fibo2(N));
	}

}