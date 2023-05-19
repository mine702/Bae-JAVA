import java.io.*;
import java.util.*;

public class Main {
    static Boolean[] bl;
    static ArrayList<ArrayList<Integer>> al;
    static int result = 0;
    static int N;

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        al = new ArrayList<>();
        bl = new Boolean[N];
        for (int i = 0; i < N; i++) {
            al.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            al.get(a).add(b);
            al.get(b).add(a);
        }

        for (int i = 0; i < N; i++) {
            Arrays.fill(bl, false);
            DFS(i, 1);
            if (result == 1) {
                break;
            }
        }
        sb.append(result);
        System.out.println(sb);
    }

    public static void DFS(int num, int count) {
        if (bl[num] == true) {
            return;
        } else if (count == 5) {
            result = 1;
            return;
        } else {
            bl[num] = true;
            for (int i = 0; i < al.get(num).size(); i++) {
                int a = al.get(num).get(i);
                if (bl[a] == false) {
                    DFS(a, count + 1);
                }
            }
            // 추가된 부분
            bl[num] = false; // 백트래킹
        }
    }
}
