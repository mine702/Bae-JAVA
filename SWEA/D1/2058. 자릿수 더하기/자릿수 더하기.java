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
		int sum = 0;
		while(true) {			
			int result = n%10;			
			if(result == 0) {
				break;
			}
			n = n/10;
			sum += result;
		}
		sb.append(sum);
		System.out.println(sb);
	}
}