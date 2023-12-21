import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String str = br.readLine();
		int count = str.length() - str.replace("a", "").length();
		int answer = str.length();

		int start = 0;
		int end = count;

		while (true) {
			if (start == str.length())
				break;
			String check;
			if (end > str.length()) {
				check = str.substring(start, str.length());
				check += str.substring(0, end - str.length());
			} else {
				check = str.substring(start, end);
			}
			answer = Math.min(answer, check.length() - check.replace("b", "").length());
			start++;
			end++;
		}

		sb.append(answer);

		System.out.println(sb);
	}
}