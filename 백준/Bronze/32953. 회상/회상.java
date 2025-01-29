import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        int n = read(), m = read();
        while (n-- > 0) {
            int k = read(), i;
            while (k-- > 0) map.put(i = read(), map.getOrDefault(i, 0) + 1);
        }

        int cnt = 0;
        for (int v : map.values()) if (v >= m) cnt++;

        bw.write(String.valueOf(cnt));
        bw.flush();
    }

    private static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) n = (n << 3) + (n << 1) + (c & 15);

        return n;
    }

}