import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            boolean flag = false;
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (flag)
                    break;

                char ch = str.charAt(j);

                if (ch == '(')
                    stack.add('(');
                else if (ch == ')') {
                    if (stack.isEmpty()) {
                        flag = true;
                        break;
                    }

                    stack.pop();
                }
            }

            if (flag || !stack.isEmpty())
                sb.append("NO\n");
            else
                sb.append("YES\n");
        }
        System.out.println(sb);
    }
}