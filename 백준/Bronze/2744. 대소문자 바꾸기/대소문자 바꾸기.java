import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String ap = br.readLine();
        for (int i = 0; i < ap.length(); i++) {
            int a = ap.charAt(i);
            if (a >= 65 && a <= 90) {
                a += 32;
            } else if (a >= 97 && a <= 122) {
                a -= 32;
            }
            bw.write(String.valueOf((char) a));
        }
        br.close();
        bw.flush();
        bw.close();
    }
}