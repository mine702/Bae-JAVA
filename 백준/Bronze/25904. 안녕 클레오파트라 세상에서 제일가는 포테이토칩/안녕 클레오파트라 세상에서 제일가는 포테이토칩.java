import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int[] member = new int[N];
        int result = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            member[i] = Integer.parseInt(st.nextToken());
        }
        while (true) {
            for (int i = 1; i <= N; i++) {
                if (X <= member[i - 1]) {
                    X++;
                } else {
                    result = i;
                    break;
                }
            }
            if (result != 0) {
                break;
            }
        }
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }
}
