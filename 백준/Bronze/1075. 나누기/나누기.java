import java.util.*;
import java.io.*;

public class Main {

	public static String N;
	public static int F;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = br.readLine();
		F = Integer.parseInt(br.readLine());
		String result = "";
		for (int i = 0; i < N.length(); i++) {
			if (i >= N.length() - 2) {
				result += 0;
			} else {
				result += N.charAt(i);
			}
		}
		int sum = Integer.parseInt(result);
		int max = Integer.parseInt(result) + 100;
		boolean isCheck = true;
		while (true) {
			if (sum % F == 0) {
				break;
			}
			if (sum > max) {
				isCheck = false;
				break;
			}
			sum++;
		}
		String ans = String.valueOf(sum);

		if (isCheck) {
			for (int i = 0; i < ans.length(); i++) {
				if (i >= ans.length() - 2) {
					sb.append(ans.charAt(i));
				}
			}
		}

		System.out.println(sb);
	}
}