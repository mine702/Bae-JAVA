import java.util.*;
import java.io.*;

public class Main {

	public static int N, K;
	public static Integer[] input;
	public static Integer[] Differences;
	public static int ans;
	public static HashSet<Integer> set = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		input = set.toArray(new Integer[0]);
		Arrays.sort(input, Collections.reverseOrder());
		Differences = new Integer[input.length - 1];
		int num1 = input[0];
		for (int i = 1; i < input.length; i++) {
			int num2 = input[i];
			Differences[i - 1] = num1 - num2;
			num1 = num2;
		}
		Arrays.sort(Differences);
		for (int i = 0; i < Differences.length - (K - 1); i++) {
			ans += Differences[i];
		}
		sb.append(ans);
		System.out.println(sb);
	}
}