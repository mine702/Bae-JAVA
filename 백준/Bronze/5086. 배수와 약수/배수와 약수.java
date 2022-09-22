import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) {
                break;
            } else {
                if (N < M) {
                    if (M % N == 0) {
                        bw.write("factor\n");
                    } else {
                        bw.write("neither\n");
                    }
                } else {
                    if (N % M == 0) {
                        bw.write("multiple\n");
                    } else {
                        bw.write("neither\n");
                    }
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}