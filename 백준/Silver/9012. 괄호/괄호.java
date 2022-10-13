import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String bracket = br.readLine();
            for (int j = 0; j < bracket.length(); j++) {
                char a = bracket.charAt(j);
                if (stack.size() == 0) {
                    if (a == '(') {
                        stack.push(a);
                    } else {
                        stack.push(a);
                        break;
                    }
                } else {
                    if (stack.peek() == a) {
                        stack.push(a);
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.empty()) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }

}