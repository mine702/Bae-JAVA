import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] check = new int[26];
        String ap = br.readLine();
        for (int i = 0; i < ap.length(); i++) {
            int a = ap.charAt(i);
            for (int j = 0; j < check.length; j++) {
                if (a - 97 == j) {
                    check[j] += 1;
                }
            }
        }
        for (int i = 0; i < check.length; i++) {
            bw.write(String.valueOf(check[i]) + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}