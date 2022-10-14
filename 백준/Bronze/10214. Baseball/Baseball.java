import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        while (true) {
            if (n == 0) {
                break;
            } else {
                int SY = 0;
                int SK = 0;
                for (int i = 0; i < 9; i++) {
                    st = new StringTokenizer(br.readLine());
                    SY += Integer.parseInt(st.nextToken());
                    SK += Integer.parseInt(st.nextToken());
                }
                if (SY > SK) {
                    bw.write("Yonsei\n");
                } else if (SY < SK) {
                    bw.write("Korea\n");
                } else {
                    bw.write("Draw\n");
                }
                n--;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
