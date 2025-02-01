import java.io.*;
import java.util.*;

public class Main {
	static String[] mirror;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.valueOf(st.nextToken());
		mirror = new String[n];
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String line = st.nextToken();
			mirror[i] = line;
		}
		
		st = new StringTokenizer(br.readLine());
		int k = Integer.valueOf(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		if(k == 1) {
			for(int i = 0; i < n; i++) {
				sb.append(mirror[i]);
				if(i + 1 < n) 
					sb.append("\n");
			}
		}
		if(k == 2) {
			for(int i = 0; i < n; i++) {
				sb.append(new StringBuffer(mirror[i]).reverse().toString());
				if(i + 1 < n) 
					sb.append("\n");
			}
		}
		if(k == 3) {
			for(int i = n - 1; i >= 0; i--) {
				sb.append(mirror[i]);
				if(i > 0) 
					sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}