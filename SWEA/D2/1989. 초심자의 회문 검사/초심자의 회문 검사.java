/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
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
			String str = br.readLine();
			int result = 1;
			for(int j = 0; j<=str.length()/2;j++) {				
				if(str.charAt(j) != str.charAt(str.length()-j-1)) {
					result = 0;
					break;
				}
			}
			sb.append("#"+i +" "+  result+"\n");
		}
		System.out.println(sb);
	}
}