import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            sb.append(" ".repeat(N - i));
            for (int j = 0; j < i; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        System.out.print(sb);
        br.close();
    }
}