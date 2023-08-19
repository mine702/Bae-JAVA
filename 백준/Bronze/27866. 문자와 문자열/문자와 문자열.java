import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		String S = br.readLine();
		int i = Integer.parseInt(br.readLine());
		
		sb.append(S.charAt(i - 1));
		System.out.println(sb);
	}

	
}