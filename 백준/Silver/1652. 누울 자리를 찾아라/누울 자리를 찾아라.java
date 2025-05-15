import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int row = 0;
        int column = 0;

        int[][] nums = new int[N][N];
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                if (str.charAt(j) == '.')
                    nums[i][j] = 1;
                else
                    nums[i][j] = 0;
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                int num = nums[j][i];
                if (num == 1)
                    count++;
                else
                    count = 0;

                if (count == 2) {
                    column++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 0; j < N; j++) {
                int num = nums[i][j];
                if (num == 1)
                    count++;
                else
                    count = 0;

                if (count == 2) {
                    row++;
                }
            }
        }
        sb.append(row + " " + column);
        System.out.println(sb);
    }
}
