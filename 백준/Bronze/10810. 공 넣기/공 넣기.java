import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] numbers = new int[N + 1];
		for (int cnt = 0; cnt < M; cnt++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			for (int cnt2 = i; cnt2 <= j; cnt2++) {
				numbers[cnt2] = k;
			}
		}
		for(int i = 1; i < numbers.length; i++) {
			sb.append(numbers[i] + " ");
		}
		System.out.println(sb);
	}

}
