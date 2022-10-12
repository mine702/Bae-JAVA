import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            String game = br.readLine();
            String[] result = game.split(" ");
            for (int j = 0; j < result.length; j++) {
                sum += Integer.parseInt(result[j]);
            }
            if (sum == 4) {
                bw.write("E");
            } else if (sum == 3) {
                bw.write("A");
            } else if (sum == 2) {
                bw.write("B");
            } else if (sum == 1) {
                bw.write("C");
            } else {
                bw.write("D");
            }
            bw.write("\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }

}