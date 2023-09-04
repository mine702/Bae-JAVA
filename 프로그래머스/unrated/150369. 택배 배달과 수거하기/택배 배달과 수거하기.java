class Solution {
	public static int deliveriesValue;
	public static int pickupsValue;

	public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
		long answer = 0;
		int deliverieStart = deliveries.length;
		int pickupStart = pickups.length;
		deliveriesValue = sumValue(deliveries);
		pickupsValue = sumValue(pickups);
		while (true) {
			
			if (deliveriesValue == 0 && pickupsValue == 0) {
				break;
			}

			deliverieStart = startValue(deliveries, deliverieStart - 1);
			pickupStart = startValue(pickups, pickupStart - 1);

			answer += deliverieStart;

			Deliveries(deliverieStart, deliveries, cap, 0);

			answer += Math.abs(deliverieStart - pickupStart);

			answer += pickupStart;

			Deliveries(pickupStart, pickups, cap, 1);
		}
		return answer;
	}

	public static int sumValue(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

	public static void Deliveries(int start, int[] deliveries, int cap, int check) {
		int count = cap;
		int sum = 0;
		for (int i = start - 1; i >= 0; i--) {
			if (deliveries[i] >= count) {
				sum += count;
				deliveries[i] -= count;
				break;
			} else {
				sum += deliveries[i];
				count -= deliveries[i];
				deliveries[i] = 0;
			}
		}
		if (check == 0) {
			deliveriesValue -= sum;
		} else {
			pickupsValue -= sum;
		}
	}

	public static int startValue(int[] nums, int start) {
		int index = 0;
		for (int i = start; i >= 0; i--) {
			if (nums[i] != 0) {
				index = i;
				break;
			}
		}
		return index + 1;
	}
}