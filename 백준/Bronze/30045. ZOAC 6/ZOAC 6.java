import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length() - 1; j++) {
				char ch = str.charAt(j);
				if (ch == 'O') {
					char last = str.charAt(j + 1);
					if (last == 'I') {
						count++;
						break;
					}
				} else if (ch == '0') {
					char last = str.charAt(j + 1);
					if (last == '1') {
						count++;
						break;
					}
				}
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
}