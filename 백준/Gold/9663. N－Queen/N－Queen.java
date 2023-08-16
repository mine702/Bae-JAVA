import java.util.*;
import java.io.*;

public class Main {

	public static int N, col[], ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		col = new int[N + 1];
		ans = 0;
		setQueen(1);
		sb.append(ans);
		System.out.println(sb);
	}

	private static void setQueen(int row) {

		if (!isAvilable(row - 1))
			return;
		if (row > N) {
			ans++;
			return;
		}
		for (int c = 1; c <= N; c++) {
			col[row] = c;
			setQueen(row + 1);
		}
	}

	private static boolean isAvilable(int row) {
		for (int i = 1; i < row; i++) {
			if (col[i] == col[row] || row - i == Math.abs(col[row] - col[i])) {
				return false;
			}
		}
		return true;
	}
}