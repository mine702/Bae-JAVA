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
			int K = Integer.parseInt(st.nextToken());			
			Double[] arr1 = new Double[N];
			Double Kscore = 0.0;
			for(int j = 0; j<N;j++) {
				st = new StringTokenizer(br.readLine());
				Double score = 0.0;
				int score1 = Integer.parseInt(st.nextToken());
				int score2 = Integer.parseInt(st.nextToken());
				int score3 = Integer.parseInt(st.nextToken());
				score = score1*0.35 + score2*0.45+ score3*0.2;
				arr1[j] = score;
				if(j == K-1) {
					Kscore = score;
				}
			}
			Arrays.sort(arr1, Collections.reverseOrder());
			int people = N/10;
			int w = (Arrays.asList(arr1).indexOf(Kscore)/people) + 1 ;
			switch(w) {
			case 1 :
				sb.append("#" + i +" "+ "A+" +"\n");
				break;
			case 2 :
				sb.append("#" + i +" "+ "A0" +"\n");
				break;
			case 3 :
				sb.append("#" + i +" "+ "A-" +"\n");
				break;
			case 4 :
				sb.append("#" + i +" "+ "B+" +"\n");
				break;
			case 5 :
				sb.append("#" + i +" "+ "B0" +"\n");
				break;
			case 6 :
				sb.append("#" + i +" "+ "B-" +"\n");
				break;
			case 7 :
				sb.append("#" + i +" "+ "C+" +"\n");
				break;
			case 8 :
				sb.append("#" + i +" "+ "C0" +"\n");
				break;
			case 9 :
				sb.append("#" + i +" "+ "C-" +"\n");
				break;
			case 10 :
				sb.append("#" + i +" "+ "D0" +"\n");
				break;
			}
		}
		System.out.println(sb);
	}
}