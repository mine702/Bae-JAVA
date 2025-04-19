import java.io.*;
import java.util.*;

public class Main {

	public static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());

		int sum = 0;
		int big = 0;
		for(int i = 0 ; i < N; i++){
			int num = Integer.parseInt(st.nextToken());
			if(num > big) big = num;
			sum += num;
		}
		
		sb.append(sum - big);
		System.out.println(sb);
	}
}
