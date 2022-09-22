import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashSet<String> count = new HashSet<>();
        String S = br.readLine();
        for (int i = 0; i < S.length(); i++) {
            for (int j = i + 1; j < S.length() + 1; j++) {
                String ms = S.substring(i, j);
                count.add(ms);
            }
        }
        bw.write(String.valueOf(count.size()));
        br.close();
        bw.flush();
        bw.close();
    }
}