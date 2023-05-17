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
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] arr1 = new int[N][N];
			for(int j = 0;j<N;j++) {
				st = new StringTokenizer(br.readLine());
				for(int k = 0;k<N;k++) {
					arr1[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			int result = 0;
			int breaktime = N-M+1;
			for(int j = 0;j<N;j++) {
				if(j==breaktime) {
					break;
				}
				for(int k = 0;k<N;k++) {					
					if(k == breaktime) {
						break;
					}
					int b = 0;					
					for(int l = 0;l<M;l++) {
						for(int h = 0;h<M;h++) {
							
							int a = arr1[j+l][k+h];
							b += a;
						}
					}
					if(b>result) {
						result = b;
					}
				}				
			}
			sb.append("#"+i+" "+result+"\n");
		}
		System.out.println(sb);
	}
}