import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()); 
		int m = Integer.parseInt(st.nextToken());   		
		int [] arr = new int[n+m];
		
		st = new StringTokenizer(br.readLine());  
		
		for (int i = 0; i < n; i++) { 
			arr[i]= Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < m; i++) {
			arr[i+n] = Integer.parseInt(st.nextToken()); 
		}
		Arrays.sort(arr); 
		
		StringBuilder sb = new StringBuilder();
		
		for(int r : arr) {
			sb.append(r+" "); 
					
		}
		System.out.println(sb);

	}

}