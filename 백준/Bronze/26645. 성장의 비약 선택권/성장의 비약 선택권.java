import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        if (N >= 229) {
            bw.write("4");
        } else if (N >= 218) {
            bw.write("3");
        } else if (N >= 206) {
            bw.write("2");
        } else {
            bw.write("1");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}