import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		for (int i = 1; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				sb.append("*");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}

}
