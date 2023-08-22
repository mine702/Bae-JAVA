import java.io.*;
import java.util.*;

public class Main {

	public static int L, C;
	public static String[] input;
	public static int[] output;
	public static StringBuilder sb = new StringBuilder();
	// 문제 조합이랑 백트래킹 이용해서 풀어서 시간을 줄인다
	// 일단 순서 알파벳이 암호에서 증가하는 순서로 배열 되었을 것이라 했으니 sort 를 사용해서 정렬한다
	// 최소 한개 모음 aeiou 와 최소 두개의 자음으로 구성 되어있다고 알려져 있다고 하였으니 전체 배열과
	// 조합해서 나온 값을 비교를 한다 그후 가능 하지 않으면 바로 return 시킨다

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 조합 나와야 될 개수
		L = Integer.parseInt(st.nextToken());
		output = new int[L];
		// 조합시 원소들
		C = Integer.parseInt(st.nextToken());
		input = new String[C];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < C; i++) {
			input[i] = st.nextToken();
		}
		Arrays.sort(input);
		// 조합
		Combination(0, 0);
		System.out.println(sb);
	}

	private static void Combination(int cnt, int start) {
		if (cnt == L) {
			int vowelCount = 0;
			int consonantCount = 0;
			String result = "";
			for (int i = 0; i < cnt; i++) {
				String outStr = input[output[i]];
				if (outStr.equals("a") || outStr.equals("e") || outStr.equals("i") || outStr.equals("o")
						|| outStr.equals("u")) {
					vowelCount++;
				} else {
					consonantCount++;
				}
				result += outStr;
			}
			if (vowelCount >= 1 && consonantCount >= 2)
				sb.append(result + "\n");
			return;
		}
		for (int i = start; i < C; i++) {
			output[cnt] = i;
			Combination(cnt + 1, i + 1);
		}
	}
}