import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str = br.readLine();
		switch (str) {
		case "M":
			sb.append("MatKor");
			break;
		case "W":
			sb.append("WiCys");
			break;
		case "C":
			sb.append("CyKor");
			break;
		case "A":
			sb.append("AlKor");
			break;
		case "$":
			sb.append("$clear");
			break;

		}
		System.out.println(sb);

	}
}