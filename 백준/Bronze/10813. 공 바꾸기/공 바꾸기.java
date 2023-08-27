import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] numbers = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			numbers[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(st.nextToken());
			int num2 = Integer.parseInt(st.nextToken());
			int number = numbers[num1];
			numbers[num1] = numbers[num2];
			numbers[num2] = number;
		}
		for (int i = 1; i < numbers.length; i++) {
			sb.append(numbers[i] + " ");
		}
		System.out.println(sb);

	}
}