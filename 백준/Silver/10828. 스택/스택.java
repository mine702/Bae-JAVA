import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            if (order.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (order.equals("pop")) {
                try {
                    int number = stack.peek();
                    bw.write(String.valueOf(number) + "\n");
                    stack.pop();
                } catch (Exception e) {
                    bw.write("-1\n");
                }
            } else if (order.equals("size")) {
                bw.write(String.valueOf(stack.size()) + "\n");
            } else if (order.equals("empty")) {
                if (stack.empty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (order.equals("top")) {
                try {
                    bw.write(String.valueOf(stack.peek()) + "\n");
                } catch (Exception e) {
                    bw.write("-1\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}