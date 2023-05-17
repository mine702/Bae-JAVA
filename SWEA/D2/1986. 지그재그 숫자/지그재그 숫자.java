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
			int N = Integer.parseInt(br.readLine());
			int result = 0;
			for(int j = 1; j <= N;j++) {
				if(j==1) {
					result += j;
				}else {
					if(j%2==0) {
						result -= j;
					}else {
						result += j;
					}
				}
			}
			sb.append("#"+i+" "+result+"\n");
		}
		System.out.println(sb);
	}
}