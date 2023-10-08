import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			sb.append((char) (ch - 32));
		}
		System.out.println(sb);
	}
}
