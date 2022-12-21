import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            Deque<String> deque = new ArrayDeque<>();
            int succes = 0;
            Boolean location = true;
            String function = br.readLine();
            int Al = Integer.parseInt(br.readLine());
            String Astr = br.readLine();
            String[] result = Astr.replaceAll("[\\[\\]]", "").split(",");
            List<String> list = new ArrayList<>(Arrays.asList(result));
            deque.addAll(list);
            for (int j = 0; j < function.length(); j++) {
                char F = function.charAt(j);
                if (F == 'R') {
                    location = !location;
                } else {
                    if (deque.size() == 0) {
                        succes = 1;
                        break;
                    } else {
                        if (list.get(0) != "") {
                            if (location == true) {
                                deque.remove();
                            } else {
                                deque.removeLast();
                            }
                        } else {
                            succes = 1;
                            break;
                        }
                    }
                }
            }
            if (succes == 1) {
                sb.append("error\n");
            } else {
                if (location == true) {
                    String result1 = deque.toString();
                    sb.append(result1.replaceAll(" ", "") + "\n");
                } else {
                    sb.append("[");
                    for (int j = 0; j < deque.size(); j++) {
                        String result2 = deque.pollLast();
                        deque.addFirst(result2);
                        sb.append(result2);
                        if (j != deque.size() - 1) {
                            sb.append(",");
                        }
                    }
                    sb.append("]\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}