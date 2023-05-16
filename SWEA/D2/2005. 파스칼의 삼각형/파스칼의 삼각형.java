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
			sb.append("#"+i+"\n");
			int N = Integer.parseInt(br.readLine());
			ArrayList<Integer> a1 = new ArrayList<Integer>();
			for(int j = 1; j <= N; j++) {
				ArrayList<Integer> a2 = new ArrayList<Integer>();
				if(j==1) {
					a2.add(1);
					sb.append("1");
				}else {
					for(int k = 0;k<j;k++) {
						if(k==0 || k==j-1) {
							a2.add(1);
							sb.append("1 ");
						}else {
							int num = a1.get(k-1)+a1.get(k);
							sb.append(num+" ");
							a2.add(num);
						}						
					}
				}
				sb.append("\n");
				a1.clear();
				a1.addAll(a2);
			}
		}
		System.out.println(sb);
	}
}