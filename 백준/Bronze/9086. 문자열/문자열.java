import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String ap = br.readLine();
            char first = ap.charAt(0);
            char last = ap.charAt(ap.length() - 1);
            bw.write(first);
            bw.write(last);
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}