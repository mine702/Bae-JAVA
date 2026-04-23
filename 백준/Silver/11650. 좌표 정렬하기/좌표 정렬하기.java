import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static class Node implements Comparable<Node> {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Node node) {
            if (this.x < node.x)
                return -1;
            else if (this.x > node.x)
                return 1;
            else if (this.x == node.x) {
                if (this.y < node.y)
                    return -1;
                else
                    return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        TreeSet<Node> list = new TreeSet<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list.add(new Node(x, y));
        }

        for (Node node : list) {
            sb.append(node.x + " " + node.y + "\n");
        }
        System.out.println(sb);
    }
}