import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());

			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			int x = Math.abs(x2 - x1);
			int y = Math.abs(y2 - y1);

			int t = (x + y) / 2;
			int answer = 2 * t + Math.abs(x - t) + Math.abs(y - t);
			sb.append("#" + tc + " " + answer + "\n");
		}
		System.out.println(sb);
	}

}