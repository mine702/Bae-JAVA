import java.io.*;
import java.util.*;

public class Main {

	// 그러면 일단 다 연결하고 조합으로 두개 정하고 되면 최솟값 구하면 되는거 아님?
	// 연결이 안되면 -1 이고 무방향 그래프 만들어야 되네? 그럼 인접 행렬 아니면 인접 리스트 인데--
	public static int N;
	public static int[] people;
	public static ArrayList<Integer>[] al;
	public static int[] numbers;
	public static int ans = Integer.MAX_VALUE;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		N = Integer.parseInt(br.readLine());
		people = new int[N + 1];
		al = new ArrayList[N + 1];

		for (int i = 1; i <= N; i++) {
			al[i] = new ArrayList<>();
		}

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}

		// 인접 리스트
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			for (int j = 0; j < num; j++) {
				al[i].add(Integer.parseInt(st.nextToken()));
			}
		}

		for (int i = 1; i <= N / 2; i++) {
			numbers = new int[i];
			Combinations(0, 1, i);
		}
		if (ans == Integer.MAX_VALUE)
			sb.append(-1);
		else
			sb.append(ans);

		System.out.println(sb);
	}

	private static void Combinations(int cnt, int start, int R) {
		if (cnt == R) {
			// 조합으로 나왔어 그럼 나온 값 저장하고 아닌 값 저장 하고 서로 연결 되어있는지 확인 하면 되잖아
			int[] nums = new int[N - cnt];
			int index1 = 0;
			int index2 = 0;

			// 아닌거 배열로 초기화 해주는거 만약 cnt 가 1이면 나머지 것들 배열에 넣기
			for (int i = 1; i <= N; i++) {
				if (index1 < cnt && numbers[index1] == i)
					index1++;
				else
					nums[index2++] = i;
			}
			int num1 = 0;
			if (numbers.length == 1)
				num1 = people[numbers[0]];
			else
				num1 = BFS(numbers);
			if (num1 != 0) {
				int num2 = 0;
				if (nums.length == 1)
					num2 = people[nums[0]];
				else
					num2 = BFS(nums);

				if (num2 != 0) {
					ans = Math.min(ans, Math.abs(num1 - num2));
				}
			}

			return;
		}
		for (int i = start; i <= N; i++) {
			numbers[cnt] = i;
			Combinations(cnt + 1, i + 1, R);
		}
	}

	// number에 담겨있는 배열이 서로 인접한지 확인 하는 작업
	private static int BFS(int[] number) {
		int sum = 0;
		boolean[] isCheck = new boolean[N + 1];
		for (int i = 0; i < number.length; i++) {
			isCheck[number[i]] = true;
		}
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(number[0]);
		isCheck[number[0]] = false;
		while (true) {
			if (queue.isEmpty())
				break;
			int num = queue.poll();
			for (int i = 0; i < al[num].size(); i++) {
				int indexNum = al[num].get(i);
				if (!isCheck[indexNum])
					continue;
				queue.add(indexNum);
				isCheck[indexNum] = false;
			}
		}
		for (int i = 0; i < number.length; i++) {
			if (!isCheck[number[i]])
				sum += people[number[i]];
			else {
				return 0;
			}
		}
		return sum;
	}
}