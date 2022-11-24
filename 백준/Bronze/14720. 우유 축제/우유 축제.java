import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int now = 0;
        int cnt = 0;
        int[] milk = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            milk[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            if (now == milk[i]) {
                cnt++;
                now++;
                if (now == 3) {
                    now = 0;
                }
            }
        }
        bw.write(String.valueOf(cnt));
        br.close();
        bw.flush();
        bw.close();
    }
}