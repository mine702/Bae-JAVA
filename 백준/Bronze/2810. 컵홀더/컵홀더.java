import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			char result = str.charAt(i);
			if (count == N) {
				break;
			} else if (result == 'L') {
				i++;
				count++;
			} else {
				count++;
			}
		}
		sb.append(count);
		System.out.println(sb);
	}
}