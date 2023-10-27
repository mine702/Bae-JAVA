import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		int start = 1;
		int end = K;
		while (start < end) {
			int mid = (start + end) / 2;
			int count = 0;
			for (int i = 1; i <= N; i++) {
				count += Math.min(mid / i, N);
			}
			if (count >= K)
				end = mid;
			else
				start = mid + 1;
		}
		sb.append(start);
		System.out.println(sb);
	}
}