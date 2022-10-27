import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            String name = br.readLine();
            if (name.contains("FBI")) {
                count++;
                bw.write(String.valueOf(i) + " ");
            }
        }
        if (count == 0) {
            bw.write("HE GOT AWAY!");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
