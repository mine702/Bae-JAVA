import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String N = br.readLine();
		String result = "MOBIS";
		boolean check = true;
		for (int i = 0; i < result.length(); i++) {
			boolean isCheck = false;
			char a = result.charAt(i);
			for (int j = 0; j < N.length(); j++) {
				char b = N.charAt(j);
				if (a == b) {
					isCheck = true;
				}
			}
			if(isCheck == false) {
				check = false;
				break;
			}
		}
		if(check) {
			sb.append("YES");
		}else {
			sb.append("NO");
		}
		System.out.println(sb);

	}
}