import java.io.*;
import java.util.*;

public class Main {

    public static class Node {
        long num;
        int count;

        public Node(long num, int count) {
            this.num = num;
            this.count = count;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        Queue<Node> graph = new LinkedList<Node>();

        int mask = 0;
        int answer = -1;

        graph.offer(new Node(A, 1));
        mask |= (1 << A);

        while (true) {
            if (graph.isEmpty() || answer != -1)
                break;

            Node node = graph.poll();
            long num1 = node.num * 2;
            long num2 = Long.parseLong(String.valueOf(node.num) + "1");
            
            if (!(num1 >= 10_000_000_000L && (mask & (1 << num1)) != 0)) {
                if (num1 == B) {
                    answer = node.count + 1;
                    break;
                }
                graph.add(new Node(num1, node.count + 1));
                mask |= (1 << num1);
            }

            if (!(num2 >= 10_000_000_000L && (mask & (1 << num2)) != 0)) {
                if (num2 == B) {
                    answer = node.count + 1;
                    break;
                }
                graph.add(new Node(num2, node.count + 1));
                mask |= (1 << num2);
            }
        }

        sb.append(answer);
        System.out.println(sb);
    }

}
