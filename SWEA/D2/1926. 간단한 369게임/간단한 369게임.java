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
			String result = "";
			int n1 = i;
			while(true) {
				int n2 = n1%10;
				n1 = n1/10;
				if(n2 == 3 || n2 == 6 || n2 == 9) {
					result += "-";
				}
				if(n1 == 0) {
					break;
				}
			}
			if(result == "") {
				sb.append(i + " ");
			}else {
				sb.append(result + " ");
			}			
		}
		System.out.println(sb);
	}
}