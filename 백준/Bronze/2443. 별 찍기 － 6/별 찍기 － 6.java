import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        for (int i = 0; i < N; i++) {
            sb.append(" ".repeat(i));
            sb.append("*".repeat(2 * N - count) + "\n");
            count += 2;
        }
        System.out.print(sb);
        br.close();
    }
}