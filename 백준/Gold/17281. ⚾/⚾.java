import java.util.*;
import java.io.*;

public class Main {

	public static int innings;
	public static int[][] scores;
	public static int[] numbers;
	public static boolean[] isCheck;
	public static int ans = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		innings = Integer.parseInt(br.readLine());
		scores = new int[innings][9];

		for (int i = 0; i < innings; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				scores[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		numbers = new int[8];
		isCheck = new boolean[9];
		permutation(0);
		sb.append(ans);
		System.out.println(sb);
	}

	private static void permutation(int cnt) {
		if (cnt == 8) {
			int[] nums = new int[9];
			int index = 0;
			for (int i = 0; i < nums.length; i++) {
				if (i == 3)
					nums[i] = 0;
				else
					nums[i] = numbers[index++];
			}
			play(nums);
			return;
		}
		for (int i = 1; i < 9; i++) {
			if (isCheck[i] == true)
				continue;
			numbers[cnt] = i;
			isCheck[i] = true;
			permutation(cnt + 1);
			isCheck[i] = false;
		}
	}

	private static void play(int[] nums) {
		int totalScore = 0;
		int start = 0;
		for (int i = 0; i < innings; i++) {
			int outCount = 0;
			int score = 0;
			Queue<Integer> queue = new ArrayDeque<Integer>();
			while (true) {
				if (outCount == 3)
					break;
				int num = scores[i][nums[start++]];
				if (num == 0) {
					outCount++;
				} else if (num == 4) {
					while (true) {
						if (queue.isEmpty())
							break;
						if (queue.poll() == 1)
							score++;
					}
					score++;
				} else {
					for (int j = 1; j <= num; j++) {
						if (j == 1)
							queue.add(1);
						else
							queue.add(0);
					}

					if (queue.size() > 3)
						while (true) {
							if (queue.size() == 3)
								break;
							if (queue.poll() == 1)
								score++;
						}
				}
				if (start == 9)
					start = 0;
			}
			totalScore += score;
		}
		ans = Math.max(ans, totalScore);
	}
}
