import java.util.*;
import java.io.*;

public class Main {

	public static int N, r, c;
	public static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());

		zCur(0, 0, (int) Math.pow(2, N));
		sb.append(cnt);
		System.out.println(sb);
	}

	private static void zCur(int startX, int startY, int size) {
		if (size <= 1)
			return;
		int xOffset = (r - startX) / (size / 2);
		int yOffset = (c - startY) / (size / 2);
		cnt += (int) Math.pow(size / 2, 2) * (xOffset * 2 + yOffset);
		zCur(startX + (size / 2) * xOffset, startY + (size / 2) * yOffset, size / 2);
	}

}