import java.io.*;
import java.util.*;

public class Main {

	public static int[] D;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		D = new int[N + 1];
		for (int i = 0; i <= N; i++) {
			D[i] = -1;
		}
		D[0] = 0;
		D[1] = 1;
		fibo(N);
		System.out.println(D[N]);
	}

	private static int fibo(int n) {
		if (D[n] != -1)
			return D[n];
		return D[n] = fibo(n - 2) + fibo(n - 1);
	}
}
