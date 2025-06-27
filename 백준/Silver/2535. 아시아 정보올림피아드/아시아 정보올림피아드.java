import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static StringTokenizer st;

    public static class Node implements Comparable<Node> {
        int area;
        int num;
        int score;

        Node(int area, int num, int score) {
            this.area = area;
            this.num = num;
            this.score = score;
        }

        @Override
        public int compareTo(Node o) {
            return o.score - this.score;
        }
    }

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        List<Node> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int area = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            int score = Integer.parseInt(st.nextToken());

            list.add(new Node(area, num, score));
        }

        Collections.sort(list);

        int[] isCheck = new int[101];
        int count = 0;
        for (int i = 0; i < list.size(); i++) {

            if (count == 3)
                break;
                
            int area = list.get(i).area;
            int num = list.get(i).num;

            if (isCheck[area] < 2) {
                sb.append(area + " " + num + "\n");
                isCheck[area]++;
                count++;
            }

        }
        System.out.println(sb);
    }
}
