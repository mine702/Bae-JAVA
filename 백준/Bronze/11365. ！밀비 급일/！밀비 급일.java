import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String words = br.readLine();
            if (words.equals("END")) {
                break;
            } else {
                for (int i = words.length() - 1; i >= 0; i--) {
                    bw.write(words.charAt(i));
                }
                bw.write("\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
