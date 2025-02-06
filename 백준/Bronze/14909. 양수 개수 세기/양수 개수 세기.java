import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int count = 0;
        while (st.hasMoreTokens()) {
            if (Integer.valueOf(st.nextToken()) > 0) {
                count++;
            }
        }

        System.out.println(count);

        br.close();
    }

}