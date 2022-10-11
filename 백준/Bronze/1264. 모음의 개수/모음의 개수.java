import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String words = br.readLine();
            if (words.equals("#")) {
                break;
            } else {
                int count = 0;
                for (int i = 0; i < words.length(); i++) {
                    if (words.charAt(i) == 'a' || words.charAt(i) == 'e' || words.charAt(i) == 'i'
                            || words.charAt(i) == 'o' || words.charAt(i) == 'u' || words.charAt(i) == 'A'
                            || words.charAt(i) == 'E' || words.charAt(i) == 'I' || words.charAt(i) == 'O'
                            || words.charAt(i) == 'U') {
                        count++;
                    }
                }
                bw.write(String.valueOf(count) + "\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}