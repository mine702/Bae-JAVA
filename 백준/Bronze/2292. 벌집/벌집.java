import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int count = 1; 
		int range = 2;	
 
		if (N == 1) {
			sb.append(1);
		}
 
		else {
			while (range <= N) {	
				range = range + (6 * count);	 
				count++;	
			}
			sb.append(count);
		}
		System.out.println(sb);
	}	
}