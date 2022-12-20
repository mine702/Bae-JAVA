import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int[] aws = new int[N];
        int count = 0;
        int number = 1;
        for (int i = 0; i < N; i++) {
            aws[i] = Integer.parseInt(br.readLine());
        }
        while (true) {
            if (count == N) {
                break;
            } else if (number > N + 1) {
                sb.delete(0, sb.length());
                sb.append("NO");
                break;
            } else {
                if (stack.empty()) {
                    stack.push(number);
                    number++;
                    sb.append("+\n");
                } else if (stack.peek() == aws[count]) {
                    sb.append("-\n");
                    stack.pop();
                    count++;
                } else {
                    stack.push(number);
                    number++;
                    sb.append("+\n");
                }
            }
        }
        System.out.print(sb);
        br.close();
    }
}