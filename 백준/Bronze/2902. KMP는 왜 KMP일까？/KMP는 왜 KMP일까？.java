import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String answer = "";
		for(int i = 0; i < str.length() ; i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				answer += str.charAt(i);
		}
        sb.append(answer);
		System.out.println(sb);
	}
}