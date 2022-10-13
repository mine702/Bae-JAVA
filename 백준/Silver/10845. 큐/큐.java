import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int number = -1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push":
                    number = Integer.parseInt(st.nextToken());
                    queue.add(number);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(String.valueOf(queue.poll()) + "\n");
                    }
                    break;
                case "size":
                    bw.write(String.valueOf(queue.size()) + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(String.valueOf(queue.peek()) + "\n");
                    }
                    break;
                case "back":
                    if (queue.size() > 0) {
                        bw.write(String.valueOf(number) + "\n");
                    } else {
                        bw.write("-1\n");
                    }
                    break;
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
