import java.util.*;
import java.io.*;

public class Main {

	public static int N, C;
	public static int[] input;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		input = new int[N];

		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}
		// 배열 정리 해서 이분 탐색 해야되는데 이분탐색 할때는 거리 보는거니깐
		// 최소가 1 최대가 마지막 숫자 랑 첫값 빼서 나온 값 + 1 이잖아
		Arrays.sort(input);
		int start = 1;
		int end = input[N - 1] - input[0] + 1;

		// 이제 이걸 start 부터 end 값 해서 값을 찾는건데 c 가 키값이고 이분탐색 해서
		// 나온 값으로 공유기 설치 했을 때 c 보다 작으면 줄여야지

		sb.append(search(start, end));
		System.out.println(sb);
	}

	public static int search(int start, int end) {
		// 이분탐색 구조 짜야됨 UpperBound 형식으로
		// 데이터 내 특정 k 값보다 처음으로 큰 값이 나오는 위치를 리턴해주는 알고리즘
		// 1. 무한 루프문 돌리기 만약
		// 크거나 같으면 내리고 작으면 올려
		int mid = 0;
		while (start < end) {
			mid = (start + end) / 2;
			// 여기서 나온 mid 값으로 공유기 설치 해봐야지
			if (installation(mid))
				start = mid + 1;
			else
				end = mid;
		}
		return end - 1;
	}

	public static boolean installation(int mid) {
		// 여기서 공유기 설치 로직 돌려봐야되는데 첫번째랑 비교 하면 되잖아 그러고 설치 변경 되면
		// 설치 변경된곳 바꿔주고
		int start = 0;
		int count = 1;
		for (int i = 1; i < input.length; i++) {
			if (input[i] - input[start] >= mid) {
				count++;
				start = i;
			}
		}
		if (count >= C)
			return true;
		else
			return false;
	}
}