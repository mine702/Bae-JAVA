import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if (N == 0) {
            bw.write("YONSEI");
        } else if (N == 1) {
            bw.write("Leading the Way to the Future");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
