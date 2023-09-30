import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			switch (str) {
			case "Algorithm":
				sb.append("204");
				break;
			case "DataAnalysis":
				sb.append("207");
				break;
			case "ArtificialIntelligence":
				sb.append("302");
				break;
			case "CyberSecurity":
				sb.append("B101");
				break;
			case "Network":
				sb.append("303");
				break;
			case "Startup":
				sb.append("501");
				break;
			case "TestStrategy":
				sb.append("105");
				break;
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}