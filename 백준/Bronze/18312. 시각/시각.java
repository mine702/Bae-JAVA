import java.io.*;
import java.util.*;

public class Main {

	public static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		for(int hour = 0; hour <= N; hour++){
			for(int minute = 0; minute < 60; minute++){
				for(int second = 0; second < 60; second++){
					if(hour%10 == K || hour/10 == K ||minute % 10 == K || minute / 10 == K || second % 10 == K || second / 10 == K)
						count++;
				}
			}
		}
		
		sb.append(count);
		System.out.println(sb);
	}
}
