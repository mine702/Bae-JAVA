import java.io.*;
import java.util.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
        
		String n = st.nextToken();
		int numberN = Integer.valueOf(n);
		int m = Integer.valueOf(st.nextToken());
		int len = n.length();
		
		for(int i = 0; i < numberN * len && i <= m; i += len) {
			sb.append(n);
		}
		
		if(sb.length() > m) {
			System.out.print(sb.toString().substring(0, m));
		}
		else {
			System.out.print(sb.toString());
		}
	}
}