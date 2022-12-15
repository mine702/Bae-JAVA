import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int print = N - 5;
        for (int i = print; i < N; i++) {
            char result = S.charAt(i);
            bw.write(result);
        }
        br.close();
        bw.flush();
        bw.close();
    }
}