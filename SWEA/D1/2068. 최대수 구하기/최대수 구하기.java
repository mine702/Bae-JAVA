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
		
		for(int i = 1;i<=n;i++) {
			int result = 0;
			st = new StringTokenizer(br.readLine());
			for(int j = 0;j<10;j++) {
				int num = Integer.parseInt(st.nextToken());
				if(result < num) {
					result = num;
				}
			}
			sb.append("#"+i+" "+result+"\n");
		}		
		br.close();	
		System.out.println(sb);
	}
}