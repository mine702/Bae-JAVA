import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String words = br.readLine();
        for (int i = 1; i <= words.length(); i++) {
            if (i % 10 == 0) {
                bw.write(words.charAt(i - 1) + "\n");
            } else {
                bw.write(words.charAt(i - 1));
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
