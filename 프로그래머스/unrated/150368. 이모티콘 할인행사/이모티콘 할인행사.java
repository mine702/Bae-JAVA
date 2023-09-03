class Solution {
    public static int[] numbers;
	public static int[][] usersArr;
	public static int[] emoticonsArr;
	public static int maxCount;
	public static int maxSum;

	public static int[] solution(int[][] users, int[] emoticons) {
		usersArr = users;
		emoticonsArr = emoticons;
		numbers = new int[emoticons.length];
		maxCount = 0;
		maxSum = Integer.MIN_VALUE;
		permutation(0, emoticons.length);
		int[] answers = new int[] {maxCount, maxSum};
		return answers;
	}

	private static void permutation(int cnt, int N) {
		if (cnt == N) {
			int[] userSum = new int[usersArr.length];
			for (int i = 0; i < cnt; i++) {
				int saleCount = (emoticonsArr[i] * numbers[i]) / 100;
				int salePrice = emoticonsArr[i] - saleCount;
				for (int j = 0; j < usersArr.length; j++) {
					if (usersArr[j][0] <= numbers[i]) {
						userSum[j] += salePrice;
					}
				}
			}
			int count = 0;
			int sum = 0;
			for(int i = 0 ; i < userSum.length; i++) {
				if(usersArr[i][1] <= userSum[i]) {
					count++;
				}else {
					sum += userSum[i];
				}
			}
			if(maxCount <= count) {
				if(maxCount == count) {
					maxSum = Math.max(maxSum, sum);
				}else {
					maxCount = count;
					maxSum = sum;
				}
			}
			return;
		}
		for (int i = 40; i >= 10; i -= 10) {
			numbers[cnt] = i;
			permutation(cnt + 1, N);
		}
	}
}