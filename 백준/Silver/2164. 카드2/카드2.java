import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (true) {
            if (queue.size() == 1) {
                break;
            } else {
                queue.remove();
                queue.add(queue.poll());
            }
        }
        bw.write(String.valueOf(queue.peek()));
        br.close();
        bw.flush();
        bw.close();
    }
}