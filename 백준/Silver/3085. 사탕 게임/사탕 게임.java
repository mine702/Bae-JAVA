import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static char[][] array;
    public static int[][] locations = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    public static int answer = 0;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        array = new char[n][n];

        for (int i = 0; i < n; i++) {
            String canndy = br.readLine();

            for (int j = 0; j < n; j++) {
                array[i][j] = canndy.charAt(j);
            }
        }

        char[][] clone = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 4; k++) {
                    int x = i + locations[k][0];
                    int y = j + locations[k][1];
                    if (x < 0 || x > array.length - 1 || y < 0 || y > array.length - 1)
                        continue;
                    clone = copyArray(clone);
                    char before = clone[x][y];
                    clone[x][y] = clone[i][j];
                    clone[i][j] = before;
                    search(clone, x, y);
                }
            }
        }
        sb.append(answer);
        System.out.println(sb);
    }

    public static void search(char[][] clone, int i, int j) {
        int sum = 0;

        for (int a = 0; a < 2; a++) {
            int count;
            char ch;
            if (a == 0) {
                ch = clone[i][0];
                count = 1;
            } else {
                ch = clone[0][j];
                count = 1;
            }
            for (int b = 1; b < array.length; b++) {
                if (a == 0) {
                    if (ch == clone[i][b]) {
                        count++;
                    } else {
                        ch = clone[i][b];
                        if (sum < count)
                            sum = count;
                        count = 1;
                    }
                } else {
                    if (ch == clone[b][j]) {
                        count++;
                    } else {
                        ch = clone[b][j];
                        if (sum < count)
                            sum = count;
                        count = 1;
                    }
                }
            }

            if (sum < count)
                sum = count;
        }

        if (answer < sum)
            answer = sum;
    }

    public static char[][] copyArray(char[][] clone) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                clone[i][j] = array[i][j];
            }
        }
        return clone;
    }
}