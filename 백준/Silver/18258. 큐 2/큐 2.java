import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String message = st.nextToken();
            int num = 0;
            if (message.equals("push"))
                num = Integer.parseInt(st.nextToken());

            switch (message) {
                case "push":
                    queue.add(num);
                    break;
                case "pop":
                    if (queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.poll() + "\n");
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty())
                        sb.append("1\n");
                    else
                        sb.append("0\n");
                    break;
                case "front":
                    if (queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.getFirst() + "\n");
                    break;
                case "back":
                    if (queue.isEmpty())
                        sb.append("-1\n");
                    else
                        sb.append(queue.getLast() + "\n");
                    break;
                default:
                    throw new AssertionError();
            }
        }

        System.out.println(sb);
    }
}