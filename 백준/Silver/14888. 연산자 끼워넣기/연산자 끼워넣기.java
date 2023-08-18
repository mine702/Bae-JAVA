import java.io.*;
import java.util.*;

public class Main {

	public static int N;
	public static int[] input;
	public static String[] operator;
	public static int[] numbers;
	public static boolean[] isCheck;

	public static int maxValue = Integer.MIN_VALUE;
	public static int minValue = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		// N 값 입력
		N = Integer.parseInt(br.readLine());
		// 우선순위 없이 앞부터 진행
		input = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		// string이 비교하기 편하니까 string 배열로가자
		operator = new String[N - 1];
		// 연산자 저장
		int index = 0;
		for (int i = 0; i < 4; i++) {
			int num = Integer.parseInt(st.nextToken());
			for (int j = 0; j < num; j++) {
				if (i == 0)
					operator[index] = "+";
				else if (i == 1)
					operator[index] = "-";
				else if (i == 2)
					operator[index] = "*";
				else if (i == 3)
					operator[index] = "/";
				index++;
			}
		}
		numbers = new int[N - 1];
		isCheck = new boolean[N - 1];
		permutation(0);
		sb.append(maxValue + "\n" + minValue);
		System.out.println(sb);
	}
	// N이 최대 11개니까 연산자 나와봤자 10개인데 그냥 순열로 풀면 되는거 아닌가? 10! 이니까
	// 10! = 300만 인데 2초가 2억이니까 상관없을듯? 그럼 그냥 순열로 가자
	// 그럼 순열로 가면 연산자 저장된걸 연산자로 다시 바꿔야 되니까 연산자 배열을 다시 만들자
	// 그래서 N-1 로 준거같은데 순열 만들때 배열로 하는게 편하니까 배열로가자
	// 연산자 배열 저장 코드 작성 했고 이제 순열 만들자 중복은 허용이 안되니까 visited 배열 작성하고

	// 순열 작성 완료 했고 이제 작성된 순열로 값 체크해서 max랑 min 체크 하면 되는거잖아

	private static void permutation(int cnt) {
		if (cnt == N - 1) {
			// input 에서 num 뽑기
			// 첫값을 sum 으로 저장하고 1 부터 시작 하면
			int sum = input[0];
			for (int i = 1; i < N; i++) {
				int num = input[i];
				String oper = operator[numbers[i - 1]];
				if (oper.equals("+"))
					sum += num;
				else if (oper.equals("-"))
					sum -= num;
				else if (oper.equals("*"))
					sum *= num;
				else if (oper.equals("/"))
					sum /= num;

			}
			minValue = Math.min(minValue, sum);
			maxValue = Math.max(maxValue, sum);
			return;
		}
		for (int i = 0; i < operator.length; i++) {
			if (isCheck[i])
				continue;
			numbers[cnt] = i;
			isCheck[i] = true;
			permutation(cnt + 1);
			isCheck[i] = false;
		}
	}

}