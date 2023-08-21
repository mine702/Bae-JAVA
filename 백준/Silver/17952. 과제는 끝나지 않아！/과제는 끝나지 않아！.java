import java.util.*;
import java.io.*;

public class Main {

	// 주어진 분기 N 전역 변수로 선언
	public static int N;

	public static void main(String[] args) throws IOException {
		// 입력 시 BufferedReader 출력시 StringBuilder
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 공백 처리를 위해 StringTokenizer 사용
		StringTokenizer st;

		// 분기 N 저장
		N = Integer.parseInt(br.readLine());

		// 속도 증진을 위해 stack 대신 ArrayDeque 사용
		ArrayDeque<int[]> stack = new ArrayDeque<>();

		// 총 업무 점수 저장할 변수 선언
		int sum = 0;

		// 분기만큼 반복문
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			// 1이 입력 되었을 경우 A, T 입력, 0일 시 A, T 입력 불가
			int isCheck = Integer.parseInt(st.nextToken());
			if (isCheck == 1) {
				// 점수 입력 변수 A
				int A = Integer.parseInt(st.nextToken());

				// 시간 입력 변수 T
				int T = Integer.parseInt(st.nextToken());

				// stack 에 저장
				stack.add(new int[] { A, T });
			}

			// null 오류 발생 되지 않도록 stack 이 비어 있지 않을 경우 수행
			if (!stack.isEmpty()) {

				// 새로운 업무 추가시 하던 업무 중단후 새로운 업무 진행으로
				// ArrayDeque 의 pollLast 사용하여 최근 넣은 값 poll
				int[] nums = stack.pollLast();

				// 분기 마다 반복문이 돌기 때문에 T--
				nums[1]--;

				// T가 0일때 완료 의미로 A를 sum에 더해준다
				if (nums[1] == 0)
					sum += nums[0];

				// 0이 아닐경우 완료 되지 않았다는 의미로 stack에 저장
				else
					stack.add(nums);
			}
		}
		// sum 출력
		sb.append(sum);

		System.out.println(sb);
	}

}