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
		for(int i = 0 ; i<n;i++) {
			sb.append("#");
		}
		System.out.println(sb);
	}
}