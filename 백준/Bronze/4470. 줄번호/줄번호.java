import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String words = br.readLine();
            bw.write(String.valueOf(i) + ". " + words + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}