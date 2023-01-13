import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i < n; i++) {
            sb.append(" ".repeat(n - i));
            sb.append("*".repeat(i) + "\n");
        }
        sb.append("*".repeat(n) + "\n");
        for (int i = 1; i < n; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(n - i) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}