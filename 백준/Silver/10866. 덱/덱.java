import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String order = st.nextToken();
            switch (order) {
                case "push_front": {
                    int a = Integer.parseInt(st.nextToken());
                    deque.push(a);
                    break;
                }
                case "push_back": {
                    int a = Integer.parseInt(st.nextToken());
                    deque.add(a);
                    break;
                }
                case "pop_front": {
                    try {
                        int a = deque.removeFirst();
                        bw.write(String.valueOf(a) + "\n");
                        break;
                    } catch (Exception e) {
                        bw.write("-1\n");
                        break;
                    }
                }
                case "pop_back": {
                    try {
                        int a = deque.removeLast();
                        bw.write(String.valueOf(a) + "\n");
                        break;
                    } catch (Exception e) {
                        bw.write("-1\n");
                        break;
                    }
                }
                case "size": {
                    bw.write(String.valueOf(deque.size()) + "\n");
                    break;
                }
                case "empty": {
                    if (deque.isEmpty()) {
                        bw.write("1\n");
                    } else {
                        bw.write("0\n");
                    }
                    break;
                }
                case "front": {
                    try {
                        int a = deque.getFirst();
                        bw.write(String.valueOf(a) + "\n");
                        break;
                    } catch (Exception e) {
                        bw.write("-1\n");
                        break;
                    }
                }
                case "back": {
                    try {
                        int a = deque.getLast();
                        bw.write(String.valueOf(a) + "\n");
                        break;
                    } catch (Exception e) {
                        bw.write("-1\n");
                        break;
                    }
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}