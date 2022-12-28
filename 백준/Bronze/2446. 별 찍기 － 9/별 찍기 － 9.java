import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        N = N - 1;
        for (int i = 0; i < N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*");
            sb.append("*".repeat(N - i));
            sb.append("*".repeat(N - i));
            sb.append("\n");
        }
        sb.append(" ".repeat(N));
        sb.append("*\n");
        for (int i = N - 1; i >= 0; i--) {
            sb.append(" ".repeat(i));
            sb.append("*");
            sb.append("*".repeat(N - i));
            sb.append("*".repeat(N - i));
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}