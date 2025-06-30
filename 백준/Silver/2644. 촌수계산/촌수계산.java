import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;
    public static List<Integer>[] list;
    public static boolean[] isCheck;

    public static class Node {
        int node;
        int count;

        Node(int node, int count) {
            this.node = node;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(br.readLine());
        list = new List[n + 1];
        isCheck = new boolean[n + 1];
        st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            list[x].add(y);
            list[y].add(x);
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(num1, 0));
        int answer = 0;

        while (true) {
            if (queue.isEmpty() || answer != 0)
                break;

            Node node = queue.poll();
            isCheck[node.node] = true;

            for (int i = 0; i < list[node.node].size(); i++) {
                int next = list[node.node].get(i);
                if (next == num2) {
                    answer = node.count + 1;
                    break;
                }

                if (isCheck[next])
                    continue;

                queue.add(new Node(next, node.count + 1));
            }
        }

        if (answer == 0)
            sb.append(-1);
        else
            sb.append(answer);

        System.out.println(sb);
    }
}
