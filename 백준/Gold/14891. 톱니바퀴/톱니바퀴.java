import java.util.*;
import java.io.*;

public class Main {

	public static LinkedList<Integer>[] wheels;
	public static boolean[] isCheck;
	public static int K;
	public static boolean[] visitCheck;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		wheels = new LinkedList[4];

		for (int i = 0; i < 4; i++) {
			String wheel = br.readLine();
			wheels[i] = new LinkedList<>();
			for (int j = 0; j < 8; j++) {
				wheels[i].add(wheel.charAt(j) - '0');
			}
		}

		K = Integer.parseInt(br.readLine());
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			int direction = Integer.parseInt(st.nextToken());

			// 두번째 6번째 바퀴가 같은지 틀린지 같으면 true 다르면 false false값 처리 귀찮아서 여기서 초기화
			isCheck = new boolean[3];
			if (wheels[0].get(2) == wheels[1].get(6))
				isCheck[0] = true;
			if (wheels[1].get(2) == wheels[2].get(6))
				isCheck[1] = true;
			if (wheels[2].get(2) == wheels[3].get(6))
				isCheck[2] = true;

			visitCheck = new boolean[4];
			run(number - 1, direction);
		}

		int score = 0;

		for (int i = 0; i < 4; i++) {
			if (wheels[i].get(0) != 0) {
				if (i == 0)
					score += 1;
				else if (i == 1)
					score += 2;
				else if (i == 2)
					score += 4;
				else
					score += 8;
			}
		}
		sb.append(score);
		System.out.println(sb);
	}

	// 재귀로 풀면 될거 같은데
	private static void run(int number, int direction) {
		// 만약 number 가 몇인경우에 isCheck문이 false 이면 옆에것도 돌고 일단 돌고 시작할까?
		// -1 반시계 첫번째까 마지막으로 가야됨

		visitCheck[number] = true;

		if (direction == -1) {
			wheels[number].add(wheels[number].size() - 1, wheels[number].pollFirst());
		} else {
			wheels[number].add(0, wheels[number].pollLast());
		}
		// 돌았고 그럼 옆에 것들 확인 해야될거같은데
		if (number == 0) {
			if (!isCheck[0] && !visitCheck[1]) {
				if (direction == 1)
					run(1, -1);
				else
					run(1, 1);
			}
		} else if (number == 1) {
			if (!isCheck[0] && !visitCheck[0]) {
				if (direction == 1)
					run(0, -1);
				else
					run(0, 1);
			}
			if (!isCheck[1] && !visitCheck[2]) {
				if (direction == 1)
					run(2, -1);
				else
					run(2, 1);
			}
		} else if (number == 2) {
			if (!isCheck[1] && !visitCheck[1]) {
				if (direction == 1)
					run(1, -1);
				else
					run(1, 1);
			}
			if (!isCheck[2] && !visitCheck[3]) {
				if (direction == 1)
					run(3, -1);
				else
					run(3, 1);
			}
		} else {
			if (!isCheck[2] && !visitCheck[2]) {
				if (direction == 1)
					run(2, -1);
				else
					run(2, 1);
			}
		}

	}
}
