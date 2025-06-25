import java.io.*;
import java.util.*;

public class Main {

    public static ArrayList<Integer>[] graph;
    public static boolean[] isCheck;
    public static int[] answer;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        graph = new ArrayList[N + 1];
        isCheck = new boolean[N + 1];
        answer = new int[N + 1];

        Arrays.fill(answer, -1);

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph[num1].add(num2);
            graph[num2].add(num1);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        DFS(start, 0);

        for (int i = 1; i <= N; i++) {
            sb.append(answer[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static void DFS(int start, int count) {
        isCheck[start] = true;
        answer[start] = count;

        for (int next : graph[start]) {
            if (!isCheck[next]) {
                DFS(next, count + 1);
            }
        }
    }
}