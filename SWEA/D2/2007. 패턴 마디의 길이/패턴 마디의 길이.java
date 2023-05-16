import java.util.Scanner;

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
		for (int i = 1; i <= n; i++) {
            String str = br.readLine(); // 길이가 30인 문자열 입력
            for (int j = 1; j <= 10; j++) { // 마디의 최대 길이는 10이므로 1부터 10까지 반복
            	String s1 = str.substring(0,j);
            	String s2 = str.substring(j,j*2);
                if (s1.equals(s2)) {
                    sb.append("#" + i + " " + j+"\n"); // 결과 출력
                    break;
                }
            }
        }
		System.out.println(sb);
	}
}
