import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String words = br.readLine();
        int result = 1;
        for (int i = 0; i < words.length() / 2; i++) {
            char A = words.charAt(i);
            char B = words.charAt(words.length() - i - 1);
            if (A != B) {
                result = 0;
                break;
            }
        }
        bw.write(String.valueOf(result));
        br.close();
        bw.flush();
        bw.close();
    }

}