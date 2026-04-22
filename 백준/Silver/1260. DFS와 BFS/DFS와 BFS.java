import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static List<Integer>[] list;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];

        for (int i = 0; i < list.length; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            list[start].add(end);
            list[end].add(start);
        }

        DFS(V);
        BFS(V);

        System.out.println(sb);
    }

    public static void DFS(int startNode) {
        boolean[] isCheck = new boolean[list.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(startNode);

        while (true) {
            if (stack.isEmpty())
                break;

            int node = stack.pop();
            if (isCheck[node])
                continue;
            sb.append(node + " ");
            isCheck[node] = true;

            List<Integer> nodes = new ArrayList<>();

            for (int i = 0; i < list[node].size(); i++) {
                int nextNode = list[node].get(i);

                if (isCheck[nextNode])
                    continue;

                nodes.add(nextNode);
            }

            Collections.sort(nodes, Collections.reverseOrder());

            for (int i = 0; i < nodes.size(); i++) {
                int nextNode = nodes.get(i);
                stack.add(nextNode);
            }
        }

        sb.append("\n");
    }

    public static void BFS(int startNode) {
        boolean[] isCheck = new boolean[list.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startNode);
        while (true) {
            if (queue.isEmpty())
                break;

            int node = queue.poll();
            if (isCheck[node])
                continue;

            sb.append(node + " ");
            isCheck[node] = true;

            List<Integer> nodes = new ArrayList<>();

            for (int i = 0; i < list[node].size(); i++) {
                int nextNode = list[node].get(i);
                if (isCheck[nextNode])
                    continue;

                nodes.add(nextNode);
            }

            Collections.sort(nodes);

            for (int i = 0; i < nodes.size(); i++) {
                queue.add(nodes.get(i));
            }
        }
    }
}