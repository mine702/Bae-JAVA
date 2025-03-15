import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int[] ch = new int[26];
		int result = 0;
		
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();

		for(int i = 0; i < N ; i++)
			if((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122) ch[str.charAt(i) - 96]++;
		
		for(int i = 0 ; i < ch.length; i++)
			if(result < ch[i]) result = ch[i];
		
		sb.append(result);
		System.out.println(sb);
	}
}
