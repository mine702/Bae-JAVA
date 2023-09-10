import java.io.*;
import java.util.*;
class Solution {
    public static int[] solution(long[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = conversion(numbers[i]);
		}
		return answer;
	}

	public static int conversion(long num) {
		String binaryString = Long.toBinaryString(num);
		// maxindex 구하기 나누기 2 해서 나머지가 0이면 -1 나머지가 1이면 그대로
		int maxIndex = binaryString.length();
		if (maxIndex % 2 == 0) {
			maxIndex = maxIndex / 2 - 1;
		} else {
			maxIndex = maxIndex / 2;
		}
		// 인덱스 숫자 중 하나를 검사해 준다 1인경우 돌게
		for (int i = 0; i <= maxIndex; i++) {
			if (binaryString.charAt(i) == '1') {
				// 1인경우 뒤에 만큼 0을 추가해준다
				// 어떻게 해줄껀데
				// 뒤에 있는 수
				String binary = "";
				int backSize = binaryString.length() - (i + 1);
				// 앞에 있는 수
				int frontSize = i;
				if (frontSize < backSize) {
					for (int j = 0; j < backSize - frontSize; j++) {
						binary += "0";
					}
				}
				String str = binary + binaryString;
				double number = Math.log10(str.length() + 1) / Math.log10(2);
				if (Math.floor(number) != Math.ceil(number))
					continue;
				if (binaryTree(str)) {
					return 1;
				}
			}
		}
		return 0;
	}

	public static class Prosecutor {
		int startIndex;
		int endIndex;

		public Prosecutor(int startIndex, int endIndex) {
			super();
			this.startIndex = startIndex;
			this.endIndex = endIndex;
		}
	}

	// 1 -> 3 -> 5 씩 2씩 늘어나서 검사하는거 안되면 바로 false return
	public static boolean binaryTree(String binary) {
		int startIndex = 0;
		int endIndex = binary.length() - 1;
		Queue<Prosecutor> queue = new ArrayDeque<>();
		queue.add(new Prosecutor(startIndex, endIndex));
		while (true) {
			if (queue.isEmpty()) {
				break;
			}
			Prosecutor prosecutor = queue.poll();
			int start = prosecutor.startIndex;
			int end = prosecutor.endIndex;
			int mid = (start + end) / 2;
			if (start == mid || end == mid || start == end) {
				continue;
			}
			int rightMid = (start + mid - 1) / 2;
			int leftMid = (mid + 1 + end) / 2;
			if (binary.charAt(mid) == '0') {
				if (binary.charAt(rightMid) == '1' || binary.charAt(leftMid) == '1') {
					return false;
				}
			}
			if (Math.abs(mid - rightMid) == 1 || Math.abs(mid - leftMid) == 1)
				continue;
			queue.add(new Prosecutor(start, mid - 1));
			queue.add(new Prosecutor(mid + 1, end));
		}
		return true;
	}
}