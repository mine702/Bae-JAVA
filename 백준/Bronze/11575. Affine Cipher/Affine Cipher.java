import java.io.*;
import java.util.*;

public class Main {
    private static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) { this.in = is; }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c, sgn = 1, val = 0;
            do { c = read(); } while (c <= 32);
            if (c == '-') { sgn = -1; c = read(); }
            while (c > 32) {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sgn;
        }

        String next() throws IOException {
            int c;
            do { c = read(); } while (c <= 32);
            StringBuilder sb = new StringBuilder();
            while (c > 32) {
                sb.append((char)c);
                c = read();
            }
            return sb.toString();
        }
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int T = fs.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            String s = fs.next();

            int aa = a % 26;
            int bb = b % 26;

            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i] - 'A';
                int y = (aa * x + bb) % 26;
                arr[i] = (char) ('A' + y);
            }
            out.println(new String(arr));
        }
        out.flush();
    }
}
