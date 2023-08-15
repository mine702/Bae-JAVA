import java.io.*;
import java.util.*;

public class Main {

	public static int N, r, c, count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		search(0, 0, (int) Math.pow(2, N));
		sb.append(count);
		System.out.println(sb);
	}

	private static void search(int startY, int startX, int size) {
		if (size == 1) {
			return;
		}
		
		int newSize = size / 2;
		int midY = startY + newSize;
		int midX = startX + newSize;
		
		if (r < midY && c < midX) {
			search(startY, startX, newSize);
		} else if (r < midY && c >= midX) {
			count += newSize * newSize;
			search(startY, midX, newSize);
		} else if (r >= midY && c < midX) {
			count += 2 * newSize * newSize;
			search(midY, startX, newSize);
		} else {
			count += 3 * newSize * newSize;
			search(midY, midX, newSize);
		}
	}
}
