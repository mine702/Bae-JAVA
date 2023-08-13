import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] numbers = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(st.nextToken());
			numbers[i] = num;
		}
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > L)
				break;
			L++;
		}
		sb.append(L);
		System.out.println(sb);
	}

}