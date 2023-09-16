import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int answer = 0;
		for (int i = 0; i < 8; i++) {
			String chess = br.readLine();
			if (i % 2 == 0) {
				for (int j = 0; j < chess.length(); j += 2) {
					char ch = chess.charAt(j);
					if (ch == 'F')
						answer++;
				}
			} else {
				for (int j = 1; j < chess.length(); j += 2) {
					char ch = chess.charAt(j);
					if (ch == 'F')
						answer++;
				}
			}
		}
		sb.append(answer);
		System.out.println(sb);
	}
}