import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            int[] triangle = new int[3];
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0) {
                break;
            } else {
                triangle[0] = a;
                triangle[1] = b;
                triangle[2] = c;
                Arrays.sort(triangle);
                a = triangle[0];
                b = triangle[1];
                c = triangle[2];
                if (a * a + b * b == c * c) {
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
