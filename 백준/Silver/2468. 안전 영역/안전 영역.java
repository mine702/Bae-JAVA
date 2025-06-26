import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static int[][] sides = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    public static int[][] area;
    public static int max;

    public static class Node {
        int y;
        int x;

        Node(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        area = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                area[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i <= 100; i++) {
            int num = BFS(i);
            if (num > max)
                max = num;

            else if (num == 0)
                break;
        }
        sb.append(max);
        System.out.println(sb);
    }

    public static int BFS(int start) {
        Queue<Node> queue = new LinkedList<Node>();
        boolean[][] isCheck = new boolean[area.length][area.length];
        int count = 0;

        for (int i = 0; i < area.length; i++) {
            for (int j = 0; j < area.length; j++) {
                if (start < area[i][j] && !isCheck[i][j]) {

                    queue.add(new Node(i, j));
                    isCheck[i][j] = true;

                    while (true) {
                        if (queue.isEmpty())
                            break;
                        Node node = queue.poll();

                        for (int k = 0; k < sides.length; k++) {
                            int y = node.y + sides[k][0];
                            int x = node.x + sides[k][1];
                            if ((0 <= y && y < area.length) && (0 <= x && x < area.length) && !isCheck[y][x]) {
                                if (area[y][x] > start) {
                                    isCheck[y][x] = true;
                                    queue.add(new Node(y, x));
                                }
                            }
                        }
                    }

                    count++;
                }
            }
        }
        return count;
    }
}