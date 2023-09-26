class Solution {
    public static long solution(int[] sequence) {
		long answer = 0;
		long[][] dp = new long[2][sequence.length];
		for (int i = 0; i < dp.length; i++) {

			int start = 0;
			if (i == 0) {
				start = 1;
			} else if (i == 1) {
				start = -1;
			}
			long minValue = sequence[0] * start;
			answer = Math.max(minValue, answer);
			dp[i][0] = minValue;
			for (int j = 1; j < dp[i].length; j++) {
				start = start * -1;
				long num = sequence[j] * start;
				long value = dp[i][j - 1];
				long sum = num + value;
				dp[i][j] = sum;
				answer = Math.max(answer, num);
				answer = Math.max(answer, sum - minValue);
				answer = Math.max(answer, sum);
				minValue = Math.min(minValue, sum);
			}
		}

		return answer;
	}
}