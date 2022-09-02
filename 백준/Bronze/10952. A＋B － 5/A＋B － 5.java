import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            if (N == 0 && X == 0) {
                break;
            }
            sb.append((N + X)).append("\n");
            st = new StringTokenizer(br.readLine());
        }
        System.out.println(sb);
        br.close();
        bw.flush();
        bw.close();
    }
}