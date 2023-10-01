import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str = br.readLine();
		switch (str) {
		case "SONGDO":
			sb.append("HIGHSCHOOL");
			break;
		case "CODE":
			sb.append("MASTER");
			break;
		case "2023":
			sb.append("0611");
			break;
		case "ALGORITHM":
			sb.append("CONTEST");
			break;
		}

		System.out.println(sb);
	}
}