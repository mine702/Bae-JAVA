import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int A = 0;
        int B = 0;
        for (int i = 0; i < n; i++) {
            char pick = str.charAt(i);
            if (pick == 'A') {
                A++;
            } else if (pick == 'B') {
                B++;
            }
        }
        if (A > B) {
            bw.write("A");
        } else if (B > A) {
            bw.write("B");
        } else {
            bw.write("Tie");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}