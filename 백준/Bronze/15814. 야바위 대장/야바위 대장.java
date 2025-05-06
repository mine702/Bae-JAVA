import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        String str = br.readLine();
        char[] chs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chs[i] = str.charAt(i);
        }

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            char ch = chs[B];
            chs[B] = chs[A];
            chs[A] = ch;
        }
        for (int i = 0; i < chs.length; i++) {
            sb.append(chs[i]);
        }
        System.out.println(sb);
    }
}