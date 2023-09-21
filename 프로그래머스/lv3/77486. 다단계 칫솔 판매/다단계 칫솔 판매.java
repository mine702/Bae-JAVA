import java.util.*;
import java.io.*;
class Solution {
    public static Map<String, String> parent = new LinkedHashMap<>();
	public static Map<String, Integer> dp = new LinkedHashMap<>();

	public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
		int[] answer = new int[enroll.length];
		for (int i = 0; i < enroll.length; i++) {
			parent.put(enroll[i], referral[i]);
			dp.put(enroll[i], 0);
		}
		for (int i = 0; i < seller.length; i++) {
			Calculation(seller[i], amount[i] * 100);
		}
		int cnt = 0;
		for (Iterator<Integer> iterator = dp.values().iterator(); iterator.hasNext();) {
			answer[cnt++] = iterator.next();
		}
		return answer;
	}

	// 여기서 seller 들어오면 계속 이어 나가면 되는데 재귀로 돌릴까?
	// 규칙성
	// 1. seller 는 amount 금액의 10 프로를 받는다
	// 2. 그후 부모 이름을 검색해서 다시 seller 와 amount 를 넘겨준다
	// 3. 만약 부모 이름 검색시 "-" 면 return 으로 재귀를 끝낸다
	public static void Calculation(String seller, int amount) {
		int value = amount / 10;
		int rValue = amount - value;
		dp.put(seller, dp.get(seller) + rValue);
		String parentName = parent.get(seller);
		if (parentName.equals("-") || value == 0)
			return;
		Calculation(parentName, value);
	}
}