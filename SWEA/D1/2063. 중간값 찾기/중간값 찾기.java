import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int result = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n ;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}		
		Arrays.sort(arr);
		double m = Math.round(n/2);
		sb.append(arr[(int)m]);
		br.close();	
		System.out.println(sb);
	}
}