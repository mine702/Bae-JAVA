import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            sb.append(" ".repeat(N - 1 - i));
            sb.append("*".repeat(i));
            sb.append("*");
            sb.append("*".repeat(i) + "\n");
        }
        for (int i = 1; i < N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(N - 1 - i));
            sb.append("*");
            sb.append("*".repeat(N - 1 - i) + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}