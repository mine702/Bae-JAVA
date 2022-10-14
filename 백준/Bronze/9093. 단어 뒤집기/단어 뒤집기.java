import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String words = br.readLine();
            String[] ArraysWord = words.split(" ");
            for (int j = 0; j < ArraysWord.length; j++) {
                for (int k = ArraysWord[j].length() - 1; k >= 0; k--) {
                    bw.write(ArraysWord[j].charAt(k));
                }
                bw.write(" ");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
