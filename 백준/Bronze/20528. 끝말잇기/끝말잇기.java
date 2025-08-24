import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int read = 0;
        Character base = null;
        int ans = 1;

        while (read < N) {
            String line = br.readLine();
            if (line == null) break; // 안전장치
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens() && read < N) {
                String s = st.nextToken();        // s는 팰린드롬
                char c = s.charAt(0);             // == s.charAt(s.length()-1)
                if (base == null) base = c;
                else if (c != base) ans = 0;      // 기준 글자와 다르면 불가능
                read++;
            }
        }

        System.out.println(ans);
    }
}
