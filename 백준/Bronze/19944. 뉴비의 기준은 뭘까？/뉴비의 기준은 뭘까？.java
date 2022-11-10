import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if (M < 3) {
            bw.write("NEWBIE!");
        } else {
            if (M <= N) {
                bw.write("OLDBIE!");
            } else {
                bw.write("TLE!");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
