import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long N = Long.parseLong(st.nextToken());
		long M = Long.parseLong(st.nextToken());

		st = new StringTokenizer(br.readLine());
		long sum = 0;
		for(int i = 0 ; i < N ; i++){
			long num = Long.parseLong(st.nextToken());
			sum += num - 1;
		}
		
		if(sum < M)
			sb.append("OUT");
		else
			sb.append("DIMI");
		System.out.println(sb);
	}
}
