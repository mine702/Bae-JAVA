import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        String[] parts = s.split(":");
        int[] v = new int[3];
        for (int i = 0; i < 3; i++) v[i] = Integer.parseInt(parts[i]);

        int[][] perms = {
            {0,1,2},{0,2,1},
            {1,0,2},{1,2,0},
            {2,0,1},{2,1,0}
        };

        int count = 0;
        for (int[] p : perms) {
            int h = v[p[0]], m = v[p[1]], s2 = v[p[2]];
            if (1 <= h && h <= 12 && 0 <= m && m <= 59 && 0 <= s2 && s2 <= 59) {
                count++;
            }
        }
        System.out.println(count);
    }
}
