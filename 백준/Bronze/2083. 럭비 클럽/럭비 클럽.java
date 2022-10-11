import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String words = br.readLine();
            if (words.equals("# 0 0")) {
                break;
            } else {
                String[] check = words.split(" ");
                if (Integer.valueOf(check[1]) > 17 || Integer.valueOf(check[2]) >= 80) {
                    bw.write(String.valueOf(check[0]) + " Senior\n");
                } else {
                    bw.write(String.valueOf(check[0]) + " Junior\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}