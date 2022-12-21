import java.io.*;
import java.util.*;

public class Main {

    public static class inform {
        private String result;
        private int importance;

        public inform(String result, int importance) {
            this.result = result;
            this.importance = importance;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            Queue<inform> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());
            int countresult = 0;
            Integer[] document = new Integer[count];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < count; j++) {
                int importance = Integer.parseInt(st.nextToken());
                document[j] = importance;
                if (location == j) {
                    String result = "Yes";
                    queue.add(new inform(result, importance));
                } else {
                    String result = "No";
                    queue.add(new inform(result, importance));
                }
            }
            Arrays.sort(document, Collections.reverseOrder());
            while (true) {
                inform poll = queue.poll();
                if (document[countresult] != poll.importance) {
                    queue.add(poll);
                } else {
                    countresult++;
                    if (poll.result.equals("Yes")) {
                        sb.append(countresult+"\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}