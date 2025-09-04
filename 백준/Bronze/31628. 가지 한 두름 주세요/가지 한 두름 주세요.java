import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] grid = new String[10][10];

        for (int r = 0; r < 10; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int c = 0; c < 10; c++) {
                grid[r][c] = st.nextToken();
            }
        }

        boolean ok = false;

        // 행 검사
        for (int r = 0; r < 10 && !ok; r++) {
            boolean same = true;
            for (int c = 1; c < 10; c++) {
                if (!grid[r][c].equals(grid[r][0])) {
                    same = false;
                    break;
                }
            }
            if (same) ok = true;
        }

        // 열 검사
        for (int c = 0; c < 10 && !ok; c++) {
            boolean same = true;
            for (int r = 1; r < 10; r++) {
                if (!grid[r][c].equals(grid[0][c])) {
                    same = false;
                    break;
                }
            }
            if (same) ok = true;
        }

        System.out.println(ok ? 1 : 0);
    }
}
