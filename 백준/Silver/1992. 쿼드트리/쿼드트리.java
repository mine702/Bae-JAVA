
import java.io.*;
import java.util.*;

public class Main {

	public static int[][] nums;
	public static int N;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		nums = new int[N][N];
		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			for (int j = 0; j < num.length(); j++) {
				nums[i][j] = num.charAt(j) - '0';
			}
		}

		recursion(0, 0, N - 1, N - 1);
		System.out.println(sb);
	}

	public static void recursion(int startX, int startY, int endX, int endY) {
		boolean whiteS = false;
		boolean blackS = false;
		boolean success = true;

		if (startX == endX && startY == endY) {
			if (nums[startY][startX] == 1) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			return;
		}

		for (int i = startY; i <= endY; i++) {
			if (!success)
				break;
			for (int j = startX; j <= endX; j++) {
				if (!success)
					break;
				if (nums[i][j] == 0) {
					whiteS = true;
					if (blackS)
						success = false;
				} else {
					blackS = true;
					if (whiteS)
						success = false;
				}
			}
		}

		if (success) {
			if (whiteS) {
				sb.append(0);
				return;
			} else if (blackS) {
				sb.append(1);
				return;
			}
		}

		sb.append("(");
		int midX = (startX + endX) / 2;
		int midY = (startY + endY) / 2;
		recursion(startX, startY, midX, midY);
		recursion(midX + 1, startY, endX, midY);
		recursion(startX, midY + 1, midX, endY);
		recursion(midX + 1, midY + 1, endX, endY);
		sb.append(")");
	}

}
