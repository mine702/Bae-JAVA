import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		// 테스트 케이스 수

		// 테스트 케이스 반복
		st = new StringTokenizer(br.readLine());
		// 종이컵 수
		int N = Integer.parseInt(st.nextToken());
		// 시작시 왼쪽에서 몇번째 위치에 목표가 있는지
		int X = Integer.parseInt(st.nextToken());
		// 컵위치를 맞바꾸는 횟수
		int K = Integer.parseInt(st.nextToken());

		// 현재 사탕의 위치를 저장 할 변수 ans 선언
		int ans = X;

		// K만큼 입력이 들어올때마다 만약 A, B 가 ans 값과 동일 하다면 ans 위치 변경
		for (int j = 0; j < K; j++) {
			st = new StringTokenizer(br.readLine());

			// 순서대로 바꾼 두컵의 위치 A, B
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// A가 ans 값과 동일하다면 ans 값을 B로 변경
			if (A == ans) {
				ans = B;
			}
			// B가 ans 값과 동일하다면 ans 값을 A로 변경
			else if (B == ans) {
				ans = A;
			}
		}
		sb.append(ans);

		System.out.println(sb);
	}

}