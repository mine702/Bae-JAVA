import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;
        while ((str=br.readLine()) != null) {
            st = new StringTokenizer(str);
            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            sb.append((N + X)).append("\n");
        }
        System.out.println(sb);
    }
}