import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		Stack<Integer> stack = new Stack<>();
		int answer = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());

			while (!stack.isEmpty()) {
				int num = stack.peek();
				if (num > num2) {
					stack.pop();
					answer++;
				} else if (num == num2) {
					stack.pop();
					break;
				} else {
					break;
				}
			}
			if (num2 == 0)
				continue;

			stack.add(num2);
		}

		answer += stack.size();
		sb.append(answer);
		System.out.println(sb);
	}
}