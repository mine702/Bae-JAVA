import java.io.*;
import java.util.*;

public class Solution
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st ;
		
		String str = br.readLine();
		for(int i = 0 ;i<str.length();i++) {
			char result = str.charAt(i);
			if((int)result>=97 && (int)result<=122 ) {
				char m = (char)((int)result-32);
				sb.append(m);
			}else {
				sb.append(result);
			}
		}
		System.out.println(sb);
	}
}