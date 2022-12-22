import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                Integer result = priorityQueueLowest.poll();
                if (result == null) {
                    sb.append("0\n");
                } else {
                    sb.append(result + "\n");
                }
            } else {
                priorityQueueLowest.add(number);
            }
        }
        System.out.print(sb);
        br.close();
    }
}