import java.io.*;
import java.util.*;

public class Main {
    public static class point implements Comparable<point> {
        private int x;
        private int y;

        point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Main.point o) {
            if (o.y == this.y) {
                return this.x - o.x;
            } else {
                return this.y - o.y;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        point[] result = new point[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            result[i] = new point(x, y);
        }
        Arrays.sort(result);
        for (int i = 0; i < N; i++) {
            sb.append(result[i].x + " " + result[i].y + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}