import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		int T = Integer.parseInt(br.readLine());		
		for(int i = 1 ;i <= T;i++) {
			st = new StringTokenizer(br.readLine());
			int[] arr1 = new int[10];
			for(int j = 0;j<10;j++) {
				int a = Integer.parseInt(st.nextToken());
				arr1[j] = a;
			}
			Arrays.sort(arr1);
			double sum = 0;
			int result = 0;
			for(int j = 1;j<arr1.length-1;j++) {
				sum += arr1[j];
			}
			result = (int) Math.round(sum/8);
			
			sb.append("#"+ i +" "+  result+"\n");
		}
		System.out.println(sb);
	}
}