import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            boolean Mack = false;
            boolean Zack = false;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 10; j++) {
                int number = Integer.parseInt(st.nextToken());
                if (number == 18) {
                    Mack = true;
                } else if (number == 17) {
                    Zack = true;
                }
                bw.write(String.valueOf(number) + " ");
            }
            bw.write("\n");
            if (Mack == true && Zack == true) {
                bw.write("both\n");
            } else {
                if (Mack == true) {
                    bw.write("mack\n");
                } else if (Zack == true) {
                    bw.write("zack\n");
                } else {
                    bw.write("none\n");
                }
            }
            bw.write("\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
